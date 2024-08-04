public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя Работа 12");
        Author oneAuthor = new Author("Fedor","Fedorov");
        System.out.println(oneAuthor.getName()+" "+oneAuthor.getSurname());
        Author twoAuthor = new Author("Филимон","Петров");
        System.out.println(twoAuthor.getName()+" "+twoAuthor.getSurname());
        Book oneBook = new Book("Путешествия",oneAuthor,1970);
        Book twoBook = new Book("Хождения",twoAuthor,1982);
        System.out.println(oneBook.getTitle()+" "+oneBook.getAuthor()+" "+ oneBook.getYearPublic());
        System.out.println(twoBook.getTitle()+" "+twoBook.getAuthor()+" "+ twoBook.getYearPublic());
        oneBook.setYearPublic(1990);
        System.out.println("a.yearPublic = " + oneBook.getYearPublic());
    }
}