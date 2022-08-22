package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();
    }

    @Step
    public void findProductWithNameInListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGridAndOpen(productName));
    }


    @Step
    public void navigateToProductName(String productName){
        searchForKeyword(productName);
        findProductWithNameInListAndOpen(productName);
    }

}
