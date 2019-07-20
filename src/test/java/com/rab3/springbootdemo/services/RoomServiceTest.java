package com.rab3.springbootdemo.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.rab3.springbootdemo.entities.RoomEntity;
import com.rab3.springbootdemo.repositories.RoomRepository;

@RunWith(MockitoJUnitRunner.class)
public class RoomServiceTest {

	@InjectMocks
	private RoomService roomService;
	
	@Mock
	private RoomRepository roomRepository;
	
	private RoomEntity roomEntity;
	
	@Before
	public void init() {
		//roomService = new RoomService();
		
		roomEntity = new RoomEntity();
		roomEntity.setNumber(205);
		roomEntity.setType(RoomEntity.Type.DOUBLE);
		roomEntity.setIsSmoking(false);
		roomEntity.setBasePrice(76.9d);
		
	}
	
	@Test
	public void testGetRoomByNumber() {
		when(roomRepository.findByNumber(205)).thenReturn(roomEntity);
		//roomService.getRoomByNumber(205).getType();
		assertEquals("DOUBLE", roomService.getRoomByNumber(205).getType());
		assertEquals(null, roomService.getRoomByNumber(206));
	}
	
	// try testing ur controller, @WebMockMvc
}
