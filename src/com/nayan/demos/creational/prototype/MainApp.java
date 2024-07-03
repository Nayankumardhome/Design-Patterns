package com.nayan.demos.creational.prototype;

public class MainApp {

	public static void main(String[] args) {
		WeaponStore weaponStore = new WeaponStore();

        // Clone different weapons
        Weapon clonedSword = weaponStore.getWeapon("sword");
        Weapon clonedGun = weaponStore.getWeapon("gun");
        Weapon clonedBow = weaponStore.getWeapon("bow");

        // Display cloned weapons
        if (clonedSword != null) clonedSword.display();
        if (clonedGun != null) clonedGun.display();
        if (clonedBow != null) clonedBow.display();

        // Modify the cloned weapons
        clonedSword = new Sword("Iron", 70.0, new SwordDetails("Japan", 1.8));
        clonedGun = new Gun("M16", 500, new GunDetails(20, false));
        clonedBow = new Bow("Compound", 26.2, new BowDetails("Carbon", 75.0));

        // Display modified cloned weapons
        clonedSword.display();
        clonedGun.display();
        clonedBow.display();
    }
}
