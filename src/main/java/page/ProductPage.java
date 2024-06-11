package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private ElementsCollection addToBasketButton = $$(".btn-main");
    private ElementsCollection basketButton = $$(".btn-base.j-go-to-basket");


    private ElementsCollection getAddToBasketButton() {
        return addToBasketButton;
    }

    private ElementsCollection getBasketButton() {
        return basketButton;
    }

    public BasketPage addToBasketAndGoToBasket() {
        getAddToBasketButton().find(text("Добавить в корзину")).click();
        getBasketButton().get(1).click();
        return new BasketPage();
    }
}
