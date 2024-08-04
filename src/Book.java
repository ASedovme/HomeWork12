public class Book {
    private String title;
    private Author author;
    private int yearPublic;

    public Book(String title, Author author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
