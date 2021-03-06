package kubrafelek.ekmekcini.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbstractBaseEntity{

    private String name;
    private String description;
    private double price;
    private int quantity;
    private int stock;
    private String status;
    private Long vendorId;

}
