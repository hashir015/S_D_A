import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class MonolithicPlaybackService {

    @PostMapping("/playback")
    public String playback(@RequestBody String action) {
        switch (action.toLowerCase()) {
            case "start":
                return "Playback started";
            case "pause":
                return "Playback paused";
            case "stop":
                return "Playback stopped";
            default:
                return "Invalid action";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MonolithicPlaybackService.class, args);
    }
}
