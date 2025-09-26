package dev.java10x.CadastroDeClientes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //vai mapear o
// arquivo do java controller e dizer q aquilo é o controller
@RequestMapping // coloca todas as rotas no msm lugar

public class Controller {
    @GetMapping("/boasVindas") // vai pegar informacoes de boasVindas
    public String boasVindas(){
        return "Essa é minha primeira msg nessa rota";
    }
}
