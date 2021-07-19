package com.home.service;
import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("intel", 64, 256, 3);
        for (int i = computer1.getResourceCycle(); i > -1 ; i--) {
            computer1.on();
        }
    }
}
