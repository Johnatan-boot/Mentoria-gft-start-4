package com.expertostech.tutorialrest.api.repository;

import com.expertostech.tutorialrest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
//Consultas Basicas
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
