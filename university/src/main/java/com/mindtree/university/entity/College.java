package com.mindtree.university.entity;

public class College {
	private int collegeId;
	private String collegeName;
	private int collegeRating;

	public College() {

	}
	public College(int collegeId, String collegeName, int collegeRating) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeRating = collegeRating;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getCollegeRating() {
		return collegeRating;
	}

	public void setCollegeRating(int collegeRating) {
		this.collegeRating = collegeRating;
	}
}
