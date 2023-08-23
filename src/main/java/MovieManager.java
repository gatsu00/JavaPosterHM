public class MovieManager {
    private String[] movies = new String[0]; // набор всех добавленных фильмов
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }
    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length +1]; // набор на единицу больше
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i]; // копируем старый список в новый
        }
        newMovies[newMovies.length - 1] = movie;
        this.movies = newMovies; // актуальный набор из фильмов
    } // добавление нового фильма

    public String[] findAll(){
        return movies;
    } // вывод всех фильмов в порядке добавления

    public String[] findLast(){
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length -1 - i];
        }
        return result;
    } // показ добавленных фильмов

}
