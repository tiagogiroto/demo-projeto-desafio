package com.example.demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class DispositivoController {

    @GetMapping(path="/lista")
    String a() {
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
