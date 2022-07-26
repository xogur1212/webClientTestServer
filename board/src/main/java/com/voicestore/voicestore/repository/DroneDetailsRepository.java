package com.voicestore.voicestore.repository;

import com.voicestore.voicestore.model.DroneDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneDetailsRepository extends JpaRepository<DroneDetails, Long> {

    DroneDetails findByDroneDetailsSeq(Long droneDetailsSeq);
}
