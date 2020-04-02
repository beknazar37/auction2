package kg.megacom.auction2.controllers;

import kg.megacom.auction2.model.dto.CustomerDto;
import kg.megacom.auction2.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/custom")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){
        return customerService.saveCustomer(customerDto);
    }

}
