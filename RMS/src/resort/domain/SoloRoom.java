package resort.domain;

import java.util.ArrayList;

class SoloRoom {
	private String name;
	private String contact;
	private String gender;

	ArrayList<Food> food = new ArrayList<>();

	SoloRoom() {
		setName("");
	}

	SoloRoom(String name, String contact, String gender) {
		setName(name);
		setContact(contact);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
