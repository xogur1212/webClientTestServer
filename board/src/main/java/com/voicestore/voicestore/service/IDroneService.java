package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.Drone;
import com.voicestore.voicestore.model.dto.Result;
import com.voicestore.voicestore.model.dto.request.DroneRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IDroneService {

    Result updateDrone(Drone drone);

    Result changeStatus(Drone drone, int armStatus);

    Result saveDrone(Drone drone);

    Result deleteDrone(Drone drone);

    List<?> findDroneList(DroneRequest droneRequest);

    Sort sortByUpdateDt();

    Drone findDrone(Drone drone);

    //error시 response 작성
    Drone findOneDrone(Long droneId);

    List<Drone> findAllDrone();

    Object getSocketDrone();

}
