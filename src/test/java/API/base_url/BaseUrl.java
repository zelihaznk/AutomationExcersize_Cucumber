package API.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.Authentication;

public class BaseUrl extends Authentication {

    protected RequestSpecification spec;

    @Before
    public void setup() {

        spec = new RequestSpecBuilder().setBaseUri("").build();
    }
}
