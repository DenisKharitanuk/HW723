package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private SelenideElement productCounter = $(".accordion__goods-count");

    private SelenideElement getProductCounter() {
        return productCounter;
    }

    public BasketPage counterVerification(String productValues){
        getProductCounter().shouldHave(exactText(productValues));
        return this;
    }
}
