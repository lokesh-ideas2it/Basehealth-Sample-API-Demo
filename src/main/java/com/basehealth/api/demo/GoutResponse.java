package com.basehealth.api.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * POJO representing Response Body
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoutResponse {

	private ArrayList<Disease> diseases;
	private String version;

	@Override
	public String toString() {
		return "GoutResponse [diseases=" + diseases + ", version=" + version
				+ "]";
	}

	public ArrayList<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(ArrayList<Disease> diseases) {
		this.diseases = diseases;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
