package tfg.backend.empresion.service.interfaces;

import java.io.File;
import java.util.Date;
import java.util.List;

import tfg.backend.empresion.domain.Order;
import tfg.backend.empresion.dto.OrderDTO;
import tfg.backend.empresion.dto.UserDTO;

public interface IOrderService {

    Object getFileByOrderId = null;

    File getEmail(long id);

    UserDTO getUser(long id);

    OrderDTO getOrderById(long id);

    List<OrderDTO> getOrdersByUserId(long id);

    Date getCreationDate(long id);

    String getOrderStatus(long id);

    void addOrder(Order order);

    void updateOrder(Order order);

    String getFileByOrderId(long id);
}
