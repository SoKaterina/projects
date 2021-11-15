package com.MyProg.bookclass.author;

import java.util.Objects;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
    }

    public String toString(){
        return "Author {name = "+name+", email = "+email+", gender = "+gender+"}";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getName(),author.getName()) && Objects.equals(getEmail(),author.getEmail()) && Objects.equals(getGender(),author.getGender());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(),getEmail(),getGender());
    }
}
