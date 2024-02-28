package com.generation.flateat.model.dto.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RestaurantDtoWNoUser extends RestaurantDtoBase
{
    private Integer id;
    private boolean isOpen;
}
