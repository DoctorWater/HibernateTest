package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "owner", schema = "public")
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long owner_id;
    @Column(nullable = false)
    private String name;
}
