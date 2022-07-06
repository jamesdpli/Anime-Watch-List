# Anime-Watch-List
Bright Network Techonolgy Academy Cohort 5a members: [James](https://github.com/jamesdpli), [Amber](https://github.com/aakamara), [Asiha](https://github.com/aisha-png), [Sujan](https://github.com/kagami7410) and [Mani](https://github.com/Kozmo119) Represnt **Animu** a website where you can store your favourite anime into your personal watch-list.

### App images and gifs below ...

### Front end stuff ...
Excalidraw wire frame

### Backend stuff ...
ER diagram

### All Working Routes
| HTTP Requests | Animes                                                                                                                                                                                                                                                                                                                                                                                        | Genres                                                     | WatchLists                                               |
|---------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------|----------------------------------------------------------|
| GET           | `localhost:8080/animes` <br/> `localhost:8080/animes/{id}` <br/> `localhost:8080/animes/name={name}` <br/> `localhost:8080/animes/rating>{rating}` <br/> `localhost:8080/animes/episodesGreaterThan>{numberOfEps}` <br/> `localhost:8080/animes/episodesGreaterThan>{numberOfEps}` <br/> `localhost:8080/animes/genre={genreName}` <br/> `localhost:8080/animes/complete/animes={isComplete}` | `localhost:8080/genres` <br/> `localhost:8080/genres/{id}` | `localhost:8080/users` <br/> `localhost:8080/users/{id}` |
| POST          | `localhost:8080/animes`                                                                                                                                                                                                                                                                                                                                                                       | `localhost:8080/genres`                                    | `localhost:8080/users`                                   |
| PUT           | `localhost:8080/animes/{id}`                                                                                                                                                                                                                                                                                                                                                                  | `localhost:8080/genres/{id}`                               | `localhost:8080/users/{id}`                              |
| DELETE        | `localhost:8080/animes/{id}`                                                                                                                                                                                                                                                                                                                                                                  | `localhost:8080/genres/{id}`                               | `localhost:8080/users/{id}`                              |

### Quirky Behaviour 
- Delete mapping for the "animes" route works but an error is thrown.
- Async in front end must be fine-tuned

### Acknowledgement
Massive shout out to the Bright Network Technology Team especially Richard & Anna!
