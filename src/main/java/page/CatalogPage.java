package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage {
    private ElementsCollection productCard = $$(".product-card__wrapper");

    private ElementsCollection getProductCard (){
        return productCard;
    }

    public ProductPage openFirstProductCard(){
        getProductCard().first().click();
        return new ProductPage();
    }
}
