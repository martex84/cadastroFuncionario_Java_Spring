package martex.project.java.cadastrofuncionario.controller;

import martex.project.java.cadastrofuncionario.model.Funcao;
import martex.project.java.cadastrofuncionario.service.FuncaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcao")
public class FuncaoController {

    @Autowired
    private FuncaoService funcaoService;

    @PostMapping
    public Funcao createFuncao(@RequestBody Funcao funcao){
        return funcaoService.set(funcao);
    }
}
