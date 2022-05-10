package com.adtomic.iTunesSearcher.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class ITunesResponse implements Serializable {
    private int resultCount;
    private Song[] results;
}
