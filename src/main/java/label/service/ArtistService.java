package label.service;

import label.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import label.repository.ArtistRepository;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists(){
        List<Artist> artists = artistRepository.findAll();
        return artists;
    }
}
