
import com.google.gson.annotations.SerializedName;

public class OpenWeather {
    private String name;
    @SerializedName("main")
    private WeatherDetails weatherDetails;
    @SerializedName("wind")
    private WindDetails windDetails;

    public OpenWeather() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherDetails getWeatherDetails() {
        return weatherDetails;
    }

    public void setWeatherDetails(WeatherDetails weatherDetails) {
        this.weatherDetails = weatherDetails;
    }

    public WindDetails getWindDetails() {
        return windDetails;
    }

    public void setWindDetails(WindDetails windDetails) {
        this.windDetails = windDetails;
    }

    @Override
    public String toString() {
        return "OpenWeather{" +
                "name='" + name + '\'' +
                ", weatherDetails=" + weatherDetails +
                ", windDetails=" + windDetails +
                '}';
    }
}

class WeatherDetails {
    private float temp;
    private float pressure;
    private int humidity;

    public WeatherDetails(float temp, float pressure, int humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public WeatherDetails() {
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherDetails{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}

class WindDetails {
    private float speed;
    private int deg;

    public WindDetails() {
    }

    public WindDetails(float speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "WindDetails{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}