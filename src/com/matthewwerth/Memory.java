package com.matthewwerth;

import java.util.List;

public class Memory {
    private static Integer storageAvailable;

    public static Integer getStorageAvailable() {
        return storageAvailable;
    }

    public Memory(Integer storageAvailable) { //maybe this should be an array of fixed size that stores id#s to ref our data stored?
        this.storageAvailable = storageAvailable;
    }

    public static boolean storeData(int spaceRequired) {
        if((storageAvailable - spaceRequired) < 0) return false;
        else storageAvailable -= spaceRequired; //we should ideally create a List of ids or something so we can retrieve past data?
        return true;
    }
}

