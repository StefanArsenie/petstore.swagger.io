package requests;

import api_pom_dto.create_user.POSTCreateUserRequestDTO;
import io.restassured.response.Response;
import utils.UrlResources;

import static utils.CommonMethods.*;

public class CreateRequestDTO {
    public Response createUser(UrlResources basePath, POSTCreateUserRequestDTO postCreateUserRequestDTO) {
        return postMethod(basePath,postCreateUserRequestDTO);
    }
}
