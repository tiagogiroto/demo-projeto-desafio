package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dispositivo")
public class Dispositivo {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long deviceId;

    @Column(name="name")
    private String name;

    @Column(name="mac")
    private Integer mac;

    @Column(name="email")
    private String email;

    @Column(name="latitude")
    private String latitude;

    @Column(name="longitude")
    private String longitude;

}
