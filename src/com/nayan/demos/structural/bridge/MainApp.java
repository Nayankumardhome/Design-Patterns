package com.nayan.demos.structural.bridge;

public class MainApp {

	public static void main(String[] args) {
		Remote ref = new BasicRemote(new SmartTv());
		ref.power();
		
		amazonFireStickRemote ref2 = new amazonFireStickRemote(new Television());
		ref2.connectToNetflix();
		
		amazonFireStickRemote ref3 = new amazonFireStickRemote(new SmartTv());
		ref3.connectToNetflix();
		
		//Will be created using Factory pattern for now just manually put on here
		//but it can come through Factory pattern also
		
		//Bridge:
		/*         
		 * Remote(interface for combine all the subclasses)
		 *   ^
		 *   |           (contains)/Bridge
		 * BasicRemote  -------------------->> Device((interface for combine all the subclasses))
		 *   ^                                   ^
		 *   |                                   |
		 * AdvancedRemote             Television, Radio, SmartTv
		 *   ^
		 *   |
		 * amazonFireStickRemote
		 * 
		 * 
		 */
	}
}
