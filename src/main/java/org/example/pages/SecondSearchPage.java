package org.example.pages;

import org.example.base.Base;

public class SecondSearchPage extends Base {
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public boolean containsAsExpected(String expectedTitle) {
        return getCurrentUrl().toLowerCase().contains(expectedTitle.toLowerCase());
    }
}
