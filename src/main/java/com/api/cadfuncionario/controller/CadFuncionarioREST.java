package com.api.cadfuncionario.controller;

import com.api.cadfuncionario.repository.RepositorioContato;
import com.api.cadfuncionario.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping ("/funcionario")
public class CadFuncionarioREST {
    @Autowired /* Spring cria o obejto e inejta no atributo (repositorio), tendo esse objeto todas as operações basicas para manipular o contato no BD*/
    private RepositorioContato repositorio;
    @GetMapping
    public List <Funcionario> consultar (){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar (@RequestBody Funcionario funcionario){
        repositorio.save(funcionario);
    }
    @PutMapping
    public void alterar (@RequestBody Funcionario funcionario){
        if (funcionario.getId() > 0)
        repositorio.save(funcionario);
    }
    @DeleteMapping
    public void excluir (@RequestBody Funcionario funcionario){
        repositorio.delete(funcionario);
    }

}
