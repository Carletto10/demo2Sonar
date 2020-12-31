package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import com.example.demo.model.entity.Usuario;
import com.example.demo.service.IServiceUsuario;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UsuarioController {

//@Autowired
//@Qualifier("servicioUsuarioAlternativo")
//IServiceUsuario serviceUsuario;
	
@Autowired
//IServiceUsuario servicioUsuario;

@Resource(name="serviceUsuarioMySQL")
IServiceUsuario servicioUsuario;


	@GetMapping("/all")
	public List<Usuario> hello() {
	
	System.out.println("Logger controller");
		return servicioUsuario.getAllUsuarios();
	}
	
	@PostMapping("/create")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return servicioUsuario.createUsuario(usuario);
	}
	
	@PutMapping("/update/{id}")
	public Usuario updateUsuario(@PathVariable Long id,@RequestBody Usuario usuario) {
		return servicioUsuario.updateUsuario(id, usuario);
	}
	
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateUsuario(@PathVariable Long id) {
		servicioUsuario.deleteUsuario(id);
	}
	
}
