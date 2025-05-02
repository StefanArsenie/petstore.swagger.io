package helper;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class GenerateData {
    Faker faker = new Faker();
    public String setFirstName() {
        return  faker.name().firstName();
    }
    public String setLastName() {
        return faker.name().lastName();
    }
    public String setEmail() {
        return faker.internet().emailAddress();
    }
    public String setUserName() {
        return faker.name().username();
    }
    public String setPassword() {
        return faker.internet().password();
    }
}
