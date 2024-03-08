package org.example.demo22.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String kind;
    private String ubuntu;
    private String information;
    private String CPU;
    private String Ram;
    private String Card;
    private String Grapes;
    private String screen;
    private String cost;
    private String date;
    private String status;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getUbuntu() {
        return ubuntu;
    }

    public void setUbuntu(String ubuntu) {
        this.ubuntu = ubuntu;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getCard() {
        return Card;
    }

    public void setCard(String card) {
        Card = card;
    }

    public String getGrapes() {
        return Grapes;
    }

    public void setGrapes(String grapes) {
        Grapes = grapes;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Computer() {
    }

    public Computer(int id, String name, String brand, String kind, String ubuntu, String information, String CPU, String ram, String card, String grapes, String screen, String cost, String date, String status, String description) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.kind = kind;
        this.ubuntu = ubuntu;
        this.information = information;
        this.CPU = CPU;
        Ram = ram;
        Card = card;
        Grapes = grapes;
        this.screen = screen;
        this.cost = cost;
        this.date = date;
        this.status = status;
        this.description = description;
    }
}
