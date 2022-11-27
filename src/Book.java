public class Book {
    private String booksName;
    private Author name;
    private Author lastName;
    private int yearOfPublication;

    public Book(String booksName, Author name, Author lastName, int yearOfPublication) {
        this.booksName = booksName;
        this.yearOfPublication = yearOfPublication;
        this.lastName = lastName;
        this.name = name;
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
}
