package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.controller;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.AutenticacaoDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.UsuarioDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.PessoaRepository;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
        ("/autenticacao")
@CrossOrigin(origins = "http://localhost:8080")

public class AutenticacaoController {
    @Autowired
    private AutenticacaoService autenticacaoService;
    @Autowired
    private PessoaRepository repository;
    @PostMapping
    public AutenticacaoDTO autenticacao (@RequestBody  UsuarioDTO dto) {

        var autenticado = autenticacaoService.valida(dto.email(), dto.senha());
        if(autenticado){
         return new AutenticacaoDTO(true, repository.findByEmail(dto.email()).getId());
        }
        return new AutenticacaoDTO(false, 0);
    }
}
