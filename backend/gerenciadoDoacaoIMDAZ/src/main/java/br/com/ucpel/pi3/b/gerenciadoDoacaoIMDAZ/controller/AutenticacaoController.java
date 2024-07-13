package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.controller;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.AutenticacaoDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.UsuarioDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service.AutenticacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
        ("/autenticacao")
public class AutenticacaoController {
    @Autowired
    private AutenticacaoService autenticacaoService;
    @PostMapping
    public AutenticacaoDTO autenticacao (UsuarioDTO dto) {
        return new AutenticacaoDTO(autenticacaoService.valida(dto.email(), dto.senha()));
    }
}
