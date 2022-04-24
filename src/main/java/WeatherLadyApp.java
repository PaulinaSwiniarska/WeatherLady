

import pl.sdaacademy.openweatherapi.OpenWeatherApiService;

import java.util.Optional;

public class WeatherLadyApp {

    public static void main(String[] args) {
        OpenWeatherApiService openWeatherApiService = new OpenWeatherApiService();
        Optional<pl.sdaacademy.Weather> weather = openWeatherApiService.fetchByCityName("Warszawa");
        weather.ifPresent(w -> {
            System.out.println(w);
        });
    }
}
