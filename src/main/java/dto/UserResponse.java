package dto;

import entity.UserRole;
import lombok.Data;


@Data
public class UserResponse {

    private String id;
    private String firstName;
    private String email;
    private String phone;

    private UserRole role;
    private AddressDto address;


}
