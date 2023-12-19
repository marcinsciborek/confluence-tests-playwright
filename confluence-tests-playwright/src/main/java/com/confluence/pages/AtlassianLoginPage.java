package com.confluence.pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AtlassianLoginPage {

    SIGN_IN("Sign in");
    // input email
    // input password

    private String value;
    public String getValue() {
        return value;
    }

}
