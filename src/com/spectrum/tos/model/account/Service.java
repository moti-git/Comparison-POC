package com.spectrum.tos.model.account;

import java.util.HashMap;
import java.util.Map;

import com.spectrum.tos.model.device.Profile;

public class Service {

	private String serviceId;
	private String parentServiceId;
	private String serviceAddressId;
	private String serviceName;
	private String serviceAccountId;
	private Status status = new Status();
	private String type;
	private Map<String, String> topology = new HashMap<>();
	private Profile profile;
	private Map<String, String> characteristics;

	public String getServiceId() {
		return serviceId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getTopology() {
		return topology;
	}

	public void setTopology(Map<String, String> topology) {
		this.topology = topology;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getParentServiceId() {
		return parentServiceId;
	}

	public void setParentServiceId(String parentServiceId) {
		this.parentServiceId = parentServiceId;
	}

	public String getServiceAddressId() {
		return serviceAddressId;
	}

	public void setServiceAddressId(String serviceAddressId) {
		this.serviceAddressId = serviceAddressId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceAccountId() {
		return serviceAccountId;
	}

	public void setServiceAccountId(String serviceAccountId) {
		this.serviceAccountId = serviceAccountId;
	}

	public Map<String, String> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(Map<String, String> characteristics) {
		this.characteristics = characteristics;
	}

}
