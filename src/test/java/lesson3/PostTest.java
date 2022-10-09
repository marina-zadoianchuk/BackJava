package lesson3;

import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;


public class PostTest extends AbstractTest {

    @Test
    void getPostTest() {
        given()
                .queryParam("apiKey", getApiKey())
              //  .queryParam("base_url", "https://api.spoonacular.com/")
                .queryParam("language", "en")
                .queryParam("normalize", "false")
                .queryParam("rgb", "75,192,192")

                .when()
                .post(getBaseUrl()+"recipes/visualizeTaste")
                .then()
                .statusCode(200);
    }
}