package com.api.cadfuncionario.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


}
