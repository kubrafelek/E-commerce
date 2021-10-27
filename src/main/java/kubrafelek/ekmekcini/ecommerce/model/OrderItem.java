package kubrafelek.ekmekcini.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class OrderItem extends AbstractBaseEntity{

    private String product;
    private int quantity;
}
