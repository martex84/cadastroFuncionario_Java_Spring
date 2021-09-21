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
public class Funcao {


    @Id
    @GeneratedValue
    @Column(name = "funcao_id")
    private long id;

    private String nome;
    private String descricao;
}
