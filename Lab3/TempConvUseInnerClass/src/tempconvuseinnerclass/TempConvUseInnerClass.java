package tempconvuseinnerclass;

import java.util.function.Function;

public class TempConvUseInnerClass {
    
    public static void main(String[] args) {
        float x = 24;
        float out = new Function<Float, Float>(){
            @Override
            public Float apply(Float celDegree)
            {
                return (float)(celDegree * 1.8) + 32;
            }
        }.apply(x);
        
        System.out.println("Temperature = " + x + " C");
        System.out.println("Temperature = " + out + " F");
        }
    }
