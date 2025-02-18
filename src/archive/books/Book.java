public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    public  String getBookInfo(){
        // String result = "Book info: \n" + "Title: " + title + "\n"+ "Author: " + author + "\n"+ "Year Published: " + yearPublished + "\n";
        String result = title + ","+  author + ","+   yearPublished ;
        return result;
    }
    public void printBookDetails(){
        System.out.println("Book info: \n" + "Title: " + title + "\n"+ "Author: " + author + "\n"+ "Year Published: " + yearPublished + "\n");
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
}