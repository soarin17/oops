import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Base abstract class
abstract class Item {
    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int maxCheckoutDays) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = maxCheckoutDays;
    }

    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public int getMaxCheckoutDays() { return maxCheckoutDays; }
}

class Book extends Item {
    private String author;
    private int pages;

    public Book(String id, String title, LocalDate publicationDate, String author, int pages) {
        super(id, title, publicationDate, 21); // Books: 21-day checkout
        this.author = author;
        this.pages = pages;
    }
}
