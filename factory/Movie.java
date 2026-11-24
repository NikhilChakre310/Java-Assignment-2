public class Movie {
    public String movieName;
    public Actor actor;

    public Movie(String movieName, Actor actor) {
        this.movieName = movieName;
        this.actor = actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return movieName + (actor != null ? " (" + actor.name + ")" : "");
    }
}
