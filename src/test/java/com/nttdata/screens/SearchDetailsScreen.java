package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(id="search_input")
    private WebElement searchDetailInput;

    @AndroidFindBy(id="2131476992")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.SwagLabs.FrameLayout/android.SwagLabs.LinearLayout/android.SwagLabs.FrameLayout/android.SwagLabs.LinearLayout/android.SwagLabs.FrameLayout/androidx.drawerlayout.SwagLabs.DrawerLayout/android.SwagLabst.FrameLayout/android.SwagLabs.FrameLayout/android.SwagLabs.FrameLayout/android.SwagLabs.FrameLayout[2]/android.SwagLabs.FrameLayout/android.SwagLabs.LinearLayout/android.SwagLabs.FrameLayout/android.SwagLabs.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.SwagLabs.RecyclerView/android.SwagLabs.FrameLayout[1]/android.view.ViewGroup/android.SwagLabs.LinearLayout/android.widget.TextView")
    private WebElement firstOption;

    @AndroidFindBy(id = "2131430997")
    private WebElement nextButton;

    @AndroidFindBy(id = "2131430822")
    private WebElement LoginButton;

    public void enterSearchInput(String place){
        searchDetailInput.click();
        searchDetailInputText.sendKeys(place);
    }

    public void clickFirstOption(){
        firstOption.click();
    }

    public void clickNext(){
        nextButton.click();
    }

    public void clickSearch(){
        LoginButton.click();
    }
}

