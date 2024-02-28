package com.generation.flateat.model.dtoservices;

import org.springframework.stereotype.Service;

import com.generation.flateat.model.dto.dish.DishDtoR;
import com.generation.flateat.model.dto.dish.DishDtoWFull;
import com.generation.flateat.model.dto.dish.DishDtoWNoDeliveries;
import com.generation.flateat.model.dto.dish.DishDtoWNoMenu;
import com.generation.flateat.model.entities.Dish;



@Service
public class DishConverter 
{
    public Dish dtoToDish(DishDtoR dto)
    {
        return Dish
                .builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .category(dto.getCategory())
                .ingredients(dto.getIngredients())
                .id(dto.getId())
                .build();
    }

    public DishDtoWFull dishToDtoWFull(Dish dish)
    {
        return DishDtoWFull
                .builder()
                .name(dish.getName())
                .price(dish.getPrice())
                .category(dish.getCategory())
                .ingredients(dish.getIngredients())
                .deliveries(dish.getDeliveries())
                .id(dish.getId())
                .build();
    }

    public DishDtoWNoDeliveries dishToDtoWNoDeliveries(Dish dish)
    {
        return DishDtoWNoDeliveries
                .builder()
                .name(dish.getName())
                .price(dish.getPrice())
                .category(dish.getCategory())
                .ingredients(dish.getIngredients())
                .id(dish.getId())
                .menu(dish.getMenu())
                .build();
    }

    public DishDtoWNoMenu dishToDtoWNoMenu (Dish dish)
    {
        return  DishDtoWNoMenu
                .builder()
                .name(dish.getName())
                .price(dish.getPrice())
                .category(dish.getCategory())
                .ingredients(dish.getIngredients())
                .id(dish.getId())
                .deliveries(dish.getDeliveries())
                .build();
    }
    
}
