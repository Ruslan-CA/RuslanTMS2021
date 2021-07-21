package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram, hardDisk, resourceCycle;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private boolean burned = false;

    public Computer(String cpu, int ram, int hardDisk, int resourceCycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.resourceCycle = resourceCycle;
    }

    @Override
    public String toString() {
        return "Компьютер{" +
                "процессор='" + cpu + '\'' +
                ", оперативная память=" + ram +
                ", жесткий диск=" + hardDisk +
                ", ресурс=" + resourceCycle +
                '}';
    }

    public void detailedInformation() {
        System.out.printf("процессор: %s, оперативная память: %d, жесткий диск: %d, ресурс циклов: %d", cpu, ram, hardDisk, resourceCycle);
    }

    private boolean resourceCheck() {
        return resourceCycle > 0;
    }

    private boolean actionCheck() {
        while (true) {
            System.out.println("Введите число от 0 до 1");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value == 0 || value == 1) {
                    return random.nextInt(2) == value;
                }
            } else {
                System.out.println("Кажется что-то пошло не так...");
                scanner.next();
            }
        }
    }

    public void on() {
        System.out.println("Включение...");
        if (resourceCheck() && resourceCheck()) {
            System.out.println("Компьютер включен");
            of();
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void of() {
        System.out.println("Компьютер выключен...");
        resourceCycle--;
        System.out.println("Осталось циклов:" + resourceCycle);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getResourceCycle() {
        return resourceCycle;
    }

    public void setResourceCycle(int resourceCycle) {
        this.resourceCycle = resourceCycle;
    }
}

