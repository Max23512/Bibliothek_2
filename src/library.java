import java.util.ArrayList;

public class library {
    ArrayList<Book> bib = new ArrayList<>();
    

    public library() {}

    public void addBook(Book book) {
        bib.add(book);
    }

    public void showAllBooks() {
        for (int i = 0; i < bib.size(); i++) {
            System.out.println(bib.get(i).toString());
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < bib.size(); i++) {
            if (title.equalsIgnoreCase(bib.get(i).title)) {
                bib.get(i).borrowBook();
            }
        }
    }

    public void returnBook(String title) {
        for (int i = 0; i < bib.size(); i++) {
            if (title.equalsIgnoreCase(bib.get(i).title)) {
                bib.get(i).returnBook();
            }
        }
    }
}