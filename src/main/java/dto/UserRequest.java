package dto;

import entity.UserRole;
import lombok.Data;

@Data
public class UserRequest {

    private String firstName;
    private String lastName;

    private String email;
    private String phone;

    private UserRole role;

    private AddressDto address;
}
