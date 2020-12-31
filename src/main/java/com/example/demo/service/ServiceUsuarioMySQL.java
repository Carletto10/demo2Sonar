package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.repository.UsuarioRepository;
import com.example.demo.model.entity.Usuario;

@Service
public class ServiceUsuarioMySQL  implements IServiceUsuario{

	@Autowired
	UsuarioRepository  usuarioRepository;
	
	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario createUsuario(Usuario usr) {
		return  usuarioRepository.save(usr);
	}

	@Override
	public Usuario updateUsuario(Long id, Usuario usr) {
		
		Usuario usrP = usuarioRepository.findById(id).get();
	
		usrP.setNombre(usr.getNombre());
		usrP.setApellido(usr.getApellido());
		usrP.setPassword(usr.getPassword());
		usrP.setEdad(usr.getEdad());
		
		usrP = usuarioRepository.save(usrP);
		// TODO Auto-generated method stub
		return usrP;
	}

	@Override
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);		
	}

	
}
