public class LibraryBooks {
    private int availableBooks;
    
    public void addBooks(int books) {
        if(books > 0) {
            availableBooks += books;
        } else {
            System.out.println("Cannot add negative books!");
        }
    }
    
    public void issueBook() {
        if(availableBooks > 0) {
            availableBooks--;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("No books available!");
        }
    }
    
    public int getAvailableBooks() {
        return availableBooks;
    }
    
    public static void main(String[] args) {
        LibraryBooks library = new LibraryBooks();
        library.addBooks(100);
        library.issueBook();
        System.out.println("Available books: " + library.getAvailableBooks());
    }
}