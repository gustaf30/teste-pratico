package github.gustaf30.testepratico.controller;

import github.gustaf30.testepratico.dto.ProdutoDTO;
import github.gustaf30.testepratico.repository.ProdutoRepository;
import github.gustaf30.testepratico.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) { this.produtoRepository = produtoRepository;}

    @PostMapping("/cadastro")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> cadastrar (@RequestBody Produto form) {
        produtoRepository.save(form);

        return ResponseEntity.ok("Produto cadastrado com sucesso");
    }

    @GetMapping("/list")
    public List<ProdutoDTO> list_all() {
        List<Produto> produtos = produtoRepository.findAllByOrderByPrecoAsc();

        return produtos.stream()
                .map(produto -> new ProdutoDTO(produto.getNome(), produto.getPreco()))
                .collect(Collectors.toList());
    }
}