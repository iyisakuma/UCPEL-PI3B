package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.controller;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.DadosCobrancasDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service.CobrancaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cobranca")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CobrancaController {

    @Autowired
    private CobrancaServico cobrancaServico;

    @PostMapping("")
    public boolean geraCobranca( @RequestBody DadosCobrancasDTO dto) {
        try {
            cobrancaServico.geraCobranca(dto.pessoaId(), dto.valor(), dto.diaVencimento());
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
