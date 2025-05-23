package tests;
import api_pom_dto.create_user.CreateUserBuilder;
import api_pom_dto.create_user.POSTCreateUserRequestDTO;
import api_pom_dto.create_user.POSTCreateUserResponseDTO;
import helper.GenerateData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.CreateRequestDTO;
import utils.Constants;
import utils.UrlResources;

public class CreateUserTest {
    GenerateData data;
    CreateRequestDTO createRequestDTO;
    POSTCreateUserRequestDTO postCreateUserRequestDTO;
    POSTCreateUserResponseDTO responseDTO;
    Response response;
    @BeforeTest
    public void setUp() {
        data = new GenerateData();
        createRequestDTO = new CreateRequestDTO();
        postCreateUserRequestDTO = new CreateUserBuilder()
                .id(1)
                .userName(data.setUserName())
                .firstName(data.setFirstName())
                .lastName(data.setLastName())
                .email(data.setEmail())
                .password(data.setPassword())
                .phone(Constants.PHONE_NUMBER)
                .userStatus(1)
                .build();
        response = createRequestDTO.createUser(UrlResources.CREATE_USER_ENDPOINT, postCreateUserRequestDTO);
        responseDTO = response.as(POSTCreateUserResponseDTO.class);
    }
    @Test
    public void statusCode200ForUserCreated() {
        Assert.assertEquals(200, response.getStatusCode());
    }
    @Test
    public void valueOfCodeFieldFromResponseIs200() {
        Assert.assertEquals(200, responseDTO.getCode());
    }
    @Test
    public void valueOfTypeFieldFromResponseIsUnknown() {
        Assert.assertEquals("unknown", responseDTO.getType(), "Type is not unknown");
    }
    @Test
    public void valueOfMessageFieldFromResponseIsOne() {
        Assertions.assertEquals( "1", responseDTO.getMessage(), "Message has value 1");
    }
}