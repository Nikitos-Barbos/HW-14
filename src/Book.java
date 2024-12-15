import java.util.Objects;
public class Book {
    String name;
    Author author;
    int year;

    public Book(Author author, int year, String name) {
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " от автора " + author + ", опубликонван в " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}

