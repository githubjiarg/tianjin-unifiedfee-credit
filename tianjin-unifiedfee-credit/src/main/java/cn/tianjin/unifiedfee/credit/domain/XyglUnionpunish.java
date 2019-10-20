package cn.tianjin.unifiedfee.credit.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  联合惩戒库
 * @author 
 * 
 */
@Table
@Entity
public class XyglUnionpunish extends BaseDomain{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1415635059035267715L;

	/**
     * 
     */
	 /** 编号*/
    @ModelComment(value="编号")
    @Column(length = 32)
    @NotEmpty
    private String evalID;
    
    /** 评价时间*/
    @ModelComment(value="评价时间")
  
    private Date evaluateTime;
    /** 评价时间*/
    
   
    
    /** 社会统一信用代码*/
    @ModelComment(value="社会统一信用代码")
    @Column(length = 50)
 
    private String firmCreditCode;
    
    /** 企业名称*/
    @ModelComment(value="企业名称")
    @Column(length = 100)
   
    private String firmName;
    
    /** 企业描述*/
    @ModelComment(value="企业描述")
    @Column(length = 200)
  
    private String firmDescription;

    /** 最终得分*/
    @ModelComment(value="最终得分")
    @Column(length = 100)
  
    private Integer evalScore;
    
    /** 信用等级*/
    @ModelComment(value="信用等级")
    @Column(length= 100)
    
    private String creditLevel;
    
    /** 评价描述*/
    @ModelComment(value="评价描述")
    @Column(length= 200)
  
    private String description;

	public String getEvalID() {
		return evalID;
	}

	public void setEvalID(String evalID) {
		this.evalID = evalID;
	}

	public Date getEvaluateTime() {
		return evaluateTime;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public String getFirmCreditCode() {
		return firmCreditCode;
	}

	public void setFirmCreditCode(String firmCreditCode) {
		this.firmCreditCode = firmCreditCode;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getFirmDescription() {
		return firmDescription;
	}

	public void setFirmDescription(String firmDescription) {
		this.firmDescription = firmDescription;
	}

	public Integer getEvalScore() {
		return evalScore;
	}

	public void setEvalScore(Integer evalScore) {
		this.evalScore = evalScore;
	}

	public String getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
