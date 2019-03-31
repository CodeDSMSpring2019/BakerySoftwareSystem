package edu.dmacc.codedsm.bakeryss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bakery {

    private List<String> equipment;
    private List<String> employees;
    private List<String> inventory;
    private Double cashOnHand;
    private Boolean isOpen;

    public Bakery() {
        this.equipment = Arrays.asList();
        this.employees = Arrays.asList("Default Employee");
        this.inventory = new ArrayList<>();
        this.cashOnHand = 100.0d;
        this.isOpen = true;
    }

    public Bakery(List<String> equipment, List<String> employees, List<String> inventory, Double cashOnHand, Boolean isOpen) {
        this.equipment = equipment;
        this.employees = employees;
        this.inventory = inventory;
        this.cashOnHand = cashOnHand;
        this.isOpen = isOpen;
    }

    public Boolean openTheStore(String employeeName) {
        return false;
    }

    public void performInventory(List<String> goods) {

    }

    public String performSale(String good, String customerName, Double cash) {
        return "receipt";
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public Double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(Double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "equipment=" + equipment +
                ", employees=" + employees +
                ", inventory=" + inventory +
                ", cashOnHand=" + cashOnHand +
                ", isOpen=" + isOpen +
                '}';
    }
}
