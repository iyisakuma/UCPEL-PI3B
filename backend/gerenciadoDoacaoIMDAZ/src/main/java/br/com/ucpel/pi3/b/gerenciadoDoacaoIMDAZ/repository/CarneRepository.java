package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.repository;

import br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain.Carne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarneRepository extends JpaRepository<Carne, Long> {
}
