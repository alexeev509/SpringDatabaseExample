import label.service.ArtistService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
        ArtistService service = applicationContext.getBean(ArtistService.class);
        System.out.println(service.getAllArtists().toString());
        System.out.println(service.getArtistByAgeBetween());
        //  System.out.println(service.saveNewArtist(new Artist("50 cent",50,true)));

    }
}
