package entities;

public class Room {
	
	private String name;
	private String email;
	private int room;
	
	public Room(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Room(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getRoom() {
		return room;
	}
	
	public String toString() {
		return name + ", " + email;
				
	}

}
