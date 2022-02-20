package tfg.backend.empresion.controller.impl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tfg.backend.empresion.domain.User;
import tfg.backend.empresion.dto.OrderDTO;
import tfg.backend.empresion.service.interfaces.IUserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService service;

    @PostMapping("/add/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void saveUser(@RequestBody  User user){
        service.saveUser(user);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateUser(@PathVariable long id, @RequestBody User user){
        service.updateUser(id, user);
    }

    @PostMapping("/addImage/{ids}")
    @ResponseStatus(value = HttpStatus.OK)
    public void addImage(@PathVariable long id, File image){
        service.addImage(id, image);
    }

    @GetMapping("/getUser/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public User getUser(@PathVariable long id){
        return service.getUser(id);
    }

    @GetMapping("/getImage/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public File getImage(@PathVariable long id){
        return service.getImage(id);
    }

    @GetMapping("/getEmail/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public String getEmail(@PathVariable long id){
        return service.getEmail(id);
    }

    @GetMapping("/getEmail/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<OrderDTO> getOrders(@PathVariable long id){
        return service.getOrders(id);
    }
  
}
