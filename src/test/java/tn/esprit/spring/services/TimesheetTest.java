package tn.esprit.spring.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.*;

import java.sql.Time;
import java.util.Date;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class TimesheetTest {
    /*@Autowired
    private ITimesheetService timesheetService;
    @Autowired
    private IEmployeService employeService;

    private static final Logger l = LogManager.getLogger(TimesheetServiceImpl.class);

    @Test
    public void ajouterTimesheet() {
        l.info("ajouteremployeTest");
        int empId = employeService.ajouterEmploye(new Employe("Charni", "Eya", "mail@eya.tn", true, Role.INGENIEUR));

        l.info("AjouterMissionTest");
        int missionId = timesheetService.ajouterMission(new Mission("mission", "mission"));
        Date date = new Date();


        long nb = timesheetService.getNbTimesheet();
        l.info("Nouveau nombre de timesheet:"+nb);

        timesheetService.ajouterTimesheet(missionId, empId, date, date);
        Assert.assertEquals(nb+1, timesheetService.getNbTimesheet());
        Timesheet timesheet = timesheetService.getTimesheet(new TimesheetPK(missionId, empId, date, date));
        Assert.assertNotNull(timesheet);
        Assert.assertEquals(empId, timesheet.getEmploye().getId());
        Assert.assertEquals(missionId, timesheet.getMission().getId());
        timesheetService.deleteTimesheet(new TimesheetPK(missionId, empId, date, date));
        employeService.deleteEmployeById(empId);
        //todo supprimer mission
    }*/
}
