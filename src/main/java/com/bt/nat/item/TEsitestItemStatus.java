package com.bt.nat.item;
// default package
// Generated 14-Feb-2014 15:30:39 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TEsitestItemStatus generated by hbm2java
 */
@Entity
@Table(name = "t_esitest_item_status", schema = "dbo", catalog = "esiTest")
public class TEsitestItemStatus implements java.io.Serializable {

	private int tisItemStatusId;
	private String tisItemStatusDescription;
	private String tisItemIsLive;
	private String tisIsTestingComplete;
	private String tisShowToLocaltester;
	private String tisIsElec;
	private String tisIsGas;
	private String tisIsAccessppe;
	private String tisIsElift;
	private String tisIsClimb;
	private String tisIsMech;
	private String tisIsOtm;
	private String tisIsPpe;
	private String tisIsPull;

	public TEsitestItemStatus() {
	}

	public TEsitestItemStatus(int tisItemStatusId) {
		this.tisItemStatusId = tisItemStatusId;
	}

	public TEsitestItemStatus(int tisItemStatusId,
			String tisItemStatusDescription, String tisItemIsLive,
			String tisIsTestingComplete, String tisShowToLocaltester,
			String tisIsElec, String tisIsGas, String tisIsAccessppe,
			String tisIsElift, String tisIsClimb, String tisIsMech,
			String tisIsOtm, String tisIsPpe, String tisIsPull) {
		this.tisItemStatusId = tisItemStatusId;
		this.tisItemStatusDescription = tisItemStatusDescription;
		this.tisItemIsLive = tisItemIsLive;
		this.tisIsTestingComplete = tisIsTestingComplete;
		this.tisShowToLocaltester = tisShowToLocaltester;
		this.tisIsElec = tisIsElec;
		this.tisIsGas = tisIsGas;
		this.tisIsAccessppe = tisIsAccessppe;
		this.tisIsElift = tisIsElift;
		this.tisIsClimb = tisIsClimb;
		this.tisIsMech = tisIsMech;
		this.tisIsOtm = tisIsOtm;
		this.tisIsPpe = tisIsPpe;
		this.tisIsPull = tisIsPull;
	}

	@Id
	@Column(name = "tis_item_status_id", unique = true, nullable = false)
	public int getTisItemStatusId() {
		return this.tisItemStatusId;
	}

	public void setTisItemStatusId(int tisItemStatusId) {
		this.tisItemStatusId = tisItemStatusId;
	}

	@Column(name = "tis_item_status_description", length = 50)
	public String getTisItemStatusDescription() {
		return this.tisItemStatusDescription;
	}

	public void setTisItemStatusDescription(String tisItemStatusDescription) {
		this.tisItemStatusDescription = tisItemStatusDescription;
	}

	@Column(name = "tis_item_is_live", length = 1)
	public String getTisItemIsLive() {
		return this.tisItemIsLive;
	}

	public void setTisItemIsLive(String tisItemIsLive) {
		this.tisItemIsLive = tisItemIsLive;
	}

	@Column(name = "tis_is_testing_complete", length = 1)
	public String getTisIsTestingComplete() {
		return this.tisIsTestingComplete;
	}

	public void setTisIsTestingComplete(String tisIsTestingComplete) {
		this.tisIsTestingComplete = tisIsTestingComplete;
	}

	@Column(name = "tis_show_to_localtester", length = 1)
	public String getTisShowToLocaltester() {
		return this.tisShowToLocaltester;
	}

	public void setTisShowToLocaltester(String tisShowToLocaltester) {
		this.tisShowToLocaltester = tisShowToLocaltester;
	}

	@Column(name = "tis_is_elec", length = 1)
	public String getTisIsElec() {
		return this.tisIsElec;
	}

	public void setTisIsElec(String tisIsElec) {
		this.tisIsElec = tisIsElec;
	}

	@Column(name = "tis_is_gas", length = 1)
	public String getTisIsGas() {
		return this.tisIsGas;
	}

	public void setTisIsGas(String tisIsGas) {
		this.tisIsGas = tisIsGas;
	}

	@Column(name = "tis_is_accessppe", length = 1)
	public String getTisIsAccessppe() {
		return this.tisIsAccessppe;
	}

	public void setTisIsAccessppe(String tisIsAccessppe) {
		this.tisIsAccessppe = tisIsAccessppe;
	}

	@Column(name = "tis_is_elift", length = 1)
	public String getTisIsElift() {
		return this.tisIsElift;
	}

	public void setTisIsElift(String tisIsElift) {
		this.tisIsElift = tisIsElift;
	}

	@Column(name = "tis_is_climb", length = 1)
	public String getTisIsClimb() {
		return this.tisIsClimb;
	}

	public void setTisIsClimb(String tisIsClimb) {
		this.tisIsClimb = tisIsClimb;
	}

	@Column(name = "tis_is_mech", length = 1)
	public String getTisIsMech() {
		return this.tisIsMech;
	}

	public void setTisIsMech(String tisIsMech) {
		this.tisIsMech = tisIsMech;
	}

	@Column(name = "tis_is_otm", length = 1)
	public String getTisIsOtm() {
		return this.tisIsOtm;
	}

	public void setTisIsOtm(String tisIsOtm) {
		this.tisIsOtm = tisIsOtm;
	}

	@Column(name = "tis_is_ppe", length = 1)
	public String getTisIsPpe() {
		return this.tisIsPpe;
	}

	public void setTisIsPpe(String tisIsPpe) {
		this.tisIsPpe = tisIsPpe;
	}

	@Column(name = "tis_is_pull", length = 1)
	public String getTisIsPull() {
		return this.tisIsPull;
	}

	public void setTisIsPull(String tisIsPull) {
		this.tisIsPull = tisIsPull;
	}

}