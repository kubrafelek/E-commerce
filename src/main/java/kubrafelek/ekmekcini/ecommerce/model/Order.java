package kubrafelek.ekmekcini.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Order extends AbstractBaseEntity{

    private double totalPrice;
    private String status;
    private String shipmentAddress;
    private String shipmentDate;
}
