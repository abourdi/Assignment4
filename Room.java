/**
 * Room class is a class that contains constructors and methods
 * @author Amine
 * October 20, 2014
 */
//setting up the class
public class Room {
	public String paintColor = "white";
	public String floorType = "carpet";
	public int windows = 0;
	
	/**
	 * Constructor Room
	 */
	//creating constructor that doesn't take arguments
	public Room () {
	}	
	/**
	 * Constructor Room
	 * @param wallColor
	 * @param floorType
	 * @param windows
	 */
	//overloaded constructor
	public Room (String paintColor, String floorType, int windows) {
	}
	/**
	 * Set method for Paint Color
	 * @param paintColor
	 */
	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}
	/**
	 * Set method for Floor Type
	 * @param floorType
	 */
	public void setFloorType(String floorType) {
		this.floorType = floorType;	
	}
	/**
	 * Set method for Windows
	 * @param windows
	 */
	public void setWindows(int windows) {
		this.windows = windows;	
	}
	/**
	 * Get Method for color
	 * @return paintColor
	 */
	public String getColor() {
		return paintColor;	
	}
	/**
	 * get Method for floor	
	 * @return floorType
	 */
	public String getFloor() {
		return floorType;	
	}
	/**
	 * Get Method for Windows	
	 * @return Windows
	 */
	public int getWindows() {
		return windows;	
	}
	/**
	 * Method to convert everything into a String
	 */
	@Override
	public String toString() {
		return "The color of the paint is " + getColor() + 
				", the floor is " + getFloor() + " and it has " + 
				getWindows() + " window(s)";
		
	}	
	
}
	