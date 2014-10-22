
public class RoomDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/**
	 * New instance for class room called "room1"
	 */
	Room room1 = new Room();
	room1.setPaintColor("Yellow");
	room1.setFloorType("Hardwood");
	room1.setWindows(1);
	/**
	 * New instance for class room called "room2"
	 */
	Room room2 = new Room();
	room2.setPaintColor("Purple");
	room2.setFloorType("tile");
	room2.setWindows(0);
	/**
	 * New instance for class room called "room3"
	 */
	Room room3 = new Room();
	room3.setPaintColor("White");
	room3.setFloorType("Carpet");
	room3.setWindows(3);
		
	System.out.println(room1);
	System.out.println(room2);
	System.out.println(room3);
	}
}