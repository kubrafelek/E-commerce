package kubrafelek.ekmekcini.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends AbstractBaseEntity{

    private String name;
    private String description;
}
