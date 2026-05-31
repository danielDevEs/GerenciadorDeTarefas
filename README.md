# Gerenciador de Tarefas Pessoais – Trabalho LIP

Este é um sistema completo para organizar tarefas diárias, permitindo cadastro de usuários, criação de tarefas com prazos e prioridades, atualização de status e geração de relatórios de produtividade. 

## Tecnologias utilizadas

- **Java (Spring Boot)** – back-end e regras de negócio.
- **React** – interface web.
- **MySQL** – banco de dados para persistência.
- **VS Code** – editor de código principal.

## O que instalar
| **Java JDK 17**       | O Spring Boot (back-end) roda sobre a máquina virtual Java. |

| **MySQL Server 8.0**  | Banco de dados que guarda usuários e tarefas. |

| **Node.js (18 ou 20)** | O React precisa do Node.js para gerenciar pacotes (npm) e executar o servidor de desenvolvimento. |

| **VS Code**           | Com extensões (Java Extension Pack, Spring Boot Tools) conseguimos editar tanto o back-end quanto o front-end no mesmo lugar. |


## Estrutura de pastas do projeto
```markdown
trabalho_lip/

├── backend/               # Spring Boot Java
│   ├── src/
│   └── pom.xml            # ou build.gradle
├── frontend/              # React
│   ├── public/
│   ├── src/
│   └── package.json
└──  database/              # Scripts SQL
│   └── schema.sql
└── README.md
```
