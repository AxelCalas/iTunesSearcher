# iTunesSearcher
This is a REST API Java service created to search songs on iTunes

![](src/main/resources/images/iTunes.png "iTunes searcher")

> #### About the technologies used
> - Java (11)
> - Apache Maven (3.8)
> - Spring Boot (Web, JPA, Started test)
> - Lombok
> - Docker
> - Postgres Database (42.3.3)


## How to run
Run the following command in **iTunesSearcher** directory
> docker-compose up<br>

Or in case you would like to run the app locally instead of inside a container:
- Create database image and run database on docker with the following commands standing on **iTunesSearcher/database** directory
    > docker build -t itunessearcher-postgres-db-image .

    > docker run -d --name iTunesSearcher-postgres-db -p 5432:5432 itunessearcher-postgres-db-image
- Then build and run the app
    > mvn clean package

    > java -jar target/iTunesSearcher-0.0.1-SNAPSHOT.jar


## REST API
- localhost:8080/api/search/song

## Docker structure

## App architecture
