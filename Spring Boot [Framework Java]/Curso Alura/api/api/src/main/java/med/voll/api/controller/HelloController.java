package med.voll.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //falando pro spring que é um controller do tipo RestApi
@RequestMapping("/hello") //definindo url
public class HelloController {

    @GetMapping //estou falando que é um request do tipo get
    public String olaMundo(){
        return "Hello world uauuu";
    }
}
