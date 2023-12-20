package com.confluence.pages;

import com.confluence.model.AtlassianUsers;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;


public class AtlassianLoginPage extends BasePage {

    public AtlassianLoginPage(Page page) {
        super(page);
    }

    public AtlassianLoginPage(Page page, Playwright playwright) {
        super(page, playwright);
    }

    final Locator signIn = page.locator ("//span[contains(text(),'Sign in')]");
    final Locator inputEmailField = page.locator ("//input[@id='username']");
    final Locator inputPasswordField = page.locator ("//input[@id='password']");
    final Locator continueButton = page.locator("//span[@class='css-178ag6o']").first();

    public void login(){
        getPage().context().clearCookies();
        getPage().waitForLoadState(LoadState.NETWORKIDLE);
        signIn.click();
        inputEmailField.fill(AtlassianUsers.USER.getUserName());
        continueButton.click();
        inputPasswordField.fill(AtlassianUsers.USER.getPassword());
        continueButton.click();
    }
}
