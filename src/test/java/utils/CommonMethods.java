package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CommonMethods {
    public static Response postMethod(UrlResources basePath, Object body) {
        return RestAssured
                .given()
                .header("x-api-key", Constants.APIKEY)
                .contentType(ContentType.JSON)
                .baseUri(UrlResources.BASE_URI.getUrl())
                .basePath(basePath.getUrl())
                .body(body)
                .when().post();
    }
}
