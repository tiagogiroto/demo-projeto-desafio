package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoRepo dispositivoRepository;

    // metodo list all
    @GetMapping("/lista")
    public List<Dispositivo> listar() {
        
        return dispositivoRepository.findAll();
    }

    // metodo list by id
    @GetMapping("/lista/deviceid")
    public ResponseEntity <List<Dispositivo>> listarPorId(@RequestParam Long deviceid) {
        
        return new ResponseEntity<List<Dispositivo>> (dispositivoRepository.findByDeviceId(deviceid) ,HttpStatus.OK);
    }

    // metodo cadastro
    @PostMapping(path = "/cadastro")
    public Dispositivo salvar(@RequestBody Dispositivo dispositivo)
    {  
        return dispositivoRepository.save(dispositivo);
    }

    // metodo delete por id
    @DeleteMapping(path = "/deletar/{id}")
    public void deletarPorId(@PathVariable Long id)
    {  
        dispositivoRepository.deleteById(id);
        System.out.println("** O ID " + id + " FOI DELETADO **");
    }

}
