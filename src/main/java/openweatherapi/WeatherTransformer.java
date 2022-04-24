package pl.sdaacademy.openweatherapi;

import pl.sdaacademy.Weather;

class WeatherTransformer {

    static Weather toWeather(OpenWeather openWeather) {
        Weather weather = new Weather();
        weather.setCityName(openWeather.getName());
        weather.setTemp(openWeather.getWeatherDetails().getTemp());
        weather.setHumidity(openWeather.getWeatherDetails().getHumidity());
        weather.setPressure(openWeather.getWeatherDetails().getPressure());
        weather.setWindSpeed(openWeather.getWindDetails().getSpeed());
        weather.setWindDeg(openWeather.getWindDetails().getDeg());
        return weather;
    }
}
