package org.example.test;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors; // array: chứa nhiều đối tượng author
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors; // in ra tất cả, toàn bộ thông tin của các author trong authors[]
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // C++ => function: hàm => gần với toán
    public String getAuthorNames() { // method => biểu diễn hành vi của 1 đối tượng
        String authorNames = "";
        for (int i=0; i<authors.length; i++) {
//            Author author = authors[i]; // 0, 1, 2, 3,...
//            authorNames += author.getName();
            authorNames += authors[i].getName() + ", ";
            System.out.println("loop " + (i + 1) + ": " + authorNames);
        }

        return authorNames;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
