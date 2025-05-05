package com.Controller;

public class CredentialStatus {
    private String statusPurpose;
    private String statusListIndex;
    public CredentialStatus(String statusPurpose, String statusListIndex, String statusListCredential) {
		super();
		this.statusPurpose = statusPurpose;
		this.statusListIndex = statusListIndex;
		this.statusListCredential = statusListCredential;
	}
	private String statusListCredential;
	public String getStatusPurpose() {
		return statusPurpose;
	}
	public void setStatusPurpose(String statusPurpose) {
		this.statusPurpose = statusPurpose;
	}
	public String getStatusListCredential() {
		return statusListCredential;
	}
	public void setStatusListCredential(String statusListCredential) {
		this.statusListCredential = statusListCredential;
	}
	public String getStatusListIndex() {
		return statusListIndex;
	}
	public void setStatusListIndex(String statusListIndex) {
		this.statusListIndex = statusListIndex;
	}

    // Constructor, Getters, and Setters
}


