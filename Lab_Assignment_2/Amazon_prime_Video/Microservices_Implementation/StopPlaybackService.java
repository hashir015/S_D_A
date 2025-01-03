@RestController
@SpringBootApplication
public class StopPlaybackService {

    @PostMapping("/stop")
    public String stopPlayback() {
        return "Playback stopped";
    }

    public static void main(String[] args) {
        SpringApplication.run(StopPlaybackService.class, args);
    }
}
