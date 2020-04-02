package kg.megacom.auction2.controllers;

import kg.megacom.auction2.model.dto.BidDto;
import kg.megacom.auction2.services.BidService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bid")
public class BidController {
    private BidService bidService;

    @PostMapping
    public BidDto saveBid(@RequestBody BidDto bidDto) {
        return bidService.saveBid(bidDto);


    }
}