class Book {
    private String title;
    
    public Book(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
}

public class LibraryBooks {
    private String name;
    private Book[] books;
    
    public LibraryBooks(String name) {
        this.name = name;
        loadBooks(); // Books loaded immediately
    }
    
    private void loadBooks() {
        books = new Book[23];
        books[0] = new Book("Java Programming");
        books[1] = new Book("Python Basics");
        books[2] = new Book("Data Structures");
        books[3] = new Book("Algorithms");
        books[4] = new Book("Database Systems");
        books[5] = new Book("Web Development");
        books[6] = new Book("Machine Learning");
        books[7] = new Book("Artificial Intelligence");
        books[8] = new Book("Computer Networks");
        books[9] = new Book("Operating Systems");
        books[10] = new Book("Software Engineering");
        books[11] = new Book("Mobile Development");
        books[12] = new Book("Cloud Computing");
        books[13] = new Book("Cybersecurity");
        books[14] = new Book("Game Development");
        books[15] = new Book("UI/UX Design");
        books[16] = new Book("Digital Marketing");
        books[17] = new Book("Project Management");
        books[18] = new Book("Business Analysis");
        books[19] = new Book("Quality Assurance");
        books[20] = new Book("DevOps");
        books[21] = new Book("Blockchain");
        books[22] = new Book("IoT Systems");
        System.out.println("All 23 books loaded!");
    }
    
    public void displayBooks() {
        System.out.println("Library: " + name);
        for(int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i].getTitle());
        }
    }
    
    public static void main(String[] args) {
        LibraryBooks library = new LibraryBooks("City Library");
        library.displayBooks();
    }
}