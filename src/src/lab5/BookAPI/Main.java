package lab5.BookAPI;

class Main {

    public static void main(String[] args) {
        BookAPI bookAPI = new BookAPI();
        String id = "1"; // In a real application, this might be input by the user

        Book book = (Book) bookAPI.getBook(id);

        String title = (String) book.getTitle();
        String author = (String) book.getAuthor();
        Integer year = (Integer) book.getYear();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);


        book.read();
        book.nextPage();
        book.previousPage();

        book.scan();
        book.scanNextPage();
        book.scanPreviousPage();
    }
}