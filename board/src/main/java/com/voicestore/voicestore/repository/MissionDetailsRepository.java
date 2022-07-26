package com.voicestore.voicestore.repository;

import com.voicestore.voicestore.model.Mission;
import com.voicestore.voicestore.model.MissionDetails;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionDetailsRepository extends JpaRepository<MissionDetails,Long> {


    List<MissionDetails> findAllByName(String name);

    MissionDetails findByNameAndMission(String name, Mission mission);

    List<MissionDetails> findAllByMission(Mission mission, Sort sort);

    List<MissionDetails> findAllByMission(Mission mission);

    MissionDetails findByIndex(int index);

    MissionDetails findByMissionAndIndex(Mission mission,int index);

    Long deleteByMission(Mission mission);
}
