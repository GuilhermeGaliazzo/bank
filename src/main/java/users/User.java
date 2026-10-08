package users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 50, nullable = false, unique = true)
    private String id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "cpf", length = 15, nullable = false, unique = true)
    private String cpf;

    @Column(name = "birthDate", length = 50, nullable = false)
    private LocalDate birthDate;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "telephone", length = 50, nullable = false)
    private String telephone;

    @Column(name = "password", length = 50, nullable = false)
    private String password;

    @Column(name = "status", length = 3, nullable = false)
    private String status;

    @Column(name = "creationDate", length = 50, nullable = false)
    private LocalDate creationDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")

}
