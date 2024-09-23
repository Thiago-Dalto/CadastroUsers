package com.sesi.aula4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.aula4.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	

}
