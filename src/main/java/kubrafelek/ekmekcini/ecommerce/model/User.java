package kubrafelek.ekmekcini.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;
    private String userType;
}
