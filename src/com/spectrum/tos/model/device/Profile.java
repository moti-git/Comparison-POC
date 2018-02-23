package com.spectrum.tos.model.device;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Profile {

	private String dsBurst;
	private String maxDs;
	private String maxCpes;
	private String maxUs;
	private String scnUs;
	private String scnDs;
	private String usBurst;
	private String classOfService;
	private String provisonGroup;
	private String fqdn;
	private String dhcp;
	private String cmsport;
	private String cms;
	private String ipAddress;

	public String getCmsport() {
		return cmsport;
	}

	public void setCmsport(String cmsport) {
		this.cmsport = cmsport;
	}

	public String getCms() {
		return cms;
	}

	public void setCms(String cms) {
		this.cms = cms;
	}

	public String getClassOfService() {
		return classOfService;
	}

	public void setClassOfService(String classOfService) {
		this.classOfService = classOfService;
	}

	public String getProvisonGroup() {
		return provisonGroup;
	}

	public void setProvisonGroup(String provisonGroup) {
		this.provisonGroup = provisonGroup;
	}

	public String getFqdn() {
		return fqdn;
	}

	public void setFqdn(String fqdn) {
		this.fqdn = fqdn;
	}

	public String getScnDs() {
		return scnDs;
	}

	public void setScnDs(String scnDs) {
		this.scnDs = scnDs;
	}

	public String getUsBurst() {
		return usBurst;
	}

	public void setUsBurst(String usBurst) {
		this.usBurst = usBurst;
	}

	public String getMaxCpes() {
		return maxCpes;
	}

	public void setMaxCpes(String maxCpes) {
		this.maxCpes = maxCpes;
	}

	public String getMaxUs() {
		return maxUs;
	}

	public void setMaxUs(String maxUs) {
		this.maxUs = maxUs;
	}

	public String getScnUs() {
		return scnUs;
	}

	public void setScnUs(String scnUs) {
		this.scnUs = scnUs;
	}

	public String getDsBurst() {
		return dsBurst;
	}

	public void setDsBurst(String dsBurst) {
		this.dsBurst = dsBurst;
	}

	public String getMaxDs() {
		return maxDs;
	}

	public void setMaxDs(String maxDs) {
		this.maxDs = maxDs;
	}

	@Override
	public String toString() {
		return "Profile [dsBurst=" + dsBurst + ", maxDs=" + maxDs + ", maxCpes=" + maxCpes + ", maxUs=" + maxUs
				+ ", scnUs=" + scnUs + ", scnDs=" + scnDs + ", usBurst=" + usBurst + ", classOfService="
				+ classOfService + ", provisonGroup=" + provisonGroup + ", fqdn=" + fqdn + "]";
	}

	public String getDhcp() {
		return dhcp;
	}

	public void setDhcp(String dhcp) {
		this.dhcp = dhcp;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof Profile))
	        return false;
	    if (obj == this)
	        return true;
	    Profile profile = (Profile)obj;
	    return this.getClassOfService().equals(profile.getClassOfService()) &&
	    	this.getCms().equals(profile.getCms()) && this.getCmsport().equals(profile.getCms()) &&
	    	this.getCmsport().equals(profile.getCmsport()) && this.getDhcp().equals(profile.getDhcp()) &&
	    	this.getDsBurst().equals(profile.getDsBurst()) && this.getFqdn().equals(profile.getFqdn()) &&
	    	this.getIpAddress().equals(profile) && this.getMaxCpes().equals(profile.getMaxCpes()) &&
	    	this.getMaxDs().equals(profile.getMaxDs()) && this.getMaxUs().equals(profile.getMaxUs()) &&
	    	this.getProvisonGroup().equals(profile.getProvisonGroup()) && this.getScnDs().equals(profile.getScnDs()) &&
	    	this.getScnUs().equals(profile.getScnUs()) && this.getUsBurst().equals(profile.getUsBurst());
	}

}
