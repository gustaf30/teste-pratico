# Teste prático para uma vaga de estágio que me candidatei

O teste consiste da implementação de um sistema de cadastro de produtos que contenha um formulário para o cadastro de um novo produto e após o cadastro o usuário deve ser redirecionado a uma lista que exiba todos os produtos cadastrados.

# Desenvolvimento

Para o desenvolvimento do teste, optei por fazer uma API utilizando Spring Boot, por ser a tecnologia que tenho mais conhecimento no back-end. Posteriormente, utilizei de HTML para fazer um formulário simples e consumir a API, utilizando o método HTTP Post para enviar as informações, posteriormente, o usuário é direcionado a outra página, onde é utilizado uma requisição GET para obter outro método da API que lista os produtos armazenados no banco de dados. Para o banco de dados, utilizei o H2-Database, que é um simples banco em memória. Ademais, durante o desenvolvimento utilizei a ferramente Postman para fazer alguns testes.
