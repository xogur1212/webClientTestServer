package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.DroneBase;
import com.voicestore.voicestore.repository.DroneBaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DroneBaseService implements IDroneBaseService{
    private final DroneBaseRepository droneBaseRepository;

    @Override
    public List<DroneBase> findAllDroneBase() {
        return droneBaseRepository.findAll();
    }
}
