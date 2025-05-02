package api_pom_dto.create_user;

public class CreateUserBuilder {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;

    public POSTCreateUserRequestDTO build() {
        return new POSTCreateUserRequestDTO(this.id, this.userName, this.firstName, this.lastName, this.email, this.password, this.phone, this.userStatus);
    }
    public CreateUserBuilder id(int id) {
        this.id = id;
        return this;
    }
    public CreateUserBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }
    public CreateUserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public CreateUserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public CreateUserBuilder email(String email) {
        this.email = email;
        return this;
    }
    public CreateUserBuilder password(String password) {
        this.password = password;
        return this;
    }
    public CreateUserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public CreateUserBuilder userStatus(int userStatus) {
        this.userStatus = userStatus;
        return this;
    }
}
