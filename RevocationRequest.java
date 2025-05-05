package com.Controller;

public class RevocationRequest {
    private String credentialId;
    private String revocationTimestamp;
    private String revocationReason;
    public RevocationRequest(String credentialId,
    String revocationTimestamp,
     String revocationReason) {
    	this.credentialId=credentialId;
    	this.revocationReason=revocationReason;
    	this.revocationTimestamp=revocationTimestamp;
}
	public String getCredentialId() {
		return credentialId;
	}
	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}
	public String getRevocationTimestamp() {
		return revocationTimestamp;
	}
	public void setRevocationTimestamp(String revocationTimestamp) {
		this.revocationTimestamp = revocationTimestamp;
	}
	public String getRevocationReason() {
		return revocationReason;
	}
	public void setRevocationReason(String revocationReason) {
		this.revocationReason = revocationReason;
	}

    // Constructor, Getters, and Setters
}


