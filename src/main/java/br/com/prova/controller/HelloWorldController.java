package br.com.prova.controller;


import br.com.prova.model.Mensagem;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping(value = "/{mensagem}", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<?> helloWorld(@PathVariable String mensagem){
        return ResponseEntity.ok(new Mensagem(mensagem));
    }
}
