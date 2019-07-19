package com.rab3.springbootdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rab3.springbootdemo.entities.RoomEntity;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

	RoomEntity findByNumber(Integer number);
}
