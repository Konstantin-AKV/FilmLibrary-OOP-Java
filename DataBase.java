package FilmsApp;

import FilmsApp.FactoriesLib.GenreCreatorFactory;
import FilmsApp.FactoriesLib.StudioCreatorFactory;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Film> films = new ArrayList<>();
    ArrayList<Studio> studios = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public DataBase() {
        Film cin1 = new Film(1, "Чернобыль. Зона отчужденич", 1, 1);
        Film cin2 = new Film(2, "Териминатор", 2, 2);
        Film cin3 = new Film(3, "Гагарин. Первый в космосе", 1, 3);
        Film cin4 = new Film(4, "Кто я?", 2, 4);

        this.addFilm(cin1);
        this.addFilm(cin2);
        this.addFilm(cin3);
        this.addFilm(cin4);

        GenreCreatorFactory gcf = new GenreCreatorFactory();
        this.addGenre(gcf.newGenre("Фантастика"));
        this.addGenre(gcf.newGenre("Боевик"));
        this.addGenre(gcf.newGenre("Отечественный фильм"));

        StudioCreatorFactory scf = new StudioCreatorFactory();
        this.addStudio(scf.newStudio("Фонд Кино"));
        this.addStudio(scf.newStudio("Paramount Pictures"));
        this.addStudio(scf.newStudio("Illumination"));
        this.addStudio(scf.newStudio("Columbia Pictures"));
    }

    public void addStudio(Studio studio) {
        studios.add(studio);
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void addFilm(Film film) {
        films.add(film);
    }
}
