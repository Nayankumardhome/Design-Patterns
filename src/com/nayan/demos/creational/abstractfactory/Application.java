package com.nayan.demos.creational.abstractfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static List<FurnitureSet> getFurnitureSetsFromFactories() {
        List<FurnitureSet> furnitureSets = new ArrayList<>();
        
        try (FileInputStream fin = new FileInputStream("factories.txt");
             Scanner sc = new Scanner(fin)) {
            
            while (sc.hasNextLine()) {
                String factoryClassName = sc.nextLine();
                FurnitureFactory factory = (FurnitureFactory) Class.forName(factoryClassName)
                                                            .getConstructor()
                                                            .newInstance();
                FurnitureSet furnitureSet = factory.createFurnitureSet();
                furnitureSets.add(furnitureSet);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return furnitureSets;
    }
}