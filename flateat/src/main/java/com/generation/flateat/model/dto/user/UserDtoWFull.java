package com.generation.flateat.model.dto.user;
import java.util.Set;

import com.generation.flateat.model.entities.Delivery;

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

public class UserDtoWFull extends UserDtoBase
{
    private Integer id;
    private String phone;
    private int positionX;
    private int positionY;
    private Set<Delivery> deliveries;
}