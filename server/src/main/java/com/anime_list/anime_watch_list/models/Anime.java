package com.anime_list.anime_watch_list.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Anime {
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate releaseDate;

    @Column
    private String description;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private int rating;

    @Column
    private int numberOfEps;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"animes"})
    private User user;

    // Empty constructor
    public Anime() {}

    // Constructor
    public Anime(String name, LocalDate releaseDate, String description, Genre genre, int rating, int numberOfEps) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.description = description;
        this.genre = genre;
        this.rating = rating;
        this.numberOfEps = numberOfEps;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberOfEps() {
        return numberOfEps;
    }

    public void setNumberOfEps(int numberOfEps) {
        this.numberOfEps = numberOfEps;
    }
}

