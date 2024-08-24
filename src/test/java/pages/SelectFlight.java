package pages;

import org.openqa.selenium.By;

public class SelectFlight extends BasePage {

    public final By tvSignedIn = By.id("flash_notice");

    public final By tvSignedOut = By.id("flash_notice");

    public final By hfSignOff = By.xpath("//a[@href='/logout']");

    public void isOnSelectFlightPage(){
        driver.get("https://travel.agileway.net/flights/start");
    }

}
