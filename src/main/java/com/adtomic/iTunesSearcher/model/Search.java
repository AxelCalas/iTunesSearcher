package com.adtomic.iTunesSearcher.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "searches")
public class Search {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long searchId;
    private String userName;
    @Column(nullable = false)
    private String searchedText;
}
