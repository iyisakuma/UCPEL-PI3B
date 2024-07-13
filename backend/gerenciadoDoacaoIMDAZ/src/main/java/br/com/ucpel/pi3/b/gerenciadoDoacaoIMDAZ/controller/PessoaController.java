package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.controller;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.PessoaFisica;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.PessoaFisicaDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @PostMapping("/pessoaFisica")
    public String cadastraPessoaFisica(@RequestBody PessoaFisicaDTO pessoaDTO){
        try{
            var pessoa = new PessoaFisica();
            pessoa.setCpf(pessoaDTO.cpf());
            pessoa.setNome(pessoaDTO.nome());
            pessoa = (PessoaFisica) pessoaService.cadastraPessoaFisica(pessoa);
            return "Cadastro com sucesso!" + pessoa.getId();
        }catch (Exception ex){
            return "Não foi possivel cadastrar a pessoa fisica";
        }
    }
}
