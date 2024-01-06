package com.confluence.pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


public enum AtlassianSubtabs {
    ACCOUNT_SETTINGS("Account settings"),
    ATLASSIAN_SUPPORT("Atlassian Support"),
    ATLASSIAN_COMMUNITY("Atlassian Community"),
    SELF_MANAGED_LICENSING("Self managed licensing"),
    ATLASSIAN_DOCUMENTATION("Atlassian Documentation"),
    ATLASSIAN_COM("Atlassian.com"),

    FEATURES("Features"),
    RESOURCES("Resources"),
    TEMPLATES("Templates"),
    PRICING("Pricing"),
    ENTERPRISE("Enterprise");

    private String value;

    private AtlassianSubtabs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
