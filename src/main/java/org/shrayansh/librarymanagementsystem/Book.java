package org.shrayansh.librarymanagementsystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.isAvailable=true;
    }

    public void checkOut(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("Book is checked out with ISBN : "+ISBN);
        }else{
            System.out.println("Book is not available with ISBN : "+ISBN);
        }
    }

    public void returnBook(){
        if(isAvailable){
            System.out.println("Book was not checkout with ISBN : "+ISBN);
        }else{
            isAvailable=true;
            System.out.println("Book is returned with ISBN : "+ISBN);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
