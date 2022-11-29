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


}
