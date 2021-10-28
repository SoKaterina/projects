package com.MyProg.BookClass;

import com.MyProg.BookClass.Author.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        String sBook = "Book {name = "+name+", authors =[ ";
        for(int i = 0; i< authors.length;i++) {
            sBook += "{"+authors[i].toString()+"}, ";
        }
        sBook +="], price = "+price+", qty = "+qty+"}";
        return sBook;
    }

    public String getAuthorNames(){
        String sName = "";
        for(int i = 0; i< authors.length;i++) {
            sName += "Author"+(i+1)+" "+authors[i].getName();
        }
        return sName;
    }
}

