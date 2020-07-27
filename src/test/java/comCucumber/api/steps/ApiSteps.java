package comCucumber.api.steps;
import pages.api.ApiRequests;
import io.cucumber.java.en.Given;

public class ApiSteps {
    ApiRequests apiGet = new ApiRequests();
    @Given("get animal with id {string}")
    public void getAnimalWithId(String animalId) {
        apiGet.getAnimal(animalId);

    }

    @Given("create animal")
    public void createAnimal() {
    }

    @Given("create pet with name{string}")
    public void createPetWithName(String animalName) {
    }
}
