package nmi.nmit02e03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {
    
    @GetMapping({"/index", " ", "/", "/home"})
    public String showIndex() {
        return "indexView";
    }
    
    @GetMapping("/team")
    public String showTeam() {
        return "teamView";
    }

    @GetMapping("/photos-gallery")
    public String showGallery() {
        return "photos-galleryView";
    }
    
    
}
