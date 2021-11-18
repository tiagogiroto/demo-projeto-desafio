package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
    
    private Long deviceId;
    private String name;
    private Integer mac;
    private String email;
    private String latitude;
    private String longitude;

}
