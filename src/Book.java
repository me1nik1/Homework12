public class Book {

    private final String title;
    private final Author author;
    private int publisherYear;

    public Book(String title, Author author, int publisherYear) {
        this.title = title;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}
