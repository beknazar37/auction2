package kg.megacom.auction2.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue
    @Column(name = "lot_id")
    private Long id;
    private double minPrice;
    private double maxPrice;
    private double step;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
