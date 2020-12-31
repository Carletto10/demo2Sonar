package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Usuario;
@Service
public class ServicioUsuarioAlternativo implements IServiceUsuario {

	@Override
	public List<Usuario> getAllUsuarios() {
		// TODO Auto-generated method stub
		return new ArrayList<Usuario>();
	}

	@Override
	public Usuario createUsuario(Usuario usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario updateUsuario(Long id, Usuario usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		
	}

}
