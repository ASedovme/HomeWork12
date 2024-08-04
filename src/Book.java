public class Book {
    String title;
    String author;
    int yearPublic;

    public Book(String title, String author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
