package tfg.backend.empresion.controller.impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tfg.backend.empresion.controller.interfaces.IOrderController;
import tfg.backend.empresion.domain.Order;
import tfg.backend.empresion.dto.OrderDTO;
import tfg.backend.empresion.dto.UserDTO;
import tfg.backend.empresion.service.interfaces.IOrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController implements IOrderController{
    
    @Autowired
    private IOrderService service;

    @PostMapping("/add/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void addOrder(@RequestBody Order order){
        service.addOrder(order);
    }

    @PostMapping("/update/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateOrder(@RequestBody Order order){
        service.updateOrder(order);
    }

    @GetMapping("/getOrders/users/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public List<OrderDTO> getOrdersByUserId(@PathVariable long id){
        return service.getOrdersByUserId(id);
    }

    @GetMapping("/getOrder/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public OrderDTO getOrderById(@PathVariable long id){
        return service.getOrderById(id);
    }

    @GetMapping("/getEmail/users/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Date getCreationDate(@PathVariable long id){
        return service.getCreationDate(id);
    }

    @GetMapping("/getOrders/users/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UserDTO getUser(@PathVariable long id){
        return service.getUser(id);
    }

    @GetMapping("/getEmail/users/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public String getOrderStatus(@PathVariable long id){
        return service.getOrderStatus(id);
    }

    @Override
    public String getFileByOrderId(@PathVariable long id) {
        return service.getFileByOrderId(id);
    }

}
