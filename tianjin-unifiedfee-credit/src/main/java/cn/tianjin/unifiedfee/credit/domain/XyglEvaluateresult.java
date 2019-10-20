package cn.tianjin.unifiedfee.credit.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  风险评价、风险预警
 * @author 王东
 */
@Table
@Entity	
public class XyglEvaluateresult  extends BaseDomain{


    /**
     * 
     */
    private static final long serialVersionUID = -5822340612345081689L;

    /** 评价时间*/
    @ModelComment(value="评价时间")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evaluateTime;
    
    /** 社会统一信用代码*/
    @ModelComment(value="社会信用代码")
    @Column(columnDefinition="varchar2(50)")
    @NotEmpty(message="社会信用代码不能为空")
    private String firmCreditcode;
    
    /** 企业名称*/
    @ModelComment(value="企业名称")
    @Column(columnDefinition="varchar2(100)")
    @NotEmpty(message="企业名称不能为空")
    private String firmName;
    
    /** 等级*/
    @ModelComment(value="等级")
    @Column(columnDefinition="varchar2(200)")
    @NotEmpty(message="等级不能为空")
    private String levels;
    
    /** 最终得分*/
    @ModelComment(value="最终得分")
    @Column(columnDefinition="number(5)")
    private Integer evaScore;
    
    /** 信用标识*/
    @ModelComment(value="信用标识")
    @Column(columnDefinition="varchar2(8)")
    @NotEmpty(message="信用标识不能为空")
    private String creditShow;
    
    /** 评价描述*/
    @ModelComment(value="评价描述")
    @Column(columnDefinition="varchar2(200)")
    @NotEmpty(message="评价描述不能为空")
    private String evaDesc;
    
    
    public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public Date getEvaluateTime() {
		return evaluateTime;
	}

	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public String getFirmCreditcode() {
		return firmCreditcode;
	}

	public void setFirmCreditcode(String firmCreditcode) {
		this.firmCreditcode = firmCreditcode;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}


	public Integer getEvaScore() {
		return evaScore;
	}

	public void setEvaScore(Integer evaScore) {
		this.evaScore = evaScore;
	}

	public String getCreditShow() {
		return creditShow;
	}

	public void setCreditShow(String creditShow) {
		this.creditShow = creditShow;
	}

	public String getEvaDesc() {
		return evaDesc;
	}

	public void setEvaDesc(String evaDesc) {
		this.evaDesc = evaDesc;
	}
}
