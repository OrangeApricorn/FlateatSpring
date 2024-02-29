package com.generation.flateat.model.dto.dish;

import com.generation.flateat.model.entities.Menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class DishDtoWNoDeliveries extends DishDtoBase
{
    private Integer id;
    private Menu menu;
}