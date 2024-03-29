package github.gustaf30.testepratico.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoDTO {
    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Boolean disponivel;

    public ProdutoDTO(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
