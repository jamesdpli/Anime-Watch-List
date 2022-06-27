package com.anime_list.anime_watch_list.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    LocalDate dob;

    @Column
    String email;

    @ManyToMany
    @JoinTable(
            name = "animes_users",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "anime_id")}
    )
    @JsonIgnoreProperties({"users"})
    private List<Anime> animes;
//    private Anime anime;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", animes=" + animes +
                '}';
    }
}
