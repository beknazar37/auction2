package kg.megacom.auction2.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue
    @Column(name = "bid_id")
    private Long id;
    private Date addDate;
    private double bidValue;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
