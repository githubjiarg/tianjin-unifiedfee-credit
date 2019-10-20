package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  缴费业务 
 * @author chenghui
 */
@Table
@Entity	
public class XyglPaycost extends BaseDomain {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 6690935673834554341L;

	
    
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
     * 企业缴费单总单数
     */
    @ModelComment(value="企业缴费单总单数")
  
    @Column(columnDefinition="varchar2(50)")
    private String totalbillNum;
    
    /**
     * 企业交易总额
     */
    @ModelComment(value="企业交易总额")
    @Column(columnDefinition="number(10)")
    private Integer tradeTotal;
    
    /**
     * 未闭单数
     */
    @ModelComment(value="未闭单数")
    @Column(columnDefinition="varchar2(50)")
    private String closeTimes;
    
    /**
     * 提货总单数
     */
    @ModelComment(value="提货总单数")
    @Column(columnDefinition="varchar2(50)")
    private String delitotalbillNum;
    
    /**
     * 提货单总价值
     */
    @ModelComment(value="提货单总价值")
    @Column(columnDefinition="number(10)")
    private Integer delitotalvalue;
    
    /**
     * 企业费项总数量
     */
    @ModelComment(value="企业费项总数量")
    @Column(columnDefinition="varchar2(50)")
    private String totalvalue;
    
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

	public Integer getTradeTotal() {
		return tradeTotal;
	}

	public void setTradeTotal(Integer tradeTotal) {
		this.tradeTotal = tradeTotal;
	}

	public String getCloseTimes() {
		return closeTimes;
	}

	public void setCloseTimes(String closeTimes) {
		this.closeTimes = closeTimes;
	}

	public String getDelitotalbillNum() {
		return delitotalbillNum;
	}

	public void setDelitotalbillNum(String delitotalbillNum) {
		this.delitotalbillNum = delitotalbillNum;
	}

	public Integer getDelitotalvalue() {
		return delitotalvalue;
	}

	public void setDelitotalvalue(Integer delitotalvalue) {
		this.delitotalvalue = delitotalvalue;
	}

	public String getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
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
