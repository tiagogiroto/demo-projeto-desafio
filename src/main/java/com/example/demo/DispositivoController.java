package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    private List<Dispositivo> d = new ArrayList<>();
    

    @GetMapping("/listarDispositivos")
    public List<Dispositivo> d(){
        return d;
    }

    @GetMapping("/listarDispositivosPorId/{id}")
    public Dispositivo dispositivo(@PathVariable("id") Long id){
        System.out.print(id);

        Optional<Dispositivo> procurarId = d.stream().filter(dispositivo -> dispositivo.getDeviceId() == id).findFirst();


        return procurarId.get();
    }

    @RequestMapping("/listarDispositivos")
    public Dispositivo dispositivo()
    {   
        Dispositivo d = new Dispositivo();
        d.getDeviceId();
        d.getEmail();
        d.getLatitude();
        d.getLongitude();
        d.getMac();
        d.getName();

        return d;
    }
    

    @PostMapping("/cadastroDispositivo")
    public Dispositivo dispositivo(@RequestBody Dispositivo dispositivo)
    { 
        d.add(dispositivo);
        return dispositivo;
    }


}
