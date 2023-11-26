package org.example.repository;

import org.example.model.Film;
import org.example.service.Randomizer;

import java.util.ArrayList;
import java.util.List;


public class FilmRepository {
    private final List<Film> films = new ArrayList<>();

    public FilmRepository() {
        init();
    }

    private void init() {
        for (int i = 1; i <= 10; i++) {
            Randomizer random = new Randomizer();
            Film film = random.getFilm();
            films.add(film);
        }
    }

    public List<Film> getFilms() {
        return films;
    }
}
