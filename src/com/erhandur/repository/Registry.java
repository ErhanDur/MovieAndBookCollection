package com.erhandur.repository;

import com.erhandur.subclasses.Book;
import com.erhandur.domain.Item;
import com.erhandur.subclasses.Movie;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }




    public Item createItem (String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Lord Of the Rings");
        movie.setPrice(25.00);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(20.00);
        book.setTitle("Kuyucaklı Yusuf");
        items.put("Book", book);

        Movie anotherMovie = new Movie();
        movie.setTitle("Back to the Fucture");
        movie.setPrice(50.00);
        movie.setRuntime("3 hours");
        items.put("AnotherMovie", anotherMovie);


    }

}
