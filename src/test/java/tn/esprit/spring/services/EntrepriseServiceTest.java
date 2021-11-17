package tn.esprit.spring.services;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;

public class EntrepriseServiceTest {

	@Mock
	EntrepriseRepository entrepriseRepoistory;
	
	 Logger l = LoggerFactory.getLogger(EntrepriseServiceTest.class);
	
	//Logger    l2  


	
	// create  entreprise test  ajoutTest
	/*
	 @Test
	    public void createEmployeeTest()
	    {
		 Entreprise c = new Entreprise(1,"ebtr111221","social1");
			
			assertNotNull(c.getName());
		l.info("retrieveUser : "+ c);
			entrepriseRepoistory.save(c);
			l.info("addUser : "+ c);
			assertTrue(c.getName().equals("ebtr1"));
			fail("Not yet implemented");
		 
	    }
	    
	
	 @Test
	     public void getEmployeeTest()
	    {
		
	List<Entreprise> ent = (List<Entreprise>)	entrepriseRepoistory.findAll();
			
			assertTrue(ent.equals(null));
			l.info("listtrouvée");
            fail("Not yet implemented");
		 
	    }
	    
	*/
	 @Autowired
		IEntrepriseService service;
		
		@Autowired
		EntrepriseRepository repoistory;
		
		@Autowired
		DepartementRepository drep;
		
		
		
		
		@Test
		public void AjouterEntreprise()
		{
		  try {
				
			Entreprise E=new Entreprise("entreprise1", "souha");
			ArrayList <Entreprise> liste1 =(ArrayList<Entreprise>) repoistory.findAll();
			int size1=liste1.size();
			l.info("nb d'entreprises avant l'ajout: " + size1);
			l.info("ajouter entreprise.");
			int id=service.ajouterEntreprise(E);
			ArrayList <Entreprise> liste2 =(ArrayList<Entreprise>) repoistory.findAll();
			int size2=liste2.size();
			l.info("nb d'entreprises apres l'ajout: " + size2);
			l.info("comparaison size");
			assertTrue(size2==size1+1);
			service.deleteEntrepriseById(id);
			l.info("supprimer entreprise.");
			l.info(" test sans erreurs.");
		   }catch (Exception e) { l.error("Erreur : " + e); }
		}
		
		
		
		@Test
		public void AjouterDepartement()
		{
			try {
				l.info(" testAjouterDepart :");
				Departement D=new Departement("informatique");
				D.setEntreprise(null);
				l.info("création de depart ");
				int id=service.ajouterDepartement(D);
				l.info("ajout depart ");
				l.info(" id du depart "+id);
				l.info(" teste id ");
				assertTrue(id!=0);
				l.info(" supprime le depart"); 
				service.deleteDepartementById(id);
				l.info("testAjouterDepart sans erreurs.");
			}catch (Exception e) { l.error("Erreur : " + e); }
		}
		


		@Test
		public void testAffecterDepartement()
		{
			try {
				l.info("testAjouterDepartement:");
				l.info("création entreprise ");
				Entreprise E=new Entreprise("entreprise", "souha");
				l.info(" création depart ");
				Departement D=new Departement("informatique");
				l.info(" ajouter entreprise ");
				int id_entreprise=service.ajouterEntreprise(E);
				l.info(" depart ");
				int id_departement=service.ajouterDepartement(D);
				l.info("affectation ");
				service.affecterDepartementAEntreprise(id_departement, id_entreprise);
				l.info("bd");
				Departement D1=drep.findById(id_departement).get();
				l.info("tester l'affectation ");
				assertTrue(D1.getEntreprise().getId()==id_entreprise);
				l.info(" supprimer depart");
				service.deleteDepartementById(id_departement);
				l.info("supprimer l'entreprise");
				service.deleteEntrepriseById(id_entreprise);
				l.info("testAffecterDepart sans erreurs.");
			}catch (Exception e) { l.error("Erreur " + e); }
		}
		
		
		@Test
		public void testSupprimerEntreprise()
		{
		    try{
			l.info("testSupprimerEntreprise:");
			l.info("création");
			Entreprise E=new Entreprise("entreprise ", "souha");
			l.info("ajout ");
			int id_entreprise=service.ajouterEntreprise(E);
			l.info("supprimer");
			service.deleteEntrepriseById(id_entreprise);
			assertNull(service.getEntrepriseById(id_entreprise));
			l.info("testSupprimerEntreprise sans erreurs.");
		  }catch (Exception e) { l.error("Erreur : " + e); }
		}
		
		
		
		@Test
		public void testSupprimerDepartement()
		{
			try{
				
				
				
				l.info("testSupprimerEntreprise :");
				l.info(" création  departement.");
				Departement D=new Departement(" informatique ");
				D.setEntreprise(null);
				l.info("ajouter departement.");
				int id_departement=service.ajouterDepartement(D);
				l.info("supprimer departement.");
				service.deleteDepartementById(id_departement);
				assertNull(drep.findById(id_departement).orElse(null));
			}catch (Exception e) { l.error("Erreur : " + e); }
		}
	}