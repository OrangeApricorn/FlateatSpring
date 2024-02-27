package converter;

import dto.User.UserDtoBase;
import dto.User.UserDtoW;
import entities.User;

public class UserConverter {

    public static UserDtoBase convertToDtoBase(User user) {
        return UserDtoBase.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public static UserDtoW convertToDtoW(User user) {
        return UserDtoW.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .phone(user.getPhone())
                .deliveries(user.getDeliveries())
                .build();
    }

    public static User convertToEntity(UserDtoBase userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
       
        return user;
    }

    public static User convertToEntity(UserDtoW userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());
        user.setDeliveries(userDto.getDeliveries());
        
        return user;
    }
}
