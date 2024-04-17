package htwberlin.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/todos")
    public List<GesundheitsTracker> greeting() {
        GesundheitsTracker entry = new GesundheitsTracker(15, "Test", 15,12, "aad", "aha");
        GesundheitsTracker entry1 = new GesundheitsTracker(15, "Test", 15,12, "aad", "aha");
        GesundheitsTracker entry2 = new GesundheitsTracker(15, "Test", 15,12, "aad", "aha");
        GesundheitsTracker entry3 = new GesundheitsTracker(15, "Test", 15,12, "aad", "aha");
        GesundheitsTracker entry4 = new GesundheitsTracker(15, "Test", 15,12, "aad", "aha");
        return List.of(entry, entry1, entry2, entry3, entry4);
    }

}
