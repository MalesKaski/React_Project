package pl.kmaleszko.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.FileWriter;
import java.io.IOException;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @PostMapping("/contact")
  public String userContact(@ModelAttribute Contact contact) {
    System.out.println(contact.toString());

    return "contact";
  }
}
