package martex.project.java.cadastrofuncionario.repository;

import martex.project.java.cadastrofuncionario.model.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao,Long> {}
