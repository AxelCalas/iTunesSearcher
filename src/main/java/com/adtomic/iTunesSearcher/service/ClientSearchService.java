package com.adtomic.iTunesSearcher.service;

import com.adtomic.iTunesSearcher.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientSearchService {

    public List<Song> getSongsByArtistName(String artist) {
        return List.of(
                new Song("tema1", "artista1"),
                new Song("tema2", "artista2"),
                new Song("tema3", "artista3"),
                new Song("tema4", "artista4"),
                new Song("tema5", "artista5")
        );
    }
}
