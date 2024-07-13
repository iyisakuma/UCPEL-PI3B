package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
@Getter
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String telefone;
    private String nome;
    private String email;
    @OneToMany
    private Set<Endereco> enderecos = new HashSet<>();
    @OneToOne
    private Usuario usuario;


}

