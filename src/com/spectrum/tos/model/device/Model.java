package com.spectrum.tos.model.device;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Model {
	private String deviceType;
	private String modelNumber;
	private String softwareVersionNumber;
	private String vendorName;
	private String deviceSerialNumber;
	private String maxPorts;

	public String getMaxPorts() {
		return maxPorts;
	}

	public void setMaxPorts(String maxPorts) {
		this.maxPorts = maxPorts;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getSoftwareVersionNumber() {
		return softwareVersionNumber;
	}

	public void setSoftwareVersionNumber(String softwareVersionNumber) {
		this.softwareVersionNumber = softwareVersionNumber;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

	@Override
	public String toString() {
		return "Model [deviceType=" + deviceType + ", modelNumber=" + modelNumber + ", softwareVersionNumber="
				+ softwareVersionNumber + ", vendorName=" + vendorName + ", deviceSerialNumber=" + deviceSerialNumber
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof Model))
	        return false;
	    if (obj == this)
	        return true;
	    Model model = (Model)obj;
	    return this.getDeviceType().equals(model.getDeviceType()) &&
	    		this.getDeviceSerialNumber().equals(model.getDeviceSerialNumber()) &&
	    		this.getMaxPorts().equals(model.getMaxPorts()) &&
	    		this.getModelNumber().equals(model.getModelNumber()) &&
	    		this.getSoftwareVersionNumber().equals(model.getSoftwareVersionNumber()) &&
	    		this.getVendorName().equals(model.getVendorName());
	}
	
	
	/*@Override
	public int hashCode() {
		return super.hashCode();
	}*/
}
