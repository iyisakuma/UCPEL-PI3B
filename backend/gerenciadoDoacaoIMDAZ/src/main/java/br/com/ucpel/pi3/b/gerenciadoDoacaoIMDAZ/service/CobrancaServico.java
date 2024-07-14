package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Carne;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Cobrancas;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Pessoa;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.CarneRepository;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.CobrancaRepository;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class CobrancaServico {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private CobrancaRepository cobrancaRepository;
    @Autowired
    private CarneRepository carneRepository;

    public void geraCobranca(long pessoaId, BigDecimal valor, int diaVencimento){
        var pessoa = pessoaRepository.findById(pessoaId).get();

        var carne = new Carne();
        carne.setDiaVencimento(diaVencimento);
        carne.setValor(valor);
        carne.gerarCobranca();

        carne.getCobrancas().forEach(cobrancaRepository::save);
        carne.setPessoa(pessoa);
        carneRepository.save(carne);


    }
}
