public class Show {
    public Movie movie;

    public Show(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return movie != null ? movie.toString() : "Empty Show";
    }
}
