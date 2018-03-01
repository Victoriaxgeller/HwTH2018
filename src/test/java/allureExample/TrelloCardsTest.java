package allureExample;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TrelloCardsTest {


    @Epic("Trello API")
    @Feature("Cards Actions")
    public class TrelloCards {


        @Story("Create simple card")
        @Test
        public void createCard() {

        }

    }
}
