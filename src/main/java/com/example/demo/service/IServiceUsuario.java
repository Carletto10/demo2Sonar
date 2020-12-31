package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Usuario;

public interface IServiceUsuario {

		public List<Usuario> getAllUsuarios();
		public Usuario createUsuario(Usuario usr);
		public Usuario updateUsuario(Long id,Usuario usr);
		public void deleteUsuario(Long id);

}
