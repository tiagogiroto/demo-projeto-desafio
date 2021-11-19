package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoRepo dispositivoRepository;

    @GetMapping("/listall")
    public List<Dispositivo> hello() {
        
        return dispositivoRepository.findAll();
    }

    @GetMapping("/list")
    public String hello2() {
        return "teste teste 2222";
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
