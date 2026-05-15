import java.util.ArrayList;
public class Library {

    private ArrayList<Book> collection;

    public Library() {
        collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < this.collection.size(); i++) {
            if (this.collection.get(i).getISBN().equals(ISBN)) {
                this.collection.remove(i);
                i = this.collection.size() + 1;
            }

        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> x = new ArrayList<>();
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getTitle().equalsIgnoreCase(title)) {
                x.add(collection.get(i));
            }
        }
        Book[] y = new Book[x.size()];
        for (int i = 0; i < x.size(); i++) {
            y[i] = x.get(i);
        }
        return y;
    }
    public Book[] displayBooks() {
        return collection.toArray(new Book[0]);
    }








}