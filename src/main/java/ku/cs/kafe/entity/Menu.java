package ku.cs.kafe.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


import java.util.UUID;


@Data
@Entity
public class Menu {


    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Category category;

    private String name;
    private double price;
}
//Aphisit Prasertvesyakorn 6510451085