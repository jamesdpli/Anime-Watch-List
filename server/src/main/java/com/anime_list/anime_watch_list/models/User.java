package com.anime_list.anime_watch_list.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    @Column
    String name;

    @Column
    LocalDate dob;

    @Column
    String email;

    @Column
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Anime> animes;

    // Empty constructor
    public User() {
    }

    // Constructor
    public User(String name, LocalDate dob, String email, List<Anime> animes) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.animes = animes;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Anime> getAnimes() {
        return animes;
    }

    public void setAnimes(List<Anime> animes) {
        this.animes = animes;
    }

//    ADD & REMOVE ANIME METHODS:

    public void addAnime(Anime anime){
        this.animes.add(anime);
    }

    public void removeAnime(Anime anime){
        this.animes.remove(anime);
    }
}
