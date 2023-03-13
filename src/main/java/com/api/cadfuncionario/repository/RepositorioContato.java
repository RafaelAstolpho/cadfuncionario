package com.api.cadfuncionario.repository;

import com.api.cadfuncionario.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository <Funcionario, Long> {

}
