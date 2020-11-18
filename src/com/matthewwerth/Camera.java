package com.matthewwerth;

import java.util.Random;

public class Camera {
    private String brand;
    private String model;
    private Integer memoryCapacity;
    private Boolean lensCanChange;

    public Camera(String brand, String model, Integer memoryCapacity, Boolean lensCanChange) {
        this.brand = brand;
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.lensCanChange = lensCanChange;
    }

    public boolean checkForMemorySpace(int spaceRequired) throws Exception {
        Memory memory = new Memory(memoryCapacity);
        if(Memory.storeData(spaceRequired)) return true;
        else throw new IllegalArgumentException("Not Enough Space In Memory To Store Photo!");
    }

    public Boolean takePicture(int lightReading) {
        Random rand = new Random();
        int randInt = rand.nextInt(5); // create a random amount of storage to simulate storage space 0-5
        Memory.storeData(randInt);

        LightMeter lightMeterReading = new LightMeter(50,4, 1600, 200);
        if(LightMeter.isProperlyExposed(lightMeterReading.getLightMeterReading())) return true;
        //check if we can take a picture with the light we have..
        return false;
    }
}
