package com.test1;

public class WorkflowStepInstance {
	private int id;
	private int stepId;
	private String pendingOn;
	private int nextStepId;
	private String status;
	private String remarks;
	private String rejectReason;
	private String createdDate;

	public WorkflowStepInstance() {

	}

	public WorkflowStepInstance(int id, int stepId, String pendingOn, int nextStepId, String status, String remarks,
			String rejectReason, String createdDate) {
		super();
		this.id = id;
		this.stepId = stepId;
		this.pendingOn = pendingOn;
		this.nextStepId = nextStepId;
		this.status = status;
		this.remarks = remarks;
		this.rejectReason = rejectReason;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStepId() {
		return stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public String getPendingOn() {
		return pendingOn;
	}

	public void setPendingOn(String pendingOn) {
		this.pendingOn = pendingOn;
	}

	public int getNextStepId() {
		return nextStepId;
	}

	public void setNextStepId(int nextStepId) {
		this.nextStepId = nextStepId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

}
