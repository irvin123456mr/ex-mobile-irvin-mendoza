package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "2131433041")
    private WebElement LoginInput;

    @AndroidFindBy(id = "2131431091")
    private WebElement mensajeRegistro;

    public void clickSearchInput(){
        LoginInput.click();
    }

    public String getResultText(){
        return mensajeRegistro.getText();
    }
}
