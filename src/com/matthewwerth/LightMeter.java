package com.matthewwerth;

public class LightMeter {
    private int lightMeterReading;
    private int aperture;
    private int iso;
    private int shutterSpeed;

    public LightMeter(int currentLightValue, int aperture, int iso, int shutterSpeed) {
        this.lightMeterReading = currentLightValue;
        this.aperture = aperture;
        this.iso = iso;
        this.shutterSpeed = shutterSpeed;
    }

    public int getLightMeterReading() {
        return lightMeterReading;
    }

    public static boolean isProperlyExposed(int lightReading) {
        boolean properExposure = lightReading > 40 && lightReading < 60 ? true: false;
        return properExposure;
    }

//    public static int readLightLevel(int brightness) {
//        Integer lightReading = null;
//        //do something to create light level
//        return lightReading;
//    }
}
