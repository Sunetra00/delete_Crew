package com.example.demo.entity;

public class Crew {
	private String crewId;
	private String firstName;
	private String lastName;
	private String nickName;
	private String rank;
	private String city;

	public String getCrewId() {
		return crewId;
	}

	public void setCrewId(String crewId) {
		this.crewId = crewId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Crew [crewId=" + crewId + ", firstName=" + firstName + ", lastName=" + lastName + ", nickName="
				+ nickName + ", rank=" + rank + ", city=" + city + "]";
	}


}
