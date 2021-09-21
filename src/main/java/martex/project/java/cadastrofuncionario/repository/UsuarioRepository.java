package martex.project.java.cadastrofuncionario.repository;

import martex.project.java.cadastrofuncionario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {}
