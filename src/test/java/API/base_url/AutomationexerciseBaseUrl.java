package API.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class AutomationexerciseBaseUrl {

    public RequestSpecification spec;


    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://automationexercise.com").build();

    }

}