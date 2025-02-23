public class Book {
    String title;
    int pages;
    int year;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
