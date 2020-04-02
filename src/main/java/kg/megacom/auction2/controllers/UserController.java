package kg.megacom.auction2.controllers;


import kg.megacom.auction2.model.dto.UserDto;
import kg.megacom.auction2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }


}
