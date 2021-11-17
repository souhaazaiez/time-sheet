package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.MissionRepository;

import java.util.List;

@Service
public class MissionServiceImpl implements IMissionService {

    @Autowired
    MissionRepository missionRepository;
    public List<Mission> getAllMissions() {
        return (List<Mission>) missionRepository.findAll();
    }

    public int ajouterMission(Mission mission) {
        missionRepository.save(mission);
        return mission.getId();
    }

    public Long getNbrMission()
    {
        return missionRepository.count();

    }

    public void deleteMission(int missionId)
    {
        Mission mission = missionRepository.findById(missionId).orElse(null);
        assert mission != null;
        missionRepository.delete(mission);
    }


}
