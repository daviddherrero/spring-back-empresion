package tfg.backend.empresion.service.impl;

import java.io.File;
import java.util.List;

import tfg.backend.empresion.domain.User;
import tfg.backend.empresion.dto.OrdersDTO;
import tfg.backend.empresion.service.interfaces.IUserService;

public class UserService implements IUserService{

    @Override
    public void saveUser(String name, String password) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateUser(long id, User user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addImage(long id, File image) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User getUser(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public File getImage(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public File getEmail(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<OrdersDTO> getOrders(long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
