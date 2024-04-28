package com.javaex.vo;

public class PersonVo2 {

	// 필드
	private int personId;
	private String name;
	private String hp;
	private String company;
	private String gender;
	
	public PersonVo2() {
		super();
	}

	public PersonVo2(int personId, String name, String hp, String company, String gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.hp = hp;
		this.company = company;
		this.gender = gender;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PersonVo2 [personId=" + personId + ", name=" + name + ", hp=" + hp + ", company=" + company
				+ ", gender=" + gender + "]";
	}

}