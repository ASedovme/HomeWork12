public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя Работа 12");
        Book a = new Book("Путешествия","Народные",1970);
        Book b = new Book("Хождения","Федотов",1982);
        System.out.println(a.title+" "+a.author+" "+ a.yearPublic);
        System.out.println(b.title+" "+b.author+" "+ b.yearPublic);
        a.setYearPublic(1990);
        System.out.println("a.yearPublic = " + a.yearPublic);
        Author c = new Author("Fedor","Fedorov");
        System.out.println(c.name+" "+c.surname);
        Author d = new Author("Филимон","Петров");
        System.out.println(d.name+" "+d.surname);
    }
}