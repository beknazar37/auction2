package kg.megacom.auction2.services.impl;

import kg.megacom.auction2.database.BidRepository;
import kg.megacom.auction2.mappers.ClassMapper;
import kg.megacom.auction2.model.dto.BidDto;
import kg.megacom.auction2.model.entity.Bid;
import kg.megacom.auction2.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {
    @Autowired
    private BidRepository bidRepository;
    @Autowired
    private ClassMapper classMapper;

    @Override
    public BidDto saveBid(BidDto bidDto) {
        Bid bid=classMapper.bidDtoToBid(bidDto);
        bid=bidRepository.save(bid);
        bidDto=classMapper.bidToBidDto(bid);
        return bidDto;
    }
}
