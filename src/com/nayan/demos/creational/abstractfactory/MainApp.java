package com.nayan.demos.creational.abstractfactory;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		List<FurnitureSet> furnitureSets = Application.getFurnitureSetsFromFactories();
        for (FurnitureSet furnitureSet : furnitureSets) {
            if (furnitureSet instanceof ClassicFurnitureSet) {
                ClassicFurnitureSet classicSet = (ClassicFurnitureSet) furnitureSet;
                System.out.println("Created Classic Furniture Set:");
                System.out.println("Chair Material: " + classicSet.getChair().hasMaterial() + "\nChair Legs: " + classicSet.getChair().hasLegs());
                System.out.println("Sofa Material: " + classicSet.getSofa().hasMaterial());
                System.out.println("Teapoy Material: " + classicSet.getTeapoy().hasMaterial());
            } else if (furnitureSet instanceof ModernFurnitureSet) {
                ModernFurnitureSet modernSet = (ModernFurnitureSet) furnitureSet;
                System.out.println("Created Modern Furniture Set:");
                System.out.println("Chair Material: " + modernSet.getChair().hasMaterial() + "\nChair Legs: " + modernSet.getChair().hasLegs());
                System.out.println("Sofa Material: " + modernSet.getSofa().hasMaterial());
                System.out.println("Teapoy Material: " + modernSet.getTeapoy().hasMaterial());
            }
        }
	}

}
