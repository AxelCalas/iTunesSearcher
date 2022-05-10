package com.adtomic.iTunesSearcher.service;

import com.adtomic.iTunesSearcher.model.Song;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ITunesRestServiceSearches {
    private final RestTemplate restTemplate;

    public ITunesRestServiceSearches(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Song[] getFirstFiveSongsByArtist(String artist) {
        String url = "https://itunes.apple.com/us/search/song?limit=5&media=music&term={artist}";
        String response = restTemplate.getForObject(url, String.class, artist);
        System.out.println(response);
        //Parse response
        return new Song[]{
                Song.builder().artistName("Conejito malo").trackName("X ULTIMA VEZ").build(),
                Song.builder().artistName("Conejito malo").trackName("Lo Siento BB").build(),
                Song.builder().artistName("Conejito malo").trackName("Yonaguni").build(),
                Song.builder().artistName("Conejito malo").trackName("Moscow Mule").build(),
                Song.builder().artistName("Conejito malo").trackName("A Tu Merced").build()};
    }
}
