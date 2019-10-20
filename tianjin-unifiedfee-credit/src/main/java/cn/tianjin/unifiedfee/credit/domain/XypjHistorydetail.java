package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

@Table
@Entity	
public class XypjHistorydetail extends BaseDomain{
    
    /**
     * 
     */
    private static final long serialVersionUID = 2179439325712104835L;
    
    
    /** 评价历史id*/
    @ModelComment(value="评价历史id")
    @Column(length = 32)
    private String evalHistoryId;
    
    /** 指标id*/
    @ModelComment(value="指标id")
    @Column(length = 32)
    private String IndicateID;
    
    /** 指标得分*/
    @ModelComment(value="指标得分")
    @Column(length = 50)
    private String IndicateScore;
    
    /** 指标X值*/
    @ModelComment(value="指标X值")
    @Column(length = 50)
    private String ValueX;
    
    

    public String getEvalHistoryId() {
        return evalHistoryId;
    }

    public void setEvalHistoryId(String evalHistoryId) {
        this.evalHistoryId = evalHistoryId;
    }

    public String getIndicateID() {
        return IndicateID;
    }

    public void setIndicateID(String indicateID) {
        IndicateID = indicateID;
    }

    public String getIndicateScore() {
        return IndicateScore;
    }

    public void setIndicateScore(String indicateScore) {
        IndicateScore = indicateScore;
    }

    public String getValueX() {
        return ValueX;
    }

    public void setValueX(String valueX) {
        ValueX = valueX;
    }
    
    
    

}
