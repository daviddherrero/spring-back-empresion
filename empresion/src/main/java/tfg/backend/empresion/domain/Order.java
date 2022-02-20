package tfg.backend.empresion.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id")
    private User user;
    
    private String status;
    private String file;
    private Date created_at;
    private Date completed_at;

}
