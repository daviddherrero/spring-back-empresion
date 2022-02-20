package tfg.backend.empresion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.backend.empresion.domain.Order;
import tfg.backend.empresion.domain.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

    List<Order> findByOrderId(Long id);
    List<Order> findByOrderUser(User user);
    
}