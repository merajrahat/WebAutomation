package com.ebaytest;

import com.ebay.HomePage;
import com.peoplentech.webautomation.base.TestBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test (enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar(){

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test (enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.typeOnSearchBar();
        homePage.clickOnSearchButton();
    }

    @Test (enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }

    @Test (enabled = false)
    public void validateUserBeingAbleToClickOnDailyDealsButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDaileyDeals();
    }

    @Test
    public void validateUserBeingAbleToClickOnShopByCategoryAndSelectACategory(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnShopByCategory();
    }
}
