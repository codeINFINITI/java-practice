package com.telusko.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALIEN_MST")

public class Alien {
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + aname.toString() + ", color=" + color + "]";
	}

	@Id
	private int aid;
	private AlienName aname;

	public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	@Column(name = "ALIEN_COLOR")
	private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
