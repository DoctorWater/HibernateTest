package Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Dog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dog_id;
    private String name;
    private byte age;
    private Long owner_id;
}
