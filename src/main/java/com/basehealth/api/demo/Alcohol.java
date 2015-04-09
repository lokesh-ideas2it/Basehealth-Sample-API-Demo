package com.basehealth.api.demo;

public class Alcohol {
	
	private String spiritsPerWeek;
	private String beersPerWeek;
	private String winePerWeek;
	
	public String getSpiritsPerWeek() {
		return spiritsPerWeek;
	}
	public void setSpiritsPerWeek(String spiritsPerWeek) {
		this.spiritsPerWeek = spiritsPerWeek;
	}
	public String getBeersPerWeek() {
		return beersPerWeek;
	}
	public void setBeersPerWeek(String beersPerWeek) {
		this.beersPerWeek = beersPerWeek;
	}
	public String getWinePerWeek() {
		return winePerWeek;
	}
	public void setWinePerWeek(String winePerWeek) {
		this.winePerWeek = winePerWeek;
	}
	
	@Override
	public String toString() {
		return "Alcohol [spiritsPerWeek=" + spiritsPerWeek + ", beersPerWeek="
				+ beersPerWeek + ", winePerWeek=" + winePerWeek + "]";
	}
	
	public Alcohol(String spiritsPerWeek, String beersPerWeek,
			String winePerWeek) {
		super();
		this.spiritsPerWeek = spiritsPerWeek;
		this.beersPerWeek = beersPerWeek;
		this.winePerWeek = winePerWeek;
	}
	
}
