package com.voicestore.voicestore.service;

import com.voicestore.voicestore.model.DroneSocket;

import java.util.List;

public interface IDroneSocketService {

    List<DroneSocket> getList();

    void saveList(DroneSocket droneSocket);

    void delete();
}
