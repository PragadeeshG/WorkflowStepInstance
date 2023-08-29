package com.test1;

public class Workflow {
	private int wfld;
	private String wfName;
	private String description;
	private String status;

	public Workflow() {

	}

	public Workflow(int wfld, String wfName, String description, String status) {
		super();
		this.wfld = wfld;
		this.wfName = wfName;
		this.description = description;
		this.status = status;
	}

	public int getWfld() {
		return wfld;
	}

	public void setWfld(int wfld) {
		this.wfld = wfld;
	}

	public String getWfName() {
		return wfName;
	}

	public void setWfName(String wfName) {
		this.wfName = wfName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
