package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  评价业务 
 * @author chenghui
 */
@Table
@Entity
public class XyglEvaluation extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5030852690382060266L;

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
     * 企业评分
     */
    @ModelComment(value="企业评分")
    @Column(columnDefinition="varchar2(50)")
    private String score;
    
    /**
     * 采集的时间
     */
    @ModelComment(value="采集的时间")
   
    private Date evaluatTime;

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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Date getEvaluatTime() {
		return evaluatTime;
	}

	public void setEvaluatTime(Date evaluatTime) {
		this.evaluatTime = evaluatTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
