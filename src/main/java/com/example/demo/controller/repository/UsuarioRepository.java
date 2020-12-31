package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
