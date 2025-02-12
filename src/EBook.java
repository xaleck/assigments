
public class EBook extends Book {
    private double filesizeMB;
    private String fileFormat;
    private int pricepermb = 100;
    public EBook(String title, String author, int yearPublished, double filesizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.filesizeMB = filesizeMB;
        this.fileFormat = fileFormat;
    }
    
    public EBook(String title, String author, int yearPublished, double filesizeMB) {
        super(title, author, yearPublished);
        this.filesizeMB = filesizeMB;
    }

    @Override public String getBookInfo(){
        String result = getTitle() + "," + getAuthor() + "," + getYearPublished() + "," + filesizeMB + "," + fileFormat + "," + "PrintedBook";
        return result;
    }
    @Override public void printBookDetails(){
        System.out.println("EBook info: \n" + "Title: " + getTitle() + "\n"+ "Author: " + getAuthor() + "\n"+ "Year Published: " + getYearPublished() + "\n"  + "File Size: " + filesizeMB + " MB" + "\n" + "File Format: " + fileFormat + "\n"+ "Book Type: " + "EBook" + "\n"  );
    }
    public void bookType(){
        System.out.println("This is an ebook");
    }
    public double bookPrice(){
        if(fileFormat == "PDF"){
        return pricepermb * filesizeMB * 1.5;
        } else if(fileFormat == "MOBI")  {
            return pricepermb * filesizeMB * 2;
        }  else {
            return pricepermb * filesizeMB ;
        }
    }
    public double getFilesizeMB() {
        return filesizeMB;
    }
    public String getFileFormat() {
        return fileFormat;
    }
    public int getPricepermb() {
        return pricepermb;
    }
}
