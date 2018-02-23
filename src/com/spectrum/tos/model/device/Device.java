package com.spectrum.tos.model.device;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {

	private String macId;
	private String cmMacAddress;
	private String type;
	private String ownerId;
	private Profile profile;
	private Model model;
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private Map<String, String> portMap;
	private DeviceStatus status;

	public String getType() {
		return type;
	}

	public Map<String, String> getPortMap() {
		return portMap;
	}

	public void setPortMap(Map<String, String> portMap) {
		this.portMap = portMap;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCmMacAddress() {
		return cmMacAddress;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public DeviceStatus getStatus() {
		return status;
	}

	public void setStatus(DeviceStatus status) {
		this.status = status;
	}

	public void setCmMacAddress(String cmMacAddress) {
		this.cmMacAddress = cmMacAddress;
	}

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "Device [macId=" + macId + ", cmMacAddress=" + cmMacAddress + ", type=" + type + ", ownerId=" + ownerId
				+ ", profile=" + profile + ", model=" + model + ", status=" + status + "]";
	}

}
