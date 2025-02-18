public class PrintedBook extends Book {
    private int numberOfPages;
    private String publisher;
    private int priceperpage = 4;
    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
    public PrintedBook(String title, String author, int yearPublished, int numberOfPages) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
    }
    @Override public String getBookInfo(){
        
        String result = getTitle() + "," + getAuthor() + "," + getYearPublished() + "," + publisher + "," + numberOfPages + "," + "PrintedBook";
        return result;
    }
    @Override public void printBookDetails(){
        System.out.println("Printed Book info: \n" + "Title: " + getTitle() + "\n"+ "Author: " + getAuthor() + "\n"+ "Year Published: " + getYearPublished() + "\n" + "Publisher: " + publisher + "\n" + "Number of pages: " +numberOfPages + "\n"+ "Book Type: " + "Printed Book" + "\n"  );
    }
    public void bookType(){
        System.out.println("This is a printed book");
    }
    public void printBook(){
        System.out.println("Printing the book...");
    }
    public int bookPrice(){
        return priceperpage * numberOfPages;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getPriceperpage() {
        return priceperpage;
    }
}
