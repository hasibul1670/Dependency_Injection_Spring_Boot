package com.example.demo.model;

import jakarta.annotation.PreDestroy;

public class Computer {
    private String brand;


    public Computer(String brand) {
        this.brand = brand;
        System.out.println("Arg Constructor Called [Computer Class]");
    }

    public Computer() {
        System.out.println("No Arg Constructor Called [Computer Class]");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @PreDestroy
    public void destroy() {
        System.out.println("Computer object Destroy");
    }
}


