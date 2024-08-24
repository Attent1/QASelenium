# language: pt

  Funcionalidade: Login

    Cenário: Login com credenciais validas
      Dado que estou na tela de login
      Quando entro com credenciais validas
      Entao vejo a tela Select Flight

    Cenário: Login com credenciais invalidas
      Dado que estou na tela de login
      Quando entro com credenciais invalidas
      Entao vejo a mensagem Invalid email or password