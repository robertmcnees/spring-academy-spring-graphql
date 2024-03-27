package io.spring.guides.graphqlmusic.tracks;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TrackRepository extends MongoRepository<Track, String> {

	List<Track> findByAlbumIdOrderByNumber(String albumId);

	Optional<Playlist> findByAuthorAndNameEquals(String author, String name);
	
}
