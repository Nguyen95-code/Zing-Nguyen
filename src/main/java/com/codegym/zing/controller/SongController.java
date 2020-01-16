package com.codegym.zing.controller;


import com.codegym.zing.model.Song;
import com.codegym.zing.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping
    public ResponseEntity<Iterable<Song>>listSong(){
        Iterable<Song> songs=songService.findAll();
        return new ResponseEntity<>(songs, HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<String>createSong(Song song){
        songService.save(song);
        return new ResponseEntity<>("thanh cong",HttpStatus.OK);
    }
}
