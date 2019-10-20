package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  信用管理字典
 * @author Administrator
 *
 */
@Table
@Entity
public class XyglDict extends BaseDomain{

    /**
     *  引用评价字典
     */
    private static final long serialVersionUID = 5825578226232229972L;

    /** 业务类别 */
    @ModelComment(value="业务类别")
    @Column(columnDefinition="varchar2(50)")
    @NotEmpty
    private  String category;
    
    /** 起始分值 */
    @ModelComment(value="起始分值")
    @Column(columnDefinition="number(5)")
    private Integer startnum;
    
    /** 结束分值 */
    @ModelComment(value="结束分值")
    @Column(columnDefinition="number(5)")
    private Integer endnum;
    
    /** 查询结果 */
    @ModelComment(value="查询结果")
    @Column(columnDefinition="varchar2(200)")
    @NotEmpty
    private String queryResoult;
    
    /** 是否删除 */
    @ModelComment(value="是否删除")
    @Column(columnDefinition="char(1) ")
    private String isDlete;

    
    
    
    public Integer getStartnum() {
        return startnum;
    }

    public void setStartnum(Integer startnum) {
        this.startnum = startnum;
    }

    public Integer getEndnum() {
        return endnum;
    }

    public void setEndnum(Integer endnum) {
        this.endnum = endnum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getQueryResoult() {
        return queryResoult;
    }

    public void setQueryResoult(String queryResoult) {
        this.queryResoult = queryResoult;
    }

    public String getIsDlete() {
        return isDlete;
    }

    public void setIsDlete(String isDlete) {
        this.isDlete = isDlete;
    }
    
    
    
    
}
