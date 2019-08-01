
import label.configs.DataConfig;
import label.entity.Artist;
import label.repository.ArtistRepository;
import label.service.ArtistService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
        ArtistService sevice = applicationContext.getBean(ArtistService.class);
        System.out.println(sevice.getAllArtists().toString());

    }
}
