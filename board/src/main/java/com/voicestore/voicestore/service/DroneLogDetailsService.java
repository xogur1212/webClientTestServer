package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.DroneLogDetails;
import com.voicestore.voicestore.repository.DroneLogDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DroneLogDetailsService implements IDroneLogDetailsService {

    private final DroneLogDetailsRepository droneLogDetailsRepository;

    @Override
    public DroneLogDetails saveDroneLogDetails(DroneLogDetails droneLogDetails) {


        return droneLogDetailsRepository.save(droneLogDetails);
    }


}
