package net.richardlord.ash.test.mockups;

import net.richardlord.ash.core.Component;

public class MockOwnerComponent extends Component {
	MockSpaceShipEntity ship;

	public MockOwnerComponent(MockSpaceShipEntity s) {
		super();
		this.ship = s;
	}
}