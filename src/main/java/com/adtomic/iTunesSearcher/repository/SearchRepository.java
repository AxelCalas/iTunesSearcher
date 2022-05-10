package com.adtomic.iTunesSearcher.repository;

import com.adtomic.iTunesSearcher.model.Search;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends CrudRepository<Search, Long> {
}
