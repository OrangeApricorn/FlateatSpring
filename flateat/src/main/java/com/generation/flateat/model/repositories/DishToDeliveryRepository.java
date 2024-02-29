package com.generation.flateat.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.flateat.model.entities.DishToDelivery;


public interface DishToDeliveryRepository extends JpaRepository<DishToDelivery,Integer>
{

}