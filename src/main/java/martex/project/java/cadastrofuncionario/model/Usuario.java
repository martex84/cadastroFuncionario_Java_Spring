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
public class Usuario {

    @Id
    @GeneratedValue
    private long id;

    private String dataNascimento;
    private String cpf;
    private String nome;
    private String telefone;
    private String cidade;
    private String estado;
    private String endereco;
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "funcao_id")
    private Funcao idfuncao;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor idSetor;


}
