package com.sesi.aula4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sesi.aula4.Repository.UsuarioRepository;
import com.sesi.aula4.model.Usuario;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuariorepository;
	@GetMapping("/usuario")
	public String ListarUsuarios(Model modelo) {
		List<Usuario> usuarios = new ArrayList<Usuario>();	
		
		
		
		modelo.addAttribute("usuarios", usuarios);
		
		return "usuarios";
	}

}
	