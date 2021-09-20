package martex.project.java.cadastrofuncionario.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
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
    private String idFuncao;

    @ManyToOne
    private String idSetor;


}
