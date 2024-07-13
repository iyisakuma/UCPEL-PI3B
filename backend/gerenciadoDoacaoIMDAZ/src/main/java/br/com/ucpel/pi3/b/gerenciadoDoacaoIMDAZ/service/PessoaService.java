package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.service;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Pessoa;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.PessoaFisica;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Usuario;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.dto.PessoaFisicaDTO;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.PessoaRepository;
import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Pessoa cadastraPessoaFisica(PessoaFisicaDTO pessoaDTO) {
        var pessoa = new PessoaFisica();
        pessoa.setCpf(pessoaDTO.cpf());
        pessoa.setNome(pessoaDTO.nome());
        pessoa = repository.save(pessoa);
        Usuario usuario = new Usuario();
        usuario.setSenha(pessoaDTO.senha());
        usuario = usuarioRepository.save(usuario);
        pessoa.setUsuario(usuario);
        return (PessoaFisica) repository.save(usuario);
    }
}
