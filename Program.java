package FilmsApp;

public class Program {
    public static void main(String[] args) {
        DataBase db1 = new DataBase();
        FilmFinder finder = new FilmFinder(db1);


        System.out.println(finder.findFilm("Гагарин. Первый в космосе"));
        System.out.println(finder.getFilmInfoById(1));
    }
}
