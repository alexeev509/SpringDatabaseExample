package label.service;

import label.entity.Artist;
import label.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists(){
        List<Artist> artists = artistRepository.findAll();
        return artists;
    }

    public List<Artist> getArtistByAgeBetween() {
        List<Artist> artists = artistRepository.getArtistByAgeBetween(20, 29);
        return artists;
    }

    public Artist saveNewArtist(Artist artist) {
        Artist newArtist = artistRepository.save(artist);
        return newArtist;
    }
}
