package net.richardlord.ash.test.mockups;

import net.richardlord.ash.core.Component;

public class MockBulletsComponent extends Component {
	public int bulletNrs;
	int impact;

	public MockBulletsComponent() {
		this.bulletNrs = 5;
		impact = 3;
	}
}