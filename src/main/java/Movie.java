public class Movie {
    private int movieid;
    private double ratings;

    public Movie(int movieid, double ratings) {
        this.movieid = movieid;
        this.ratings = ratings;
    }

    public int getMovieId() {
        return movieid;
    }
    public double getRating() {
        return ratings;
    }
    public void setMovieId(int movieid) {
        this.movieid = movieid;
    }
    public void setRating(double ratings) {
        this.ratings = ratings;
    }


 }
