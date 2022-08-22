package org.fasttrack.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
//        checkoutSteps.
    }
}
