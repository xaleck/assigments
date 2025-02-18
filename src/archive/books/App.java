public class App {
    
    public static void main(String[] args) throws Exception {
        PrintedBook b1 = new PrintedBook("Title 1", "me", 2025, 100, "ait");
        EBook b2 = new EBook("Title 2", "me", 2025, 3.6, "PDF");
        System.out.println(b1.getBookInfo() + "\n");
        b1.printBookDetails();
        System.out.println(b1.bookPrice());
        b1.printBook();
        b1.bookType();
        System.out.println("-----------------------------------");
        System.out.println(b2.getBookInfo() + "\n");
        b2.printBookDetails();
        System.out.println(b2.bookPrice());
        b2.bookType();  
    }
}
