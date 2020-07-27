package comCucumber.api.steps;
import pages.api.ApiGet;
import io.cucumber.java.en.Given;

public class ApiSteps {
    ApiGet apiGet = new ApiGet();
    @Given("get animal with id {string}")
    public void getAnimalWithId(String arg0) {
        apiGet.getAnimal(arg0);

    }

    @Given("create animal")
    public void createAnimal() {
    }
}
