package pl.sdaacademy.openweatherapi;

import pl.sdaacademy.NetworkApiException;
import pl.sdaacademy.Weather;

import java.util.Optional;

public class OpenWeatherApiService {

    public Optional<Weather> fetchByCityName(String cityName) {
        try {
            OpenWeather openWeather = new FetchWeatherByCityName(cityName).execute();
            return Optional.of(WeatherTransformer.toWeather(openWeather));
        } catch (NetworkApiException e) {
            return Optional.empty();
        }
    }
}
