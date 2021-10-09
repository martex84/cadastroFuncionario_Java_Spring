package martex.project.java.cadastrofuncionario.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Setor {

    @Id
    @GeneratedValue
    @Column(name = "setor_id")
    private long id;

    private String nome;
}
