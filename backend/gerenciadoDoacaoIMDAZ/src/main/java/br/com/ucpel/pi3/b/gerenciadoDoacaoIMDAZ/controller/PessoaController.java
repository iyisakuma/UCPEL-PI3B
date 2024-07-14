package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.controller;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.PessoaFisica;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.PessoaFisicaDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.PessoaFisicaRetornoDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/pessoa")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    @PostMapping()
    public PessoaFisicaRetornoDTO cadastraPessoaFisica(@RequestBody PessoaFisicaDTO pessoaDTO){
        try{
            var pessoa = (PessoaFisica) pessoaService.cadastraPessoaFisica(pessoaDTO);
            return new PessoaFisicaRetornoDTO(pessoa.getId());
        }catch (Exception ex){
            return new PessoaFisicaRetornoDTO(-1);
        }
    }
}
