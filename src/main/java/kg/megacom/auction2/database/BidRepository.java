package kg.megacom.auction2.database;

import kg.megacom.auction2.model.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<Bid,Long> {
}
