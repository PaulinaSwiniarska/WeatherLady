package pl.sdaacademy.openweatherapi;

class Config {

    private static Config config;
    private final String baseAPIUrl;
    private final String appId;

    private Config(String baseAPIUrl, String appId) {
        this.baseAPIUrl = baseAPIUrl;
        this.appId = appId;
    }

    String getFetchByCityNameQuery(String cityName) {
        return String.format("%s?q=%s&appId=%s&units=metrics", baseAPIUrl, cityName, appId);
    }

    static Config getInstance() {
        if (config == null) {
            config = new Config("https://api.openweathermap.org/data/2.5/weather", "baa6ece140be0985d8bf8766fa381d1d");
        }
        return config;
    }
}
