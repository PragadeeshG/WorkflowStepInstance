package com.test1;

public class WorkFlowSteps {
	private int stepId;
	private int sequence;
	private String beanName;
	private Boolean autoTrigger;
	private int nextStepId;
	private String status;

	public WorkFlowSteps() {

	}

	public WorkFlowSteps(int stepId, int sequence, String beanName, Boolean autoTrigger, int nextStepId,
			String status) {
		super();
		this.stepId = stepId;
		this.sequence = sequence;
		this.beanName = beanName;
		this.autoTrigger = autoTrigger;
		this.nextStepId = nextStepId;
		this.status = status;
	}

	public int getStepId() {
		return stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public Boolean getAutoTrigger() {
		return autoTrigger;
	}

	public void setAutoTrigger(Boolean autoTrigger) {
		this.autoTrigger = autoTrigger;
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

}
