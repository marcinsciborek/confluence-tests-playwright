package com.confluence.pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import lombok.Getter;

@Getter
public class BasePage {
    private static Playwright playwright;
    private static Browser browser;
    final Page page;

    public BasePage(Page page) {
        this.page = page;
    }


    public void initialize() {
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

}
