package edu.towson.cis.cosc603.project4.vendingmachine;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 4/6/16 4:28 PM
 * @author rehakjc
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	
	/** The soda pop machine. */
	VendingMachine sodaPopMachine; 
	
	/** The coke. */
	//declare items for vending machine
	VendingMachineItem coke;
	
	/** The pesi. */
	VendingMachineItem pesi;
	
	/** The dr pepper. */
	VendingMachineItem drPepper;
	
	/** The jolt. */
	VendingMachineItem jolt;
	
	/** The code. */
	String[] code = {"A", "B", "C", "D"};
	
	/** The soda. */
	VendingMachineItem[] soda;
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}
	
	/**
	 * Test add item2 slot occupied.
	 * Precondition: Failed, slot to be used is occupied.
	 * Postcondition: Assert original item not replaced. 
	 */
	@Test(expected = VendingMachineException.class)
	public void testAddItem2SlotOccupied() {
		//add too many times
		sodaPopMachine.addItem(jolt, "A");	
		assertSame(coke, sodaPopMachine.getItem("A"));
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}
	
	/**
	 * Test make purchase2 out of stock. Attempt purchase of out of stock item
	 * Precondition: Failed, no item in slot. 
	 * Postcondition: Assert purchase fails. 
	 */
	@Test
	public void testMakePurchase_5_OutofStock() {
		//failure out of stock
		sodaPopMachine.balance = 3.99;
		assertFalse(sodaPopMachine.makePurchase("D"));	
	}
	
	/**
	 * Test make purchase4 higher balance.
	 * Precondition: Fulfilled, balance above item price
	 * Postcondition: Assert purchase succeeds. Assert new correct balance. 
	 */
	@Test
	public void testMakePurchase_6_HigherBalance() {
		//failure out of stock
		sodaPopMachine.balance = 2.00;
		assertTrue(sodaPopMachine.makePurchase("A"));
		assertEquals(0.50, sodaPopMachine.balance, 0.0);
	}
	
	/**
	 * Test make purchase1 no balance. Not enough money to make purchase.
	 * Precondition: Failed, vending machine balance under item price.
	 * Postcondition: Assert purchase fails. 
	 */
	@Test
	public void testMakePurchase_7_NoBalance() {
		//failure not enough money
		sodaPopMachine.balance = 0;
		assertFalse(sodaPopMachine.makePurchase("A"));
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test(expected = edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
		assertSame(result, fixture.removeItem(code));
	}
	
	/**
	 * Test remove item.
	 * Precondition: Fulfilled, Item in slot.
	 * Postcondition: Assert item is removed. 
	 */
	@Test
	public void testRemoveItem_4() {
		assertSame(coke, sodaPopMachine.removeItem("A")); 
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		sodaPopMachine = new VendingMachine();
		coke = new VendingMachineItem("coke", 1.50);
		pesi = new VendingMachineItem("pesi", 1.25);
		drPepper = new VendingMachineItem("Dr. Pepper", 1.34);
		jolt = new VendingMachineItem("jolt", 3.99);
		
		VendingMachineItem[] soda = {coke, pesi, drPepper, jolt};
		this.soda = soda;
		
		//add items
		sodaPopMachine.addItem(coke, "A");
		sodaPopMachine.addItem(pesi, "B");
		sodaPopMachine.addItem(drPepper, "C");
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		sodaPopMachine = null;
		for(int i = 0; i<soda.length; i++){
			soda[i] = null;
		}
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/6/16 4:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}