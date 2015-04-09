package com.basehealth.api.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 *
 */
public class GoutInputRequest {

	private Alcohol alcohol;
	
	private MedicinesTaken medicinesTakenPast30Days;
	
	@JsonProperty(value = "systolicBloodPressure(mmHg)")
	private String systolicBloodPressure;

	@JsonProperty(value = "diastolicBloodPressure(mmHg)")
	private String diastolicBloodPressure;

	private String ethnicity;

	private String gender;

	@JsonProperty(value = "height(in)")
	private String height;

	@JsonProperty(value = "weight(lbs)")
	private String weight;

	private String yearOfBirth;

	public Alcohol getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Alcohol alcohol) {
		this.alcohol = alcohol;
	}

	public MedicinesTaken getMedicinesTakenPast30Days() {
		return medicinesTakenPast30Days;
	}

	public void setMedicinesTakenPast30Days(MedicinesTaken medicinesTakenPast30Days) {
		this.medicinesTakenPast30Days = medicinesTakenPast30Days;
	}

	public String getSystolicBloodPressure() {
		return systolicBloodPressure;
	}

	public void setSystolicBloodPressure(String systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}

	public String getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}

	public void setDiastolicBloodPressure(String diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return "GoutParams [alcohol=" + alcohol + ", medicinesTakenPast30Days="
				+ medicinesTakenPast30Days + ", systolicBloodPressure="
				+ systolicBloodPressure + ", diastolicBloodPressure="
				+ diastolicBloodPressure + ", ethnicity=" + ethnicity
				+ ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + ", yearOfBirth=" + yearOfBirth + "]";
	}

}