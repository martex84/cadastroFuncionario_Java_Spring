package martex.project.java.cadastrofuncionario.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class Setor {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
}
