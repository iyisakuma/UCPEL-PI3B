package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Pessoa;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.PessoaFisica;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa cadastraPessoaFisica(PessoaFisica pessoa) {
        return repository.save(pessoa);
    }
}
