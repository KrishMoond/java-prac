class StoreInventory {
    public static void main(String[] args) {
        int stockQuantity = 8;
        boolean isFastMoving = true;
        boolean isDiscontinued = false;
        
         boolean shouldReorder = (stockQuantity < 10 || isFastMoving) && !isDiscontinued;
        
         int reorderQuantity = shouldReorder ? 50 : 0;
        
         stockQuantity += reorderQuantity;
        
        System.out.println("Initial Stock: 8");
        System.out.println("Fast Moving Item: " + isFastMoving);
        System.out.println("Discontinued: " + isDiscontinued);
        System.out.println("Should Reorder: " + shouldReorder);
        System.out.println("Reorder Quantity: " + reorderQuantity);
        System.out.println("Final Stock: " + stockQuantity);
    }
}