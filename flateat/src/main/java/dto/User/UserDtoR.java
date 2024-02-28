package dto.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class UserDtoR extends UserDtoBase
{
    public UserDtoR(){};
    private Integer id;
}
