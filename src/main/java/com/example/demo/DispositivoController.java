package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/")
public class DispositivoController {

    @GetMapping("/dispositivo")
    String hello() {
        return "teste teste";
    }
    

    // @PostMapping(path = "/cadastro")
    // public Dispositivo salvar(@RequestBody Dispositivo dispositivo)
    // {  
    //     return dispositivoRepo.save(dispositivo);
    // }

    // @GetMapping(value = "/listall")
    // @ResponseStatus(HttpStatus.OK)
    // public List<Dispositivo> listar(){
    //     return dispositivoRepo.findAll();
    // }

}
