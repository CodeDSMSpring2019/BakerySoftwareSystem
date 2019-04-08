package edu.dmacc.codedsm.bakeryss.bakery;

import edu.dmacc.codedsm.bakeryss.bakery.Bakery;

import java.util.List;

public class DonutShop extends Bakery {

    public DonutShop() {}

    public DonutShop(List<String> equipment, List<String> employees, List<String> inventory, Double cashOnHand, Boolean isOpen) {
        super(equipment, employees, inventory, cashOnHand, isOpen);
    }

    @Override
    public List<String> bakeTheGoods() {
        return null;
    }
}
