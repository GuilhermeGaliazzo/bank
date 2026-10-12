package infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street", length = 50)
    private String street;

    @Column(name = "neighborhood", length = 100)
    private String neighborhood;

    @Column(name = "houseNumber", length = 15)
    private String houseNumber;

    @Column(name = "city", length = 100)
    private String city;
}
