# ChatBoot - Sistema de Gerenciamento Educacional

Sistema de gerenciamento educacional desenvolvido com Java, Spring Boot e integração com IA através do Ollama.

## 🚀 Tecnologias Utilizadas

- Java 23
- Spring Boot 3.4.2
- Spring Data JDBC
- MySQL 8.0
- Ollama (Modelo Llama3.1)
- LangChain4j
- Docker e Docker Compose

## 📋 Pré-requisitos

- Docker e Docker Compose instalados
- Java 23 JDK instalado
- Maven instalado

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone [URL_DO_REPOSITORIO]
cd ChatBoot
```

2. Inicie os containers Docker:
```bash
docker-compose up -d
```

3. Aguarde a inicialização dos containers:
- MySQL na porta 3306
- Ollama na porta 11434

4. Baixe o modelo Llama3.1 no Ollama:
```bash
docker exec chatboot-ollama ollama pull llama3.1
```

5. Compile e execute o projeto:
```bash
mvn clean install
mvn spring-boot:run
```

## 📝 Configurações

### Banco de Dados
- Host: localhost
- Porta: 3306
- Database: gerenciador_educacional
- Usuário: root
- Senha: admin123

### Ollama
- URL: http://localhost:11434
- Modelo: llama3.1
- Temperatura: 0.4
- Timeout: 60 segundos

## 🛠️ Endpoints

### Chat
- GET `/chat?userMessage={mensagem}`
  - Envia uma mensagem para o assistente virtual
  - Retorna a resposta processada pelo modelo de IA

## 📦 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── fraga/
│   │       └── com/
│   │           └── example/
│   │               └── ChatBoot/
│   │                   ├── assistant/
│   │                   ├── configuration/
│   │                   ├── controller/
│   │                   ├── model/
│   │                   ├── repository/
│   │                   └── service/
│   └── resources/
│       ├── application.properties
│       ├── data.sql
│       └── schema.sql
```

## 🤝 Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## ✨ Autores

- **Felipe Fraga** - *Desenvolvimento inicial* - [SeuGitHub](https://github.com/seu-usuario)