package com.MyProg.BookClass;

import com.MyProg.BookClass.Author.Author;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getName(),book.getName()) && Arrays.equals(authors, book.authors) && price==book.price && qty == book.qty;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + Objects.hashCode(name);
        result = 31*result + authors.hashCode();
        result = 31*result + Long.valueOf(Double.doubleToLongBits(price)).hashCode();
        result = 31*result + qty;

        return result;
    }
}

