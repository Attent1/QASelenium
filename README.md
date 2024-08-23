Cria um projeto do tipo maven.

Cria o getting started
la na pasta de test>java
E executa o teste.
Nao funcionou pq precisa das dependencias

vai no mvn repository e baixa o junit 
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>
<version>5.11.0-RC1</version>
<scope>test</scope>

e o selenium ultima versao

da o import com o maven e roda de novo
os testes.

Explica o que ta acontecendo no teste
etc


Explica que esta faltando coisas

coloca a dependencia do gherkin
coloca a dependencia do cucumber

se tive usando intelij, baixar os plugin

cria a estrutura de pastas
features
pages
stepDefinition
utils

Cria o Setup.java dentro da utils
La, fazer a inicializacao do driver
com as opcoes
e tambem o fechamento do driver

Criar o Hooks.java dentro da stepDefinition

Criar o BasePage.java dentro da pages
sempre lembrar o pq utilizar o page object,
nao ter que escrever essas funcoes grandes na mao

Criar a feature Login
escrever o teste
Executa o teste pra ver  falhar,
pega o snippet
