package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContractService implements IContractService {

	@Autowired
	ContratRepository contratRepository;
	
	ContractService() {
		
	}
	
	ContractService(ContratRepository contratRepository) {
		this.contratRepository = contratRepository;
	}
	
	@Override
	public int add(Contrat contract) {
		Contrat contrat = contratRepository.save(contract);
		return contrat.getReference();
	}

	@Override
	public Contrat update(Contrat contract) {
		return contratRepository.save(contract);
	}

	@Override
	public void deleteById(int id) {
		contratRepository.deleteById(id);
	}

	@Override
	public Contrat get(int id) {
		return contratRepository.findById(id).orElse(null);
	}

	@Override
	public List<Contrat> get() {
		return (List<Contrat>)contratRepository.findAll();
	}

}
