package io.spring.guides.graphqlmusic.tracks;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaylistRepository extends MongoRepository<Playlist, String> {

    List<Playlist> findByAuthor(String author);
}
