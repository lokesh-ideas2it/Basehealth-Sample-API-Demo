package com.basehealth.api.demo;

public class MedicinesTaken {
	
	private String diuretics;
	private String nsaids;
	
	public String getDiuretics() {
		return diuretics;
	}
	public void setDiuretics(String diuretics) {
		this.diuretics = diuretics;
	}
	public String getNsaids() {
		return nsaids;
	}
	public void setNsaids(String nsaids) {
		this.nsaids = nsaids;
	}
	
	@Override
	public String toString() {
		return "MedicinesTaken [diuretics=" + diuretics + ", nsaids=" + nsaids
				+ "]";
	}
	public MedicinesTaken(String diuretics, String nsaids) {
		super();
		this.diuretics = diuretics;
		this.nsaids = nsaids;
	}
		
}
