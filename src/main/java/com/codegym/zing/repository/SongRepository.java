package com.codegym.zing.repository;

import com.codegym.zing.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository <Song, Long> {

}
