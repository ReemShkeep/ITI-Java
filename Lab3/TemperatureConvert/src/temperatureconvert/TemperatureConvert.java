package temperatureconvert;

import java.util.function.Function;

public class TemperatureConvert implements Function<Float, Float> {
    @Override
    public Float apply(Float celDegree)
    {
        return (float)(celDegree * 1.8) + 32;
    }
}
