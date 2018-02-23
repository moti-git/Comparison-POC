package com.spectrum.tos.model.device;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceStatus {
	private String isProvisioned;
	private String isRegistered;
	private String status;

	public String getIsProvisioned() {
		return isProvisioned;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setIsProvisioned(String isProvisioned) {
		this.isProvisioned = isProvisioned;
	}

	public String getIsRegistered() {
		return isRegistered;
	}

	public void setIsRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}

	@Override
	public String toString() {
		return "DeviceStatus [isProvisioned=" + isProvisioned + ", isRegistered=" + isRegistered + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof DeviceStatus))
	        return false;
	    if (obj == this)
	        return true;
	    DeviceStatus deviceStatus = (DeviceStatus)obj;
	    return this.getIsProvisioned().equals(deviceStatus.getIsProvisioned()) &&
	    		this.getIsRegistered().equals(deviceStatus.getIsRegistered()) &&
	    		this.getStatus().equals(deviceStatus.getStatus());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
