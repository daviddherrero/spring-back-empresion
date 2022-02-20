package tfg.backend.empresion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfg.backend.empresion.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    List<User> findByUserId(Long id);
    List<User> findByUsername(String username);
}
