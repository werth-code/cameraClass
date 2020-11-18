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

    public String takePicture(int lightReading) throws Exception {
        Random rand = new Random();
        int randInt = rand.nextInt(5); // create a random amount of storage to simulate storage space 0-5

        checkForMemorySpace(randInt);

        LightMeter lightMeterReading = new LightMeter(lightReading,4, 1600, 200);
        if(LightMeter.isProperlyExposed(lightMeterReading.getLightMeterReading())) {
            Memory.storeData(randInt);
            return "You Took A Picture! You Have " + Memory.getStorageAvailable() + " Storage Remaining";
        }
        //check if we can take a picture with the light we have..
        return "You Cannot Take A Picture With This Amount Of Light. Adjust Lighting And Try Again!";
    }
}
