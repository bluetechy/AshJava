package net.richardlord.ash.test.mockups;

import net.richardlord.ash.core.Entity;
import net.richardlord.ash.test.EngineTest;

public class MockGunEntity extends Entity {

	/**
	 * 
	 */
	private final EngineTest engineTest;

	public MockGunEntity(EngineTest engineTest, MockSpaceShipEntity owner) {
		super(); // generate a name
		this.engineTest = engineTest;
		this.add(new MockAngleComponent(0.0f)).add(new MockBulletsComponent()).add(new MockOwnerComponent(owner)); // angle compared to ship!
		this.engineTest.engine.addEntity(this);
	}
}