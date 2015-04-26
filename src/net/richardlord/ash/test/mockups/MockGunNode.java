package net.richardlord.ash.test.mockups;

import net.richardlord.ash.core.Node;

public class MockGunNode extends Node {
	public MockOwnerComponent owner; // gun is mounted on ...
	public MockBulletsComponent bullets; // number of bullets left
}