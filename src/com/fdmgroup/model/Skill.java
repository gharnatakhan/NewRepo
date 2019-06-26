package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill {
	@Id
	private int skillId;
	
	private String skillName;
	
	@ManyToMany(mappedBy="skills")
	private List<Trainee> trainees = new ArrayList<>();

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(int skillId, String skillName, List<Trainee> trainees) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.trainees = trainees;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", trainees=" + trainees + "]";
	}
	
	
}
