@RestController
@SpringBootApplication
public class StartPlaybackService {

    @PostMapping("/start")
    public String startPlayback() {
        return "Playback started";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartPlaybackService.class, args);
    }
}
