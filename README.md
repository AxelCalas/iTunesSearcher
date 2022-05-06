# iTunesSearcher
REST API Java service to search songs on iTunes

Then we can build an image with the following command:
docker build -t myorg/myapp .

docker build .
-t (tag option to set a name)
myorg/myapp (example name)

Then we can run it by running the following command:
docker run -p 8080:8080 myorg/myapp


docker build -t itunessearcher-postgres-db .
docker run -d --name iTunesSearcher-postgres-db -p 5432:5432 itunessearcher-postgres-db