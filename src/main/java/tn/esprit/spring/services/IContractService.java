package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;

public interface IContractService {
	public int add(Contrat contract);
	public Contrat update(Contrat contract);
	public void deleteById(int id);
	public Contrat get(int id);
	public List<Contrat> get();
}
