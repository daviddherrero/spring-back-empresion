package tfg.backend.empresion.controller.interfaces;

import java.io.File;
import java.util.Date;
import java.util.List;

import tfg.backend.empresion.domain.Order;
import tfg.backend.empresion.dto.OrderDTO;
import tfg.backend.empresion.dto.UserDTO;

public interface IOrderController {

    List<OrderDTO> getOrdersByUserId(long id);

    OrderDTO getOrderById(long id);
    
    void addOrder(Order order);

    void updateOrder(Order order);

    Date getCreationDate(long id);

    UserDTO getUser(long id);

    String getOrderStatus(long id);

    String getFileByOrderId(long id);
}
