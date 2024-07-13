package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Pessoa;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService {
    @Autowired
    private PessoaRepository pessoaRepository;
    public boolean valida(String email, String senha) {
        Pessoa p = pessoaRepository.findByEmail(email);
        if (p == null) {
            return false;
        }
        return p.getUsuario().getSenha().equals(senha);
    }
}
