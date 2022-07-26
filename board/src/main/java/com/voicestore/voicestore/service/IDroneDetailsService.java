package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.DroneDetails;
import com.voicestore.voicestore.model.dto.Result;
import com.voicestore.voicestore.model.dto.request.DroneDetailRequest;

public interface IDroneDetailsService {

    DroneDetails saveDroneDetails(DroneDetails droneDetails, Long droneId);

    Result updateDroneDetails(DroneDetailRequest droneDetailRequest);

    DroneDetails findDroneDetails(Long droneDetailsSeq);

    Result updateDroneDetailsFileName(String fileName, long droneSeq);


}
