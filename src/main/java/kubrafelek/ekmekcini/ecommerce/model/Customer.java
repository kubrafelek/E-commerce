package kubrafelek.ekmekcini.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Data
@Entity
public class Customer extends User{

    private String address;
    private String phoneNumber;
    private String email;
    private LocalDateTime subscriptionDate;
    private String status;

}
