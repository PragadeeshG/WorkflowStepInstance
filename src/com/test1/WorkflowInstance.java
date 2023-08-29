package com.test1;

public class WorkflowInstance {
	private int wfld;
	private int datasetld;
	private String createdDate;
	private String requestStatus;
	private String currentStep;
	private String previousStep;
	private String modifiedStep;

	public WorkflowInstance() {

	}

	public WorkflowInstance(int wfld, int datasetld, String createdDate, String requestStatus, String currentStep,
			String previousStep, String modifiedStep) {
		super();
		this.wfld = wfld;
		this.datasetld = datasetld;
		this.createdDate = createdDate;
		this.requestStatus = requestStatus;
		this.currentStep = currentStep;
		this.previousStep = previousStep;
		this.modifiedStep = modifiedStep;
	}

	public int getWfld() {
		return wfld;
	}

	public void setWfld(int wfld) {
		this.wfld = wfld;
	}

	public int getDatasetld() {
		return datasetld;
	}

	public void setDatasetld(int datasetld) {
		this.datasetld = datasetld;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getCurrentStep() {
		return currentStep;
	}

	public void setCurrentStep(String currentStep) {
		this.currentStep = currentStep;
	}

	public String getPreviousStep() {
		return previousStep;
	}

	public void setPreviousStep(String previousStep) {
		this.previousStep = previousStep;
	}

	public String getModifiedStep() {
		return modifiedStep;
	}

	public void setModifiedStep(String modifiedStep) {
		this.modifiedStep = modifiedStep;
	}

}
