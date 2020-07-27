package pages.api;

import Tools.Params;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ApiRequests {
    Params params = new Params();
    public void getAnimal(String animslID) {
        when()
                .get(params.API_URL + params.API_Get_ANIMAL + animslID)
        .then().statusCode(200)
                .assertThat().body("name", equalTo("doggie"), "id", equalTo(animslID));
    }

public void createNewAnimal() {

}
//TODO продолжить написание апи тестов с создания животного
}
