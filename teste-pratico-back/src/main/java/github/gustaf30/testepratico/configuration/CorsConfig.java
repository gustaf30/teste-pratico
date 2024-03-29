package github.gustaf30.testepratico.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configurar para o endereço do front
        registry.addMapping("/produtos/cadastro").allowedOrigins("http://127.0.0.1:5500");
        registry.addMapping("/produtos/list").allowedOrigins("http://127.0.0.1:5500");
    }
}
