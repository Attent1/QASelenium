package stepDefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.BasePage;
import pages.SelectFlight;

public class SelectFlightSteps extends BasePage {

    SelectFlight selectFlight = new SelectFlight();

    @Dado("que estou na tela Select Flight")
    public void que_estou_na_tela_select_flight() {
        selectFlight.isOnSelectFlightPage();
    }
    @Quando("clico no botao signoff")
    public void clico_no_botao_signoff() {
        click(selectFlight.hfSignOff);
    }
    @Entao("vejo a tela de login")
    public void vejo_a_tela_de_login() {
        isVisible(selectFlight.tvSignedOut);
    }

}
