package com.ebay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {



    @FindBy(id="gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchBtn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    @FindBy(linkText = "Daily Deals")
    private WebElement dailyDealsBtn;

    @FindBy(id = "gh-shop-a")
    private WebElement shopByCategory;

    @FindBy(linkText = "Collectibles")
    private WebElement collectibles;

    public void typeOnSearchBar() {

        searchBar.sendKeys("Java Books");
    }
    public void clickOnSearchButton(){

        searchBtn.click();
    }
    public void clickOnSignInButton(){

        signInBtn.click();
    }
    public void clickOnDaileyDeals(){

        dailyDealsBtn.click();
    }
    public void clickOnShopByCategory(){
        shopByCategory.click();
        collectibles.click();
    }

}
