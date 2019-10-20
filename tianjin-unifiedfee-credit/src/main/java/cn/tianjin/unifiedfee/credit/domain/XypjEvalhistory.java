package cn.tianjin.unifiedfee.credit.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  企业评价历史 
 * @author jrg
 */
@Table
@Entity	
public class XypjEvalhistory  extends BaseDomain{

    /**
     * 
     */
    private static final long serialVersionUID = 8765883648656403719L;

    /** 评价时间*/
   
    @ModelComment(value="评价时间")
    private Date evaluateTime;
    
    /** 社会统一信用代码*/
    @ModelComment(value="社会统一信用代码")
    @Column(length = 50)
    @NotEmpty
    private String firmCreditCode;
    
    /** 企业名称*/
    @ModelComment(value="企业名称")
    @Column(length = 100)
    @NotEmpty
    private String firmName;
    
    /** 企业描述*/
    @ModelComment(value="企业描述")
    @Column(length = 200)
    @NotEmpty
    private String firmDesc;
    
    /** 最终得分*/
    @ModelComment(value="最终得分")
    @Column(length = 38)
    @NotEmpty
    private Integer evaScore;
    
    /** 信用标示*/
    @ModelComment(value="信用标示")
    @Column(length= 100)
    @NotEmpty
    private String creditShow;
    
    /** 评价描述*/
    @ModelComment(value="评价描述")
    @Column(length= 200)
    @NotEmpty
    private String evadesc;

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

    public String getFirmDesc() {
        return firmDesc;
    }

    public void setFirmDesc(String firmDesc) {
        this.firmDesc = firmDesc;
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

    public String getEvadesc() {
        return evadesc;
    }

    public void setEvadesc(String evadesc) {
        this.evadesc = evadesc;
    }
    
    
}
