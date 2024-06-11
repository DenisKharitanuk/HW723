
import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;

import page.TopBarPage;

public class MyFirstTest extends BaseTest {
    @Test
    public void firstScriptInSelenide(){
        new TopBarPage()
                .searchProduct("телефон")
                .openFirstProductCard()
                .addToBasketAndGoToBasket()
                .counterVerification("1 товар");
    }
}
