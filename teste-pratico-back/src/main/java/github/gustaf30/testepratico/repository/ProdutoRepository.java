package github.gustaf30.testepratico.repository;

import github.gustaf30.testepratico.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> findAllByOrderByPrecoAsc();
}
