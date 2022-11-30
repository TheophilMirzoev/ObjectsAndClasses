public class Main
{

    public static void main(String[] args) {
        Author levTolstoy = new Author(" Lev ", " Tolstoy ");
        Author georgeOrwell = new Author(" George", " Orwell");
        Book warAndPeace = new Book(" War and Peace ", levTolstoy,  1867);
        Book nineteenEightyFour = new Book(" 1984 ", georgeOrwell, 1949);
        warAndPeace.setYearOfPublication(1869);

        //System.out.println(warAndPeace.getBooksName() + levTolstoy.getName() + levTolstoy.getLastName() + warAndPeace.getYearOfPublication());
        System.out.println(warAndPeace.toString());
    }
}
