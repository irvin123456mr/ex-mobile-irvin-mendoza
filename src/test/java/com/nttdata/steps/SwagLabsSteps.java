package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickLogin(){
        loginScreen.clickLogin();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickSearch();
    }

    @Step("Mensaje que se registro exitosamente o error el usuario bloqueado")
    public String getMensajeResultado(){
        return searchScreen.getMensajeResultado();
    }
}

