package kubrafelek.ekmekcini.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment extends AbstractBaseEntity{

    private String status;
    private int paypalPaymentId;
}
