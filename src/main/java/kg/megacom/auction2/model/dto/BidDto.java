package kg.megacom.auction2.model.dto;

import kg.megacom.auction2.model.entity.Customer;
import kg.megacom.auction2.model.entity.Lot;
import lombok.Data;

import java.util.Date;

@Data
public class BidDto {
    private Long id;
    private Date addDate;
    private double bidValue;
    private boolean active;
    private Lot lot;

    private Customer customer;
}
