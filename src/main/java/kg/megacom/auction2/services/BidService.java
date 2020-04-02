package kg.megacom.auction2.services;

import kg.megacom.auction2.model.dto.BidDto;

public interface BidService {
    BidDto saveBid(BidDto bidDto);
}
