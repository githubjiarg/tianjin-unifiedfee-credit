package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  客务业务 
 * @author chenghui
 */
@Table
@Entity	
public class XyglCustservice extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8707630217464650940L;

	/**
     * 企业名称
     */
    @ModelComment(value="企业名称")
   
    @Column(columnDefinition="varchar2(32)")
    private String compName;
    
    /**
     * 企业统一社会信用代码
     */
    @ModelComment(value="企业统一社会信用代码")
   
    @Column(columnDefinition="varchar2(32)")
    private String firmCreditcode;
    
    /**
     * 企业被投诉的次数
     */
    @ModelComment(value="企业被投诉的次数")
    @Column(columnDefinition="varchar2(50)")
    private String complaintNum;
    
    /**
     * 采集的时间
     */
    @ModelComment(value="采集的时间")
   
    private Date getTime;

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getFirmCreditcode() {
		return firmCreditcode;
	}

	public void setFirmCreditcode(String firmCreditcode) {
		this.firmCreditcode = firmCreditcode;
	}

	public String getComplaintNum() {
		return complaintNum;
	}

	public void setComplaintNum(String complaintNum) {
		this.complaintNum = complaintNum;
	}

	public Date getGetTime() {
		return getTime;
	}

	public void setGetTime(Date getTime) {
		this.getTime = getTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
