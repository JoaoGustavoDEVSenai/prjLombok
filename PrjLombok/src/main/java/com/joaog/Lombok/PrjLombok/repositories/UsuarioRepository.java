package com.joaog.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaog.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}