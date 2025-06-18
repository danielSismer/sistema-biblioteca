
# 📚 Sistema de Biblioteca

Bem-vindo ao **Sistema de Biblioteca**, uma aplicação divertida e funcional para gerenciar empréstimos, cadastros de livros e usuários. Ideal para estudos, protótipos ou como base para projetos maiores!

---

## 🌟 Funcionalidades principais

- 📖 **Cadastro de usuários**: adicione leitores com nome, e-mail e data de registro  
- 📚 **Gerenciamento de livros**: título, autor, categoria, status (disponível/emprestado)  
- 🛒 **Empréstimos e devoluções**: acompanhe quem pegou qual livro e quando  
- 🔍 **Busca dinâmica**: encontre livros por título, autor ou categoria  
- 📊 **Relatórios instantâneos**: visualize livros mais populares, usuários ativos e histórico  

---

## 🚀 Começando

### Requisitos

- PHP 7.4+  
- Servidor Web (Apache, Nginx…)  
- MySQL ou MariaDB  
- Composer (caso use dependências externas)  

### Instalação

```bash
# Clone este repositório
git clone https://github.com/danielSismer/sistema-biblioteca.git
cd sistema-biblioteca
```

```bash
# Importe o banco de dados
mysql -u seu_user -p biblioteca < database.sql
```

1. Renomeie `config/config.example.php` para `config/config.php`  
2. Preencha com `host`, `usuário`, `senha` e o nome do banco de dados

3. Acesse no navegador:
```
http://localhost/sistema-biblioteca/
```

---

## 🎨 Estrutura do projeto

```
/
├── config/             # Configurações de conexão e constantes
├── controllers/        # Lógica central (CRUD de empréstimos, livros, usuários)
├── models/             # Interação com o banco de dados
├── views/              # Templates HTML para as páginas
├── assets/             # CSS, JS, imagens
└── database.sql        # Script para criar as tabelas
```

---

## 🧠 Tecnologias

- PHP (POO opcional ⚙️)  
- MySQL para persistência de dados  
- HTML, CSS e JS para interface  
- MVC básico para organização clara  

---

## 💡 Sugestões de melhorias

- Integração com Twig ou outro templating engine  
- Upload de capa para livros  
- Notificações — e-mail, SMS ou alertas no sistema  
- Usuários com permissões (ex: admin vs leitor)  
- Dashboard com gráficos interativos  

---

## ✍️ Contribuições

1. Faça um fork deste repositório 🚀  
2. Crie uma branch: `git checkout -b feature/nova-funcionalidade`  
3. Faça suas alterações e confirme: `git commit -m "Adiciona nova feature"`  
4. Envie para o repositório original: `git push origin feature/nova-funcionalidade`  
5. Abra um Pull Request — ficarei super feliz em revisar!

---

## 📞 Contato

Quer bater um papo, sugerir algo ou reportar um bug?  
Abra uma issue, envie um e-mail ou me chame nas redes :)

---

## 📜 Licença

Este projeto está sob a licença **[inserir licença aqui]**. Consulte o arquivo LICENSE para detalhes.

