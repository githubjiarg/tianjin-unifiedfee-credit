package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  清分业务 
 * @author chenghui
 */
@Table
@Entity
public class XygltCleanup extends BaseDomain {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3331555193299387433L;

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
     * 企业缴费单总金额
     */
    @ModelComment(value="企业缴费单总金额")

    @Column(columnDefinition="number(10)")
    private String paymentList;
    
    /**
     * 企业总欠费金额
     */
    @ModelComment(value="企业总欠费金额")
    @Column(columnDefinition="number(10)")
    private Integer amountArrears;
    
    /**
     * 企业总超期金额
     */
    @ModelComment(value="企业总超期金额")
    @Column(columnDefinition="number(10)")
    private Integer overdueAmount;
    
    /**
     * 获取时间
     */
    @ModelComment(value="获取时间")
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

	public String getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(String paymentList) {
		this.paymentList = paymentList;
	}

	public Integer getAmountArrears() {
		return amountArrears;
	}

	public void setAmountArrears(Integer amountArrears) {
		this.amountArrears = amountArrears;
	}

	public Integer getOverdueAmount() {
		return overdueAmount;
	}

	public void setOverdueAmount(Integer overdueAmount) {
		this.overdueAmount = overdueAmount;
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
