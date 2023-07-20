package lab5.BookAPI;

public class Book extends BookAbstract implements Readable, Scanable{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    Object getTitle() {
        return this.title;
    }

    @Override
    Object getAuthor() {
        return this.author;
    }

    @Override
    Object getYear() {
        return this.year;
    }

    @Override
    public void read() {
        System.out.println("Reading book...");
    }

    @Override
    public void nextPage() {
        System.out.println("Reading next page");
    }

    @Override
    public void previousPage() {
        System.out.println("Reading previous page");
    }
    @Override
    public void scan() {
        System.out.println("Scanning book...");
    }

    @Override
    public void scanNextPage() {
        System.out.println("Scanning next page");
    }

    @Override
    public void scanPreviousPage() {
        System.out.println("Scanning previous page");
    }
}
