package page;

import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static configuration.ReadProperties.*;

public class TopBarPage {
    private SelenideElement searchInput = $("#searchInput");
    private SelenideElement searchButton = $("#applySearchBtn");

    private SelenideElement getSearchInput() {
        return searchInput;
    }

    private SelenideElement getSearchButton() {
        return searchButton;
    }

    public CatalogPage searchProduct(String searchProduct) {
        getSearchInput().sendKeys(searchProduct,Keys.ENTER);
        return new CatalogPage();
    }
}
