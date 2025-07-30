package com.cba.ems.test;

public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newprice) {
        this.price = newprice;
    }
    public static void main(String[] args){
        Book b1=new Book("Intro to Java","Watson",300);
        System.out.println(b1);
        // System.out.println(b1.getTitle());
        // System.out.println(b1.getAuthor());
        // System.out.println(b1.getPrice());
        // b1.setPrice(400);
        // System.out.println(b1.getPrice());
    }
}
