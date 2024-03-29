package github.gustaf30.testepratico.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    @Column(name = "descricao", length = 100, nullable = false)
    private String descricao;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "disponivel", nullable = false)
    private Boolean disponivel;
}
