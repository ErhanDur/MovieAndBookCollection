package com.erhandur.main;

import com.erhandur.repository.Registry;
import com.erhandur.subclasses.Movie;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");


        System.out.println(movie);

        Movie anotherMovie = (Movie) registry.createItem("AnotherMovie");
        anotherMovie.setTitle("Batman vs SuperMan");


        System.out.println(anotherMovie);

        Movie otherMovie = (Movie) registry.createItem("AnotherMovie");
        otherMovie.setTitle("Batman vs SuperMan 2");

        System.out.println(otherMovie);





    }
}
