package tn.esprit.spring.services;

import tn.esprit.spring.entities.Mission;

import java.util.List;

public interface IMissionService {

     int ajouterMission(Mission mission);
     List<Mission> getAllMissions();
     void deleteMission(int missionId);
}
