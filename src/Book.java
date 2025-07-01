public class Book { 
    public String title;
    public String author;
    public boolean isBorrowed = false;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public boolean getBorrowBook() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Titel: " + title + ", Autor: " + author + ", Status: " + (isBorrowed ? "ausgeliehen" : "verfügbar");
    }
}