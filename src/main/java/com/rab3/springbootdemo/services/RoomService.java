package com.rab3.springbootdemo.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rab3.springbootdemo.dtos.RoomDto;
import com.rab3.springbootdemo.entities.RoomEntity;
import com.rab3.springbootdemo.entities.RoomEntity.Type;
import com.rab3.springbootdemo.repositories.RoomRepository;

@Service
public class RoomService {
	
	Logger logger = Logger.getLogger(RoomService.class);

	@Autowired
	private RoomRepository roomRepository;

	public void saveRoom(RoomDto roomDto) {
		if (roomDto != null) {
			RoomEntity roomEntity = roomRepository.findByNumber(roomDto.getNumber());
			if (roomEntity == null) {
				roomEntity = new RoomEntity();
				roomEntity.setNumber(roomDto.getNumber());
				logger.debug("debug : type : " + Type.valueOf(roomDto.getType()));
				logger.info("info : type : " + Type.valueOf(roomDto.getType()));
				logger.warn("warn : type : " + Type.valueOf(roomDto.getType()));
				roomEntity.setType(Type.valueOf(roomDto.getType()));
				roomEntity.setTypeDescription(roomDto.getDescription());
				roomEntity.setIsSmoking(roomDto.getIsSmoking());
				roomEntity.setWifiAvailable(roomDto.getWifi());
				roomEntity.setBasePrice(roomDto.getPrice());
				roomRepository.save(roomEntity);
			} else {
				logger.warn("Room number " + roomDto.getNumber() + " already exists");
			}

		} else {
			logger.error("room dto is null");
		}

	}
	
	public RoomDto getRoomByNumber(Integer number) {
		RoomEntity roomEntity = roomRepository.findByNumber(number);
		RoomDto roomDto = null;
		if(roomEntity == null) {
			logger.warn("Room number " + number + " doesnt exists");
		}else {
			roomDto = new RoomDto();
			roomDto.setNumber(roomEntity.getNumber());
			roomDto.setDescription(roomEntity.getTypeDescription());
			roomDto.setType(roomEntity.getType().toString());
			roomDto.setIsSmoking(roomEntity.getIsSmoking());
			roomDto.setWifi(roomEntity.getWifiAvailable());
			roomDto.setPrice(roomEntity.getBasePrice());
		}
		
		return roomDto;
	}
}
