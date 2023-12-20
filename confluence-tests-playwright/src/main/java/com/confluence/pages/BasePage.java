package com.confluence.pages;

import com.confluence.model.AtlassianUsers;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BasePage {
    private static Playwright playwright;
    private static Browser browser;
    final Page page;


    public BasePage(Page page, Playwright playwright) {
        this.page = page;
        BasePage.playwright = playwright;
    }

    private void initialize() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    public void click(String selector) {
        page.click(selector);
    }

    public void fill(String selector, String text) {
        page.fill(selector, text);
    }

    public void close() {
        page.close();
    }


    // input sign in button here
    //ok, cancel, etc... universal buttons


}
