package martex.project.java.cadastrofuncionario.service;

import martex.project.java.cadastrofuncionario.model.Funcao;
import martex.project.java.cadastrofuncionario.repository.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FuncaoService {

    private FuncaoRepository funcaoRepository;

    @Autowired
    public FuncaoService(FuncaoRepository funcaoRepository){
        this.funcaoRepository = funcaoRepository;
    }

    public List<Funcao> getAll(){
        return funcaoRepository.findAll();
    }

    public Optional<Funcao> getById(long idJornada){
        return Optional.of(funcaoRepository.getById(idJornada));
    }

    public Funcao set(Funcao funcao){
        return funcaoRepository.save(funcao);
    }

}
