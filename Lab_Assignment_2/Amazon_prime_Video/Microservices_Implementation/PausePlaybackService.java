@RestController
@SpringBootApplication
public class PausePlaybackService {

    @PostMapping("/pause")
    public String pausePlayback() {
        return "Playback paused";
    }

    public static void main(String[] args) {
        SpringApplication.run(PausePlaybackService.class, args);
    }
}
