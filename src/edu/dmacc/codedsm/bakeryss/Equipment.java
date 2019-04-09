package edu.dmacc.codedsm.bakeryss;

import java.util.Objects;

public abstract class Equipment {

    private String equipmentType;
    private String equipmentLocation;

    public Equipment() {
    }

    public Equipment(String equipmentType, String equipmentLocation) {
        this.equipmentType = equipmentType;
        this.equipmentLocation = equipmentLocation;
    }

    public abstract Boolean useEquipment(Integer duration);

    public abstract Boolean useEquipment(Integer duration, Integer intensity);

    public Boolean useEquipment(String reason) {
        System.out.printf("Using the equipment because: %s\n", reason);
        return false;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentLocation() {
        return equipmentLocation;
    }

    public void setEquipmentLocation(String equipmentLocation) {
        this.equipmentLocation = equipmentLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(equipmentType, equipment.equipmentType) &&
                Objects.equals(equipmentLocation, equipment.equipmentLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentType, equipmentLocation);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentType='" + equipmentType + '\'' +
                ", equipmentLocation='" + equipmentLocation + '\'' +
                '}';
    }
}
