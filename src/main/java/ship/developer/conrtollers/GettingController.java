package ship.developer.conrtollers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GettingController {
    @RequestMapping("/")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
