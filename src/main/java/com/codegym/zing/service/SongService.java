package com.codegym.zing.service;

import com.codegym.zing.model.Song;

import java.util.Optional;

public interface SongService {
    Iterable<Song> findAll();
    Optional<Song> findById(Long id);

    void save (Song song);
    void delete (Long id);

}
