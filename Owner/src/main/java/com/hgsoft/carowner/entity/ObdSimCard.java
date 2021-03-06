package com.hgsoft.carowner.entity;


import java.util.Date;

/**
 * Wifi generated by hbm2java
 */
public class ObdSimCard implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String obdSn;
	private String firmVersion;
	private String lastSleep;
	private Integer upElectricNo;
	private Integer type;
	private String number;
	private Date createTime;

	public ObdSimCard() {
	}
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getObdSn() {
		return obdSn;
	}



	public void setObdSn(String obdSn) {
		this.obdSn = obdSn;
	}



	public String getFirmVersion() {
		return firmVersion;
	}



	public void setFirmVersion(String firmVersion) {
		this.firmVersion = firmVersion;
	}



	public String getLastSleep() {
		return lastSleep;
	}



	public void setLastSleep(String lastSleep) {
		this.lastSleep = lastSleep;
	}



	public Integer getUpElectricNo() {
		return upElectricNo;
	}



	public void setUpElectricNo(Integer upElectricNo) {
		this.upElectricNo = upElectricNo;
	}



	public Integer getType() {
		return type;
	}



	public void setType(Integer type) {
		this.type = type;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "ObdSimCard [id=" + id + ", obdSn=" + obdSn + ", firmVersion=" + firmVersion + ", lastSleep=" + lastSleep
				+ ", upElectricNo=" + upElectricNo + ", type=" + type + ", number=" + number + ", createTime="
				+ createTime + "]";
	}

	

}
