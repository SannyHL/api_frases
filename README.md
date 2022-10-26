<h1 align="center">💻 API Frases</h1>

<div align="center"><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height="70px"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="70px"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-plain.svg" height="70px"/></div>


<h2 align="center">Recursos disponíveis</h2>

- [x] Criação de novas frases
- [x] Exclusão das frases
- [X] Atualização 
- [X] Buscar frases por ID
- [X] Buscar todas as frases
- [X] Utilização do Swagger

<h2 align="center">Pré-requisitos</h2>

#### Para utilizar o código da API, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
- Java - a versão utilizada nesse projeto foi a 17.
- Um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)


<br><h1 align="center">Utilizar a API 📗</h1><br>

<h4 align="center"> ⚠O id não precisa ser informado pois é gerado automaticamente.</h4>

<h2 align="center">🔎 Buscar, criar, deletar e atualizar frases via Swagger:</h2><br>

- Acessar: <https://api-frases-motivacionais.herokuapp.com/swagger-ui/index.html#/>
- Escolher um dos métodos: 

<h4>➡ <b>Para buscar todos basta ir no GET Buscar todos</b></h4>
<h4>➡ <b>Para buscar por ID deve informar o ID no GET Busca por ID</b></h4>
<h4>➡ <b>Para deletar deve informar o ID no DELETE</b></h4>
<h4>➡ <b>Para criar novo cadastro o Json deverá ser informado no POST</b></h4>
<h4>➡ <b>Para atualizar o cadastro deve informar na requisição PUT o ID e o Json atualizado.</b></h4><br>


<h2 align="center">🔎 Buscar, criar, deletar e atualizar cadastro via <a href="https://www.postman.com/downloads/">postman</a> ou outra plataforma para uso de APIs:</h2><br>


- URL para criar novo cadastro via POST: https://api-frases-motivacionais.herokuapp.com/frases
- URL para buscar todos via GET: https://api-frases-motivacionais.herokuapp.com/frases
- URL para buscar por ID via GET: https://api-frases-motivacionais.herokuapp.com/frases/{id}
- URL para deletar por ID via DELETE: https://api-frases-motivacionais.herokuapp.com/frases/{id}
- URL para atualizar por ID via PUT: https://api-frases-motivacionais.herokuapp.com/frases/{id}


<br><h2 align="center">🔧 Utilização do código da API:</h2>


<h4 align="center">📋 Pré-requisitos</h4>

- ➡Ter instalado o Java - a versão utilizada neste projeto foi a 17.
- ➡Um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)


<br><h2 align="center">🎲 Rodando a API na localmente:</h2>

```bash

➩ Clone este repositório
$ git clone <https://github.com/SannyHL/api_frases.git>

➩ Acesse o código com o editor de sua preferência

➩ Utilize a branch development
$ git checkout development

➩ Instale as dependências que estão no pom.xml(normalmente o proprio editor instala as dependências)

➩ Insira no application.properties as configurações do seu banco de dados

➩ Rode a aplicação

➩ O servidor iniciará na porta:8080 por default - acesse <http://localhost:8080>

```


### Autora
---

<img src="https://user-images.githubusercontent.com/104280692/194205159-83b3bca2-3f59-40cd-b909-9bb0b8e40825.png" width="250px;" alt=""/>
Criado com ❤️ por Sanny Helen Lima <br>
⭐ Entre em contato!
<br>


[![Linkedin Badge](https://img.shields.io/badge/-SannyHL-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/sannyhelenlima/)](https://www.linkedin.com/in/sannyhelenlima) 
[![Gmail Badge](https://img.shields.io/badge/-sannyhelenlima@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:sannyhelenlima@gmail.com)](mailto:sannyhelenlima@gmail.com)
