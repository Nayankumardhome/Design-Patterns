package com.nayan.demos.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class WeaponStore {

	private Map<String,Weapon> prototypes= new HashMap<String, Weapon>();
	
	public WeaponStore() {
        // Initialize prototypes
        prototypes.put("sword", new Sword("Steel", 75.0, new SwordDetails("India", 1.5)));
        prototypes.put("gun", new Gun("AK-47", 400, new GunDetails(30, true)));
        prototypes.put("bow", new Bow("Recurve", 22.0, new BowDetails("Wood", 70.0)));
    }

    public Weapon getWeapon(String type) {
        Weapon prototype = prototypes.get(type);
        return prototype != null ? prototype.clone() : null;
    }
}
