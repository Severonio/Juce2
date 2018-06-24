package Biblioteka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private final String title;
    private final String author;
    private final String publisherNumb;
    private final String description;
    private final String publisherName;
    private Date yearPubl;

    public Book(String title, String author, String publisherNumb, String description, String publisherName) {
        this.title = title;
        this.author = author;
        this.publisherNumb = publisherNumb;
        this.description = description;
        this.publisherName = publisherName;
        this.yearPubl = null;
    }
    public Book(String title, String author, String publisherNumb, String description, String publisherName, String year) throws ParseException {
        this(title, author, publisherNumb, description, publisherName);
        this.yearPubl(year);
    }

    private void yearPubl(String year) throws ParseException {
        yearPubl = new SimpleDateFormat("yyyy").parse(year);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisherNumb() {
        return publisherNumb;
    }

    public String getDescription() {
        return description;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Date getYearPubl() {
        return yearPubl;
    }

    public void setYearPubl(Date yearPubl) {
        this.yearPubl = yearPubl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisherNumb='" + publisherNumb + '\'' +
                ", description=" + description +
                ", publisherName='" + publisherName + '\'' +
                ", yearPubl=" + yearPubl +
                '}';
    }
}
