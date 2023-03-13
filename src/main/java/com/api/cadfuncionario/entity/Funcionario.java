package com.api.cadfuncionario.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data //implementa os getters, setters e equals
@Table(name = "tb_funcionario")
public class Funcionario {
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nome;
    @Column (nullable = false)
    private String cpf;
    @Column (nullable = false)
    private String telefone;
    @Column (nullable = false)
    private String email;

}
