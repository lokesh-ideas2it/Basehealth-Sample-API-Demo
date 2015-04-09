package com.basehealth.api.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Disease {

	private RiskFactors riskFactors;
	private String disease;
	private String lifetimeOdds;
	private String achievableOdds;
	private String risk65Level;
	private String diseaseDisplayName;

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getLifetimeOdds() {
		return lifetimeOdds;
	}

	public void setLifetimeOdds(String lifetimeOdds) {
		this.lifetimeOdds = lifetimeOdds;
	}

	public String getAchievableOdds() {
		return achievableOdds;
	}

	public void setAchievableOdds(String achievableOdds) {
		this.achievableOdds = achievableOdds;
	}

	public String getRisk65Level() {
		return risk65Level;
	}

	public void setRisk65Level(String risk65Level) {
		this.risk65Level = risk65Level;
	}

	public String getDiseaseDisplayName() {
		return diseaseDisplayName;
	}

	public void setDiseaseDisplayName(String diseaseDisplayName) {
		this.diseaseDisplayName = diseaseDisplayName;
	}

	public RiskFactors getRiskFactors() {
		return riskFactors;
	}

	public void setRiskFactors(RiskFactors riskFactors) {
		this.riskFactors = riskFactors;
	}

	@Override
	public String toString() {
		return "Disease [riskFactors=" + riskFactors + ", disease=" + disease
				+ ", lifetimeOdds=" + lifetimeOdds + ", achievableOdds="
				+ achievableOdds + ", risk65Level=" + risk65Level
				+ ", diseaseDisplayName=" + diseaseDisplayName + "]";
	}
	
}
