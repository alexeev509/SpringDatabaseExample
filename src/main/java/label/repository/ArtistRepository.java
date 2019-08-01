package label.repository;

import label.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Integer> {
    public List<Artist> getArtistByAgeBetween(int age1, int age2);
}
