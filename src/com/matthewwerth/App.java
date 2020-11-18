package com.matthewwerth;

public class App {

    public static void main(String[] args) throws Exception {
	Camera myCamera = new Camera("Sony", "a7X",10, true);
        System.out.println(myCamera.takePicture(55));
    }
}
