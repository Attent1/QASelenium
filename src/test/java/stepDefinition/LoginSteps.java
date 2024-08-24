package stepDefinition;

import io.cucumber.java.pt.Dado;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.LoginPage;
import pages.SelectFlight;

public class LoginSteps extends BasePage {

    LoginPage login = new LoginPage();
    SelectFlight selectFlight = new SelectFlight();

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        login.isOnLoginPage();
    }
    @Quando("entro com credenciais validas")
    public void entro_com_credenciais_validas() {

        fillInput(login.etUserName, "agileway");
        fillInput(login.etUserPassword, "testwise");
        click(login.btnSignIn);
    }
    @Entao("vejo a tela Select Flight")
    public void vejo_a_tela_select_flight() {
        isVisible(selectFlight.tvSignedIn);
    }

    @Quando("entro com credenciais invalidas")
    public void entro_com_credenciais_invalidas() {
        fillInput(login.etUserName, "agileway");
        fillInput(login.etUserPassword, "errado");
        click(login.btnSignIn);
    }
    @Entao("vejo a mensagem Invalid email or password")
    public void vejo_a_mensagem_invalid_email_or_password() {
        isVisible(login.tvInvalidCredentials);
    }
}
