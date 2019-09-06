package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CitiesAPI;
import java.io.IOException;

public class RocketMilesApi {

    // you should be able to see what is going on here, if expenation needed let me know. Will be more than happy to explain.
    //Do not want to offend anyone with "Over Explaining", I am not yet aware of the team comfort zones :))

    @Test
    public static void AutoSuggestionTest() throws IOException {
        String testValue = "pd";
        ObjectMapper mapper = new ObjectMapper();
        Response response = get(testValue);
        CitiesAPI[] arr = mapper.readValue(response.asString(), CitiesAPI[].class);
        for(CitiesAPI city : arr){
            Assert.assertTrue(city.getName().toLowerCase().startsWith(testValue));
        }
    }
    public static Response get(String prefix){
        return RestAssured.get("https://www.rocketmiles.com/rest/places?query="+prefix+"&language=en&sessionSiteSlug=rocketmiles");


    }
}







