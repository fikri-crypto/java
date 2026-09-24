  public class LibraryItem {
      private String title;
    private String publisher;
    private int year;

    // Knstraktor
    public LibraryItem(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    // Getter Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
    }
}


class Book extends LibraryItem {
    private String author;
    private int pages;

    // konstraktor
    public Book(String title, String publisher, int year, String author, int pages) {
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
    }

    // Getter setter 
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    
    void displayBook() {
        printInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

// Subclass 2
class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    // konstraktor 
    public Magazine( String title, String publisher, int year,
                     int issueNumber, String month) {
        super( title, publisher, year);
        this.issueNumber = issueNumber;
        this.month = month;
    }
   
    

    // Getter Setter
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    
    void printMagazine() {
        printInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
    }
}

// turunan dari Magazine
class DigitalMagazine extends Magazine {
    private double fileSizeMB;
    private String downloadLink;

    // Konstrktor
    public DigitalMagazine(String title, String publisher, int year,
                           int issueNumber, String month,
                           double fileSizeMB, String downloadLink) {
        super(title, publisher, year, issueNumber, month);
        this.fileSizeMB = fileSizeMB;
        this.downloadLink = downloadLink;
    }

    // Getter  Setter
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    
    void printDigitalMagazine() {
        printMagazine();
        System.out.println("File Size (MB): " + fileSizeMB);
        System.out.println("Download Link: " + downloadLink);
    }
}

