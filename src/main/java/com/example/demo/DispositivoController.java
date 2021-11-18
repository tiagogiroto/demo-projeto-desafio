package com.example.demo;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    
    @GetMapping
    public String get(){
        return "teste";
    }

    @Autowired
    private DispositivoService dispositivoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dispositivo salvar(@RequestBody Dispositivo dispositivo)
    {  
        return dispositivoService.salvar(dispositivo);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Dispositivo> listar(){
        return dispositivoService.listar();
    }
    

}
