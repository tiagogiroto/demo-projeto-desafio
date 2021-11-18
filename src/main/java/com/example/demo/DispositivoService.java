package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class DispositivoService {
    
    @Autowired 
    private DispositivoRepo dispositivoRepo;

    public Dispositivo salvar(Dispositivo dispositivo)
    {  
        return dispositivoRepo.save(dispositivo);
    }

    public List<Dispositivo> listar(){
        return dispositivoRepo.findAll();
    }

    public Optional<Dispositivo> buscaPorId(Long id){
        return dispositivoRepo.findById(id);
    }

    public void deletaPorId(Long id){
        dispositivoRepo.deleteById(id);
    }
}
