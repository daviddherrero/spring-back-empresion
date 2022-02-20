package tfg.backend.empresion.controller.interfaces;

import java.io.File;
import java.util.List;

import tfg.backend.empresion.domain.User;
import tfg.backend.empresion.dto.OrderDTO;

public interface IUserController {
    
    void saveUser(User user);

    void updateUser(User user);

    void addImage(long id, File image);

    User getUser(long id);

    File getImage(long id);

    String getEmail(long id);

    List<OrderDTO> getOrders(long id);
}
