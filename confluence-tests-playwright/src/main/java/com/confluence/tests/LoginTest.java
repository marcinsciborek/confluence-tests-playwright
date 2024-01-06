package com.confluence.tests;


import com.confluence.pages.AtlassianLoginPage;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest {

    Page page;
    AtlassianLoginPage login = new AtlassianLoginPage(page);

    @Test
    @DisplayName("Check if Sign In button exist on the main page")
    public void checkSignIn() {

//        Assertions.assertTrue(AtlassianLoginPage);  //not finished
    }


    @Test
    public void secondTest(){


    }
}
