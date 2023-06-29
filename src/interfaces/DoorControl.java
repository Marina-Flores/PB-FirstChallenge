package interfaces;

public interface DoorControl {
	boolean isDoorOpened = false; 
	
	public void openDoor(int doorsNumber);
	public void closeDoor(int doorsNumber);
	public void lockDoors();
	public void unlockDoors();
}
