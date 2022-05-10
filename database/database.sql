CREATE TABLE searches (
    search_id serial PRIMARY KEY,
    searched_text VARCHAR(20) NOT NULL
);

CREATE TABLE song (
    song_id serial PRIMARY KEY,
    search_id int NOT NULL,
    track_name VARCHAR(40) NOT NULL,
    artist_name VARCHAR(20) NOT NULL,
    FOREIGN KEY (search_id) REFERENCES searches (search_id)
);