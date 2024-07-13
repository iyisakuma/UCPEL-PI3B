package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository;


import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByEmail(String email);
}
