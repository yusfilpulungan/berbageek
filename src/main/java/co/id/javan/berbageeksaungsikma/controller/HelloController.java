package co.id.javan.berbageeksaungsikma.controller;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
