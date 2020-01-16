package com.codegym.zing.service.impl;

import com.codegym.zing.model.Song;
import com.codegym.zing.repository.SongRepository;
import com.codegym.zing.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;




    @Override
    public Iterable<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }


    @Override
    public void delete(Long id) {
        Optional<Song>song1=songRepository.findById(id);
        if (song1.isPresent()){
            songRepository.delete(song1.get());
        }
    }
}
