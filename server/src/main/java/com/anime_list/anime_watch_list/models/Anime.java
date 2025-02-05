package com.anime_list.anime_watch_list.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animes")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate releaseDate;

    @Column
    private String description;

    @ManyToMany(mappedBy = "animes", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "animes")

    private List <Genre> genres;

    @Column
    private double rating;

    @Column(name = "number_of_episodes")
    private int numberOfEps;

    @Column(name = "complete")
    private boolean isComplete;

    @Column
    private String imageUrl;

    @Column
    private String bannerImage;

    // Empty constructor
    public Anime() {}

    // Constructor
    public Anime(String name, LocalDate releaseDate, String description, double rating, int numberOfEps, boolean isComplete, String imageUrl, String bannerImage) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.description = description;
        this.genres = new ArrayList<>();
        this.rating = rating;
        this.numberOfEps = numberOfEps;
        this.isComplete = isComplete;
        this.imageUrl = imageUrl;
        this.bannerImage = bannerImage;
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfEps() {
        return numberOfEps;
    }

    public void setNumberOfEps(int numberOfEps) {
        this.numberOfEps = numberOfEps;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    // Custom methods
    public void addGenres(List<Genre> genres){
        this.genres.addAll(genres);
    }

    public void removeGenres(List<Genre> genres){
        this.genres.removeAll(genres);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", description='" + description + '\'' +
                ", genres=" + genres +
                ", rating=" + rating +
                ", numberOfEps=" + numberOfEps +
                ", isComplete=" + isComplete +
                ", imageUrl='" + imageUrl + '\'' +
                ", bannerImage='" + bannerImage + '\'' +
                '}';

}
}

// add a toString() here ✅

