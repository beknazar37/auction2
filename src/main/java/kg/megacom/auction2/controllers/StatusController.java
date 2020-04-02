package kg.megacom.auction2.controllers;

import kg.megacom.auction2.model.dto.StatusDto;
import kg.megacom.auction2.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/status")
public class StatusController {
    @Autowired
    private StatusService statusService;
    @PostMapping
    public StatusDto saveStatus(@RequestBody StatusDto statusDto){
        return statusService.saveStatus(statusDto);
    }

}
