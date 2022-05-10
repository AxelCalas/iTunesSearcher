package com.adtomic.iTunesSearcher.service;

import com.adtomic.iTunesSearcher.model.Search;
import com.adtomic.iTunesSearcher.model.Song;
import com.adtomic.iTunesSearcher.repository.SearchRepository;
import com.adtomic.iTunesSearcher.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ClientSearchService {
    @Autowired
    private ITunesRestServiceSearches iTunesRestServiceSearches;
    @Autowired
    private SearchRepository searchRepository;
    @Autowired
    private SongRepository songRepository;

    public Song[] getSongsByArtistName(String userName, String artist) {

        Search search = Search.builder().userName(userName).searchedText(artist).build();
        searchRepository.save(search);

        Song[] iTunesResponse = iTunesRestServiceSearches.getFirstFiveSongsByArtist(artist);
        Arrays.stream(iTunesResponse).forEach(song -> {
            song.setSearchId(search.getSearchId());
            songRepository.save(song);
        });

        return iTunesResponse;
    }
}
