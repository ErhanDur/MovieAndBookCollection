package com.erhandur.subclasses;

import com.erhandur.domain.Item;

public class Book extends Item {

    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


}
