package com.basehealth.api.demo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class RiskFactors {

	protected Map<String, Object> factors = new HashMap<String, Object>();

	public Object get(String name) {
		return factors.get(name);
	}

	// "any getter" needed for serialization
	@JsonAnyGetter
	public Map<String, Object> any() {
		return factors;
	}

	@JsonAnySetter
	public void set(String name, Object value) {
		factors.put(name, value);
	}

	@Override
	public String toString() {
		return "[" + factors + "]";
	}
}
