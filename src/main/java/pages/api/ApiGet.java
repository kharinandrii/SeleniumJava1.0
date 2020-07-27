package pages.api;

import Tools.Params;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ApiGet {
    Params params = new Params();
    public void getAnimal(String animslID) {
        when()
                .get(params.API_URL + params.API_Get_ANIMAL + animslID)
        .then().statusCode(200)
                .assertThat().body("name", equalTo("doggie"), "id", equalTo(animslID));
    }


}
