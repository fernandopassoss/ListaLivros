# Lista de Livros

Este projeto é uma simples aplicação web desenvolvida utilizando Spring Boot, MySQL e HTML/CSS. Ele permite visualizar uma lista de livros, editar informações dos livros e remover livros da lista.

## Funcionalidades

- Visualização da lista de livros com opções de edição e remoção.
- Edição de informações do livro, exceto o ID.
- Remoção instantânea de livros da lista sem a necessidade de atualização da página.

## Tecnologias Utilizadas

- Spring Boot: Framework Java para criação de aplicativos web.
- MySQL: Banco de dados relacional para armazenar os dados dos livros.
- HTML/CSS: Linguagens de marcação e estilo para criação da interface web.

## Estrutura do Projeto

O projeto segue uma estrutura simples, com os seguintes componentes principais:

- **Spring Boot Application**: Configuração principal da aplicação Spring Boot.
- **Controladores**: Classes responsáveis por definir os endpoints da API REST.
- **Serviços**: Classes que contêm a lógica de negócios da aplicação.
- **Repositórios**: Interfaces que fornecem métodos para acessar e manipular os dados no banco de dados MySQL.
- **Modelos**: Classes que representam as entidades do domínio, como a entidade "Livro".
- **Páginas HTML**: Páginas HTML utilizadas para renderizar a interface de usuário.

## Como Executar o Projeto

1. Certifique-se de ter o JDK (Java Development Kit) e o MySQL instalados em sua máquina.
2. Clone este repositório para sua máquina local.
3. Configure o arquivo `application.properties` com as credenciais do seu banco de dados MySQL.
4. Execute o script SQL fornecido para criar a tabela necessária no banco de dados.
5. Compile e execute o projeto Spring Boot.
6. Acesse a aplicação em um navegador web através da URL fornecida pelo Spring Boot.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## A seguir algumas imagens do projeto em execução:
![](https://github.com/fernandopassoss/ListaLivros/blob/febcc7e751f9bde513123044867da2e70fd062bb/book/prints/img1.png)
