package kg.megacom.auction2.model.dto;


import kg.megacom.auction2.model.entity.Status;
import lombok.Data;

import java.util.Date;

@Data
public class LotDto {
    private Long id;
    private double minPrice;
    private double maxPrice;
    private double step;
    private Date startDate;
    private Date endDate;
    private Status status;

}
