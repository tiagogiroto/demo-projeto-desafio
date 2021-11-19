package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepo extends CrudRepository< Dispositivo , Long> {
    
}
