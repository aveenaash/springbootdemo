package com.rab3.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rab3.springbootdemo.dtos.RoomDto;
import com.rab3.springbootdemo.entities.RoomEntity;
import com.rab3.springbootdemo.entities.RoomEntity.Type;
import com.rab3.springbootdemo.repositories.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public void saveRoom(RoomDto roomDto) {
		if (roomDto != null) {
			RoomEntity roomEntity = roomRepository.findByNumber(roomDto.getNumber());
			if (roomEntity == null) {
				roomEntity = new RoomEntity();
				roomEntity.setNumber(roomDto.getNumber());
				System.out.println("type : " + Type.valueOf(roomDto.getType()));
				roomEntity.setType(Type.valueOf(roomDto.getType()));
				roomEntity.setTypeDescription(roomDto.getDescription());
				roomEntity.setIsSmoking(roomDto.getIsSmoking());
				roomEntity.setWifiAvailable(roomDto.getWifi());
				roomEntity.setBasePrice(roomDto.getPrice());
				roomRepository.save(roomEntity);
			} else {
				System.out.println("Room number " + roomDto.getNumber() + " already exists");
			}

		} else {
			System.out.println("room dto is null");
		}

	}
}
