package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.Mission;
import com.voicestore.voicestore.model.dto.Result;

import java.util.List;
import java.util.Map;

public interface IMissionService {

    List<Mission> findAllMission();

    Mission findOneMission(Long missionSeq);

    List<Mission> findMissionList(Map<String, Object> paramMap);

    Long saveMission(Mission mission);

    int updateMission(Mission mission);

    Result deleteMission(Mission mission);

}
