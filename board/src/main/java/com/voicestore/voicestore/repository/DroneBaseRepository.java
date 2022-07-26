package com.voicestore.voicestore.repository;

import com.voicestore.voicestore.model.DroneBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DroneBaseRepository extends JpaRepository<DroneBase, Long> {

    Optional<DroneBase> findByDroneBaseSeq(Long droneBaseSeq);
}
