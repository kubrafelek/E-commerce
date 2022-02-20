package kubrafelek.ekmekcini.ecommerce.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @ApiModelProperty(hidden = true)
    private long id;

    @ApiModelProperty(example = "Kübra")
    private String fullName;

    @ApiModelProperty(example = "Felek")
    private String emailAddress;

    private String password;
    private String userType;
    private String phoneNumber;
}
