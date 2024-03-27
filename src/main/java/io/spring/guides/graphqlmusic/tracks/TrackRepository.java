package io.spring.guides.graphqlmusic.tracks;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, String> {

	List<Track> findByAlbumIdOrderByNumber(String albumId);
}
