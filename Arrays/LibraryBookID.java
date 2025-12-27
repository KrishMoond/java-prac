public class LibraryBookID {
    public static void main(String[] args) {
        int[] bookIDs = {101, 205, 308, 412, 567, 623};
        int searchID = 308;
        boolean found = false;
        
        for(int i = 0; i < bookIDs.length; i++) {
            if(bookIDs[i] == searchID) {
                found = true;
                break;
            }
        }
        
        if(found) {
            System.out.println("Book ID " + searchID + " exists in library");
        } else {
            System.out.println("Book ID " + searchID + " not found");
        }
    }
}