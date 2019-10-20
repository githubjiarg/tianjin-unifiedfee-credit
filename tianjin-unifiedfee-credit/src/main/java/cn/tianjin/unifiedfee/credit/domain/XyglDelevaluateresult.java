package cn.tianjin.unifiedfee.credit.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  评价结果明细 
 * @author jrg
 */
@Table
@Entity	
public class XyglDelevaluateresult  extends BaseDomain{

    
   /**
     * 评价结果明细
     */
    private static final long serialVersionUID = -5995279078314919141L;

    /**
    * 评价结果id
    */
    @ModelComment(value="评价结果id")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String evaluateId;
    
    /**
     * 指标名称
     * */
    @ModelComment(value="指标名称")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String indicateName;
    
    /**
     * 指标明细id
     */
    @ModelComment(value="指标明细id")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String indicateDetailid;
    
    /**
     * 指标id
     */
    @ModelComment(value="指标id")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String indicateId;
    
    /**
     * 父级指标id
     */
    @ModelComment(value="父级指标id")
    @NotEmpty
    @Column(columnDefinition="varchar2(32)")
    private String parentIndicid;
    
    /**
     * 指标得分
     */
    @ModelComment(value="指标得分")
    @Column(columnDefinition="number(5)")
    private Integer indicateScore;
    
    /**
     * 指标X值
     */
    @ModelComment(value="指标X值")
    @Column(columnDefinition="varchar2(50)")
    private String xValue;

    public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getIndicateName() {
        return indicateName;
    }

    public void setIndicateName(String indicateName) {
        this.indicateName = indicateName;
    }

    public String getIndicateDetailid() {
        return indicateDetailid;
    }

    public void setIndicateDetailid(String indicateDetailid) {
        this.indicateDetailid = indicateDetailid;
    }

    public String getIndicateId() {
        return indicateId;
    }

    public void setIndicateId(String indicateId) {
        this.indicateId = indicateId;
    }

    public String getParentIndicid() {
        return parentIndicid;
    }

    public void setParentIndicid(String parentIndicid) {
        this.parentIndicid = parentIndicid;
    }

    public Integer getIndicateScore() {
        return indicateScore;
    }

    public void setIndicateScore(Integer indicateScore) {
        this.indicateScore = indicateScore;
    }

    public String getxValue() {
        return xValue;
    }

    public void setxValue(String xValue) {
        this.xValue = xValue;
    }
    
}
