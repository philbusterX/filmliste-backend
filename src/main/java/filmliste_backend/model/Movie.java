package filmliste_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    private String genre;
    private double rating;
    private boolean watched;
    private boolean favorite;
    private String coverUrl;

    public Movie() {
    }

    public Movie(String title, int year, String genre, double rating, boolean watched, boolean favorite, String coverUrl) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.watched = watched;
        this.favorite = favorite;
        this.coverUrl = coverUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public boolean isWatched() { return watched; }
    public void setWatched(boolean watched) { this.watched = watched; }
    public boolean isFavorite() { return favorite; }
    public void setFavorite(boolean favorite) { this.favorite = favorite; }
    public String getCoverUrl() { return coverUrl; }
    public void setCoverUrl(String coverUrl) { this.coverUrl = coverUrl; }
}
