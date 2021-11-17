package tn.esprit.spring.services;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class ContactServiceImplTest {
	
	/*@Autowired
	private IContractService contractService;

	private static final Logger l = LogManager.getLogger(ContactServiceImplTest.class);
	
	@Test
	public void addTest() {
		l.info("Running ContactServiceImplTest.addTest ...");
		
		try {
			int contactsNumber = contractService.get().size();
			
			contractService.add(new Contrat(new Date(), "", 2.2f));
			
			int newContactsNumber = contractService.get().size();
			
			assertEquals(contactsNumber + 1, newContactsNumber);
		} catch(Exception ex) {
			l.error("Error happening while executing ContactServiceImplTest.addTest "
					+ "StackTrace: " + ex.getStackTrace());
		}
		
		l.error("End of ContactServiceImplTest.addTest ContactServiceImplTest.addTest");
		
	}
	
	@Test
	public void deleteTest() {
		l.info("Running ContactServiceImplTest.addTest ...");
		
		try {
			int newId = contractService.add(new Contrat(new Date(), "", 2.2f));
			
			int contactsNumber = contractService.get().size();
			
			contractService.deleteById(newId);
			
			int newContactsNumber = contractService.get().size();
			
			assertEquals(contactsNumber - 1, newContactsNumber);
		} catch (Exception ex) {
			l.error("Error happening while executing ContactServiceImplTest.deleteTest "
					+ "StackTrace: " + ex.getStackTrace());
		}
		
		l.info("End of ContactServiceImplTest.addTest");
	}*/
}
