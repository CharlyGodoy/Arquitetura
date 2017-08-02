package br.edu.sistemaacademico.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.sistemaacademico.entity.Pet;

public class PetDao implements InterfaceDao<Pet> {

	static List<Pet> pets = new ArrayList<Pet>();
	static Long counter = 0l;

	public void salvar(Pet novoPet) {
		novoPet.setPetId(counter);
		pets.add(novoPet);
		counter++;
		
	}

	@Override
	public List<Pet> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
