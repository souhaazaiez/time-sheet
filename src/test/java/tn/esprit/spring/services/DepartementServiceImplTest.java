package tn.esprit.spring.services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;


/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DepartementServiceImplTest {

    /*@Autowired
    private IEmployeService employeService;
    @Autowired
    private IEntrepriseService entrepriseService;

    private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);


    @Test
    public void ajouterDepartementTest(){
        l.info("debut ajouterDepartementTest");
        int nbEmps = employeService.getNombreEmployeJPQL();
        l.info("Nombre employes: "+nbEmps);
        int idEmp = employeService.ajouterEmploye(new Employe("Moulahi", "Mondher", "mondher.moulahi@esprit.tn", true, Role.INGENIEUR));
        l.info("id employe: "+idEmp);
        int idDep = entrepriseService.ajouterDepartement(new Departement("Finance"));
        employeService.affecterEmployeADepartement(idEmp,idDep);
        l.info("id departement"+idDep);
        int newNbEmps = employeService.getNombreEmployeJPQL();
        l.info("Nouveau nombre employes: "+newNbEmps);
        Assert.assertEquals(nbEmps+1, newNbEmps);
        Employe e = employeService.getAllEmployes().stream().filter(emp -> emp.getId() == idEmp).findFirst().orElse(null);
        l.info("employe: "+e);
        Assert.assertNotNull(e);
        Assert.assertEquals("Moulahi", e.getNom());
        Assert.assertEquals("Mondher", e.getPrenom());
        Assert.assertEquals("mondher.moulahi@esprit.tn", e.getEmail());
        Assert.assertEquals("Finance", e.getDepartements().get(e.getDepartements().size()-1).getName());
        Assert.assertTrue(e.isActif());
        Assert.assertEquals(Role.INGENIEUR, e.getRole());
        employeService.deleteEmployeById(idEmp);
        l.info("fin ajouterDepartementTest");
        //comment
    }

    @Test
    public void deleteDepartementByIdTest(){
        l.info("debut deleteDepartementByIdTest");
        int idDep = entrepriseService.ajouterDepartement(new Departement("Finance"));
        l.info("id departement: "+idDep);
        int idEmp = employeService.ajouterEmploye(new Employe("Moulahi", "Mondher", "mondher.moulahi@esprit.tn", true, Role.INGENIEUR));
        l.info("id employe: "+idEmp);
        employeService.affecterEmployeADepartement(idEmp,idDep);
        l.info("affecter employe au departement");
        int nbEmps = employeService.getNombreEmployeJPQL();
        l.info("Nombre employes: "+nbEmps);
        employeService.deleteEmployeById(idEmp);
        int newNbEmps = employeService.getNombreEmployeJPQL();
        l.info("Nouveau nombre employes: "+newNbEmps);
        Assert.assertEquals(nbEmps-1, newNbEmps) ;
        Employe e = employeService.getAllEmployes().stream().filter(emp -> emp.getId() == idEmp).findFirst().orElse(null);
        l.info("employe: "+e);
        Assert.assertNotNull(e);
    }

    @Test
    public void affecterEmployeADepartementTest(){
        l.info("debut deleteDepartementByIdTest");
        int idDep = entrepriseService.ajouterDepartement(new Departement("Finance"));
        l.info("id departement: "+idDep);
        int idEmp = employeService.ajouterEmploye(new Employe("Moulahi", "Mondher", "mondher.moulahi@esprit.tn", true, Role.INGENIEUR));
        l.info("id employe: "+idEmp);
        employeService.affecterEmployeADepartement(idEmp,idDep);
        l.info("affecter employe au departement");
        Employe e = employeService.getAllEmployes().stream().filter(emp -> emp.getId() == idEmp).findFirst().orElse(null);
        l.info("employe: "+e);
        Assert.assertEquals("Finance", e.getDepartements().get(e.getDepartements().size()-1).getName());
        Assert.assertNotNull(e);
    }*/
}
