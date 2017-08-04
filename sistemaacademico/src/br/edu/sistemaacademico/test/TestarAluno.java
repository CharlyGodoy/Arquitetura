package br.edu.sistemaacademico.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.sistemaacademico.dao.AlunoDao;
import br.edu.sistemaacademico.dao.PetDao;
import br.edu.sistemaacademico.dao.UsuarioDao;
import br.edu.sistemaacademico.entity.Aluno;
import br.edu.sistemaacademico.entity.Pet;
import br.edu.sistemaacademico.entity.Usuario;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarAluno {

	@Test
	public void cadastrarAluno() {
		
		Aluno a = new Aluno();
		a.setId(null);
		a.setNome("Charly");
		a.setMatricula("1615060");
		
		new AlunoDao().salvar(a);
		
		Assert.assertEquals(true, a.getId() != null);
		
	}
	
	@Test
	public void listarAluno() {
		
		List<Aluno> alunos = new AlunoDao().listar();
		
		Assert.assertEquals(true, alunos.size() > 0);
		
	}
	
//	@Test
//	public void cadastrarUsuario() {
//		
//		Usuario novoUsuario = new Usuario();
//		novoUsuario.setUsuarioId(null);
//		novoUsuario.setNome("Charly");
//		novoUsuario.setEndereco("1615060");
//		novoUsuario.setTelefone("9999-0000");
//		novoUsuario.setLogin("CharlyGodoy");
//		novoUsuario.setSenha("123");
//		novoUsuario.setCpf("123456789");
//		novoUsuario.setTipoUsuario(1);
//		
//		new UsuarioDao().salvar(novoUsuario);
//		
//		Assert.assertEquals(true, novoUsuario.getUsuarioId() != null);
//		
//	}	
//	
//	
//	@Test
//	public void zcadastrarPet() {
//		
//		Pet novoPet = new Pet();
//		novoPet.setPetId(null);
//		novoPet.setNome("Charly");
//		novoPet.setTipo("Peixe");
//		novoPet.setRaca("Tubarão-Martelo");
//		novoPet.setPeso(120.5);
//		novoPet.setDataNascimento(null);
//		//novoPet.setUsuario();
//		
//		new PetDao().salvar(novoPet);
//		
//		Assert.assertEquals(true, novoPet.getPetId() != null);
//		
//	}
	
}
