package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 * 支付业务 
 * @author chenghui
 */
@Table
@Entity	
public class XyglPayment extends BaseDomain {



	/**
	 * 
	 */
	private static final long serialVersionUID = -7841885328637391526L;

	/**
     * 企业名称
     */
    @ModelComment(value="企业名称")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String compName;
    
    /**
     * 企业统一社会信用代码
     */
    @ModelComment(value="企业统一社会信用代码")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String firmCreditcode;
    
    /**
     * 企业总票量
     */
    @ModelComment(value="企业总票量")
    @NotEmpty
    @Column(columnDefinition="varchar2(50)")
    private String totalbillNum;
    
    /**
     * 企业交易总额
     */
    @ModelComment(value="企业交易总额")
    @Column(columnDefinition="number(10)")
    private Integer ticketAmount;
    
    /**
     * 企业总退票量
     */
    @ModelComment(value="企业总退票量")
    @Column(columnDefinition="varchar2(50)")
    private String retuticketAmount;
    
    /**
     * 企业总退款金额
     */
    @ModelComment(value="企业总退款金额")
    @Column(columnDefinition="varchar2(50)")
    private Integer totalRefunds;
    
    /**
     * 企业总退款次数
     */
    @ModelComment(value="企业总退款次数")
    @Column(columnDefinition="varchar2(50)")
    private String totalRefundstimes;
    
    
    /**
     * 采集时间
     */
    @ModelComment(value="采集时间")
    private Date getTtime;


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


	public String getTotalbillNum() {
		return totalbillNum;
	}


	public void setTotalbillNum(String totalbillNum) {
		this.totalbillNum = totalbillNum;
	}


	public Integer getTicketAmount() {
		return ticketAmount;
	}


	public void setTicketAmount(Integer ticketAmount) {
		this.ticketAmount = ticketAmount;
	}


	public String getRetuticketAmount() {
		return retuticketAmount;
	}


	public void setRetuticketAmount(String retuticketAmount) {
		this.retuticketAmount = retuticketAmount;
	}


	public Integer getTotalRefunds() {
		return totalRefunds;
	}


	public void setTotalRefunds(Integer totalRefunds) {
		this.totalRefunds = totalRefunds;
	}


	public String getTotalRefundstimes() {
		return totalRefundstimes;
	}


	public void setTotalRefundstimes(String totalRefundstimes) {
		this.totalRefundstimes = totalRefundstimes;
	}


	public Date getGetTtime() {
		return getTtime;
	}


	public void setGetTtime(Date getTtime) {
		this.getTtime = getTtime;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
