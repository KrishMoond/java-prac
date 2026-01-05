class BookLazy {
    private String title;
    
    public BookLazy(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}

public class LibraryLazy {
    private String name;
    private BookLazy[] books; // Not created immediately
    
    public LibraryLazy(String name) {
        this.name = name;
        System.out.println("Library created without books");
    }
    // Create books only when required
    private void loadBooks() {
        if(books == null) {
            books = new BookLazy[5];
            books[0] = new BookLazy("Java Programming");
            books[1] = new BookLazy("Python Basics");
            books[2] = new BookLazy("Data Structures");
            books[3] = new BookLazy("Web Development");
            books[4] = new BookLazy("Machine Learning");
            System.out.println("Books loaded when needed!");
        }
    }
    
    public void showBooks() {
        loadBooks(); // Books created only when this method is called
        System.out.println("Books in " + name + ":");
        for(int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i].getTitle());
        }
    }
    
    public static void main(String[] args) {
        LibraryLazy library = new LibraryLazy("City Library");
        System.out.println("Library created, but books not loaded yet");
        
        library.showBooks(); // Now books are created
    }
}