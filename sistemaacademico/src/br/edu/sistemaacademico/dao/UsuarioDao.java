package br.edu.sistemaacademico.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.sistemaacademico.entity.Usuario;

public class UsuarioDao {

	static List<Usuario> usuarios = new ArrayList<Usuario>();
	static Long counter = 0l;

	public void salvar(Usuario novoUsuario) {
		novoUsuario.setUsuarioId(counter);
		usuarios.add(novoUsuario);
		counter++;
		
	}
}
