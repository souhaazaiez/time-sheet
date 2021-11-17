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
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.MissionRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionServiceIpmlTest {


  private static final Logger l = LogManager.getLogger(TimesheetServiceImpl.class);
    @Autowired
    MissionServiceImpl missionService;
    @Autowired
    TimesheetServiceImpl timesheetService;
    @Autowired
    MissionRepository missionRepository;
    @Autowired
    DepartementRepository deptRepository;
    @Autowired
    EntrepriseServiceImpl entrepriseService;

    @Test
    public void ajouterMission() {
        l.info("Add test for mission");
        Long InitNbrMission = missionService.getNbrMission();
        l.info("Nr mission initital : " + InitNbrMission);
        int idMission = missionService.ajouterMission(new Mission("Teaching English", "teaching english for students"));
        l.info("id Mission : " + idMission);
        Long NbrMissionAfter = missionService.getNbrMission();
        l.info("nbr mission aprés ajout" + NbrMissionAfter);
        Mission m = missionService.getAllMissions().stream().filter(mission -> mission.getId() == idMission).findFirst().orElse(null);

        l.info("Mission is : " + m);
        //Assert.assertNotNull(m);
        Assert.assertEquals("Teaching English", m.getName());
        Assert.assertEquals("teaching english for students", m.getDescription());
        l.info("Test validated");

    }

    @Test
    public void DeleteMissionById() {
        l.info("debut Test");
        int idMission = missionService.ajouterMission(new Mission("Teaching English", "teaching english for students"));
        l.info("id de la mission : " + idMission);
        Long InitNbrMission = missionService.getNbrMission();
        l.info("Nombre mission: " + InitNbrMission);
        missionService.deleteMission(idMission);
        Long numberNew = missionService.getNbrMission();
        l.info("Nouveau nombre employes: " + numberNew);
        Assert.assertNotEquals(InitNbrMission, numberNew);
        Mission m = missionService.getAllMissions().stream().filter(mission -> mission.getId() == InitNbrMission).findFirst().orElse(null);
        l.info("mission: " + m);
        //Assert.assertNotNull(m);
        l.info("fin deleteEmployeByIdTest");
    }

    @Test
    public void affecterMissionADepartementTest() {
        l.info("debut Test");
        int idMission = missionService.ajouterMission(new Mission("Teaching English", "teaching english for students"));
        l.info("id de la mission : " + idMission);
        Mission mission = missionRepository.findById(idMission).get();
        int idDep = entrepriseService.ajouterDepartement(new Departement("Finance"));
        Departement dep = deptRepository.findById(idDep).get();
        //Assert.assertNotNull(mission);
        //Assert.assertNotNull(dep);
        Assert.assertEquals("Teaching English", mission.getName());
        Assert.assertEquals("teaching english for students", mission.getDescription());
        mission.setDepartement(dep);
        missionRepository.save(mission);
        //Assert.assertNotNull(mission);
        Mission mission1 = missionService.getAllMissions().stream().filter(m -> m.getId() == idMission).findFirst().orElse(null);
        l.info("mission: " + mission1);
        //Assert.assertNotNull(mission1);
        l.info("Fin  Test");
    }
}
