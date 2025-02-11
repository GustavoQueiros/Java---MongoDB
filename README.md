# Java + MongoDB

Este projeto demonstra a integração entre Java e MongoDB utilizando Spring Boot e o MongoDB Compass como ferramenta de visualização.

## Tecnologias Utilizadas
- **Java 21**
- **Spring Boot** (Spring Data MongoDB)
- **MongoDB** (Banco de dados NoSQL)
- **MongoDB Compass** (Interface gráfica para gerenciamento do banco)
- **Maven** (Gerenciador de dependências)

## Configuração do Projeto
### 1. Clone o repositório:
```sh
 git clone https://github.com/GustavoQueiros/Java---MongoDB.git
 cd Java---MongoDB
```

### 2. Configuração do MongoDB
Certifique-se de que o MongoDB está rodando localmente ou forneça a URI correta no `application.properties`:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/meu_banco
```

### 3. Executando o Projeto
```sh
mvn spring-boot:run
```
O aplicativo estará disponível em `http://localhost:8080`.

## Estrutura do Projeto
- `Controller` - Camada responsável por expor endpoints REST
- `Service` - Lógica de negócio
- `Repository` - Comunicação com o MongoDB
- `Document` - Representação das entidades no MongoDB

## Exemplo de Uso
### Criando um usuário via API:
```json
POST /usuarios
{
  "nome": "Gustavo",
  "email": "gustavo@email.com"
}
```
### Buscando todos os usuários:
```sh
GET /usuarios
```

---
**Desenvolvedor:** Gustavo Queiros
