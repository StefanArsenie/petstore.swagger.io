package utils;

public enum UrlResources {

    BASE_URI("https://petstore.swagger.io/v2"),
    CREATE_USER_ENDPOINT("/user");

    private final String url;

    private UrlResources(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
