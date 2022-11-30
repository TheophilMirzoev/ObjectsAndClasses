import java.util.Objects;

public class Book {
    private String booksName;
    private Author author;
    private int yearOfPublication;

    public Book(String booksName, Author author, int yearOfPublication) {
        this.booksName = booksName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }


    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getBooksName() {
        return this.booksName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

   @Override
    public String toString() {
        return getClass().getName() + " Название книги " +  booksName  + " автор " +  author + " год публикации " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(booksName, book.booksName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booksName, author, yearOfPublication);
    }
}
