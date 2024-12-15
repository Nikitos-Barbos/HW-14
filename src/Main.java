public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Максим", "Бивнев");
        Author author2 = new Author("Данте", "Протрезвелов");

        Book book1 = new Book(author1, 1999, "Забыть вчера, как завтра");
        Book book2 = new Book(author2, 1997, "В тишине и покое");

        System.out.println(book1);
        System.out.println(book2);

        book1.setYear(1950);

        System.out.println("Updated book information:");
        System.out.println(book1);
    }
}