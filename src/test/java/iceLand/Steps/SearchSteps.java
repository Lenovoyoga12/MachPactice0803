package iceLand.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import iceLand.Pages.SearchPages;
import org.hamcrest.Matchers;
import org.junit.Assert;

public  class SearchSteps {
    SearchPages searchpage_object = new SearchPages();

    @When("^user click on search bar$")
    public void user_click_on_search_bar() throws Throwable {
        searchpage_object.setSearchBar();
    }
    @When("^user enter name of prodcuts \"([^\"]*)\"$")
    public void user_enter_name_of_prodcuts(String arg1) throws Throwable {
        searchpage_object.enter_prodcuts();
    }

    @When("^user click  on search button$")
    public void user_click_on_search_button() throws Throwable {
        searchpage_object.setSearchButton();
    }


    @Then("^user must be able to see list of related products$")
    public void user_must_be_able_to_see_list_of_related_products() throws Throwable {

        String output_result =searchpage_object.setResults();
        System.out.println("The webpage is displaying "+output_result);
        Assert.assertThat(output_result,Matchers.containsString("Juice"));
       // String output_display=searchpage_object.setResults();
       // Assert.assertThat(output_display, Matchers.endsWith("'juice'"));
        //Iceland programme
    }


}
