package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
