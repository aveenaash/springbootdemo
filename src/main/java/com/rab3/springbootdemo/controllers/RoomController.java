package com.rab3.springbootdemo.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.springbootdemo.dtos.RoomDto;
import com.rab3.springbootdemo.services.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	Logger logger = Logger.getLogger(RoomController.class);
	
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createRoom(@RequestBody @Valid RoomDto roomDto) {
		logger.info("entered createroom RoomController");
		roomService.saveRoom(roomDto);
	}
	
	@RequestMapping(value = "/number/{roomNumber}", method = RequestMethod.GET)
	public RoomDto getRoom(@PathVariable Integer roomNumber) {
		logger.info("entered getRoom RoomController");
		return roomService.getRoomByNumber(roomNumber);
	}

}
