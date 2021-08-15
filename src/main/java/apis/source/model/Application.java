package apis.source.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name="application")
public class Application implements Serializable{
	
	@Id
	@Column(name="APPLICATION_ID")
	private Integer applicationId;
	
	@Column(name="APPLICANT_NAME")
	private String applicantName;
	
	@Column(name="TIME_STAMP")
	private Date timeStamp;
	
	@Column(name="LOAN_AMOUNT")
	private Integer loanAmount;

	@Column(name="LOAN_PURPOSE")
	private String loanPurpose;
	
	@Column(name="LOAN_PURPOSE_ID")
	private int loanPurposeId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	
	@Column(name="APPLICATION_STATUS")
	private Integer applicationStatus;
	
	@Column(name="SCORE")
	private Integer score;
	
	@Column(name="DECLINE_REASON")
	private String declineReason;

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public Integer getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(Integer applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getDeclineReason() {
		return declineReason;
	}

	public void setDeclineReason(String declineReason) {
		this.declineReason = declineReason;
	}

	public int getLoanPurposeId() {
		return loanPurposeId;
	}

	public void setLoanPurposeId(int loanPurposeId) {
		this.loanPurposeId = loanPurposeId;
	}
}
