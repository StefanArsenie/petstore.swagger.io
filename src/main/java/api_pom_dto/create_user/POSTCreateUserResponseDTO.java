package api_pom_dto.create_user;

public class POSTCreateUserResponseDTO {
    private int code;
    private String type;
    private String message;

    public POSTCreateUserResponseDTO() {

    }
    public POSTCreateUserResponseDTO(int code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getType() {
        return type;
    }
    public String getMessage() {
        return message;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
