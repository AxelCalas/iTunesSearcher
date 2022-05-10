package com.adtomic.iTunesSearcher.controller;

import com.adtomic.iTunesSearcher.model.Song;
import com.adtomic.iTunesSearcher.service.ClientSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class ClientSearchController {
    @Autowired
    private ClientSearchService clientSearchService;

    @GetMapping("/song")
    public List<Song> getSongsByArtistName(@RequestParam String artist) {
        return clientSearchService.getSongsByArtistName(artist);
    }
}
