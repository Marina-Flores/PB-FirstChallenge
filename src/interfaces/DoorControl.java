package interfaces;

public interface DoorControl {
	
	public void openDoor(int doorsNumber);
	public void closeDoor(int doorsNumber);
	public void lockDoors();
	public void unlockDoors();
}
