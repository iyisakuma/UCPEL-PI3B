package br.com.ucpel.pi3.b.gerenciadoDoacaoIMDAZ.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Carne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal valor;
    private int diaVencimento;
    @OneToMany
    @JoinColumn(name = "carne_id")
    private Set<Cobrancas> cobrancas = new HashSet<>();
    @ManyToOne
    private Pessoa pessoa;

    private final int NUMEROS_PARCELAS = 12;
    public void gerarCobranca() {
        var nextMonth = LocalDate.now().plusMonths(1).getMonth();
        for (int parcela = 1 ; parcela <= NUMEROS_PARCELAS; parcela++){
            var dataVencimento = LocalDate.of( LocalDate.now().getYear(), nextMonth, diaVencimento);
            var cobranca = new Cobrancas();
            cobranca.setVencimento(dataVencimento);
            cobranca.setParcela(parcela);
            cobrancas.add(cobranca);

            nextMonth = nextMonth.plus(1);
        }
    }
}
