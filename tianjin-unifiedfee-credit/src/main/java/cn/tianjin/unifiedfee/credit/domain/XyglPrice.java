package cn.tianjin.unifiedfee.credit.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  价格业务 
 * @author chenghui
 */
@Table
@Entity	
public class XyglPrice extends BaseDomain {



	/**
	 * 
	 */
	private static final long serialVersionUID = 208898030422429433L;

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
     * 费项名称
     */
    @ModelComment(value="费项名称")
  
    @Column(columnDefinition="varchar2(50)")
    private String costCategoryname;
    
    /**
     * 费项对应的货物
     */
    @ModelComment(value="费项对应的货物")
    @Column(columnDefinition="varchar2(50)")
    private String goodsCategory;
    
    /**
     * 费项对应货物报价
     */
    @ModelComment(value="费项对应货物报价")
    @Column(columnDefinition="number(10)")
    private Integer costCateprice;
	
    /**
     * 费项对应货物的指导价
     */
    @ModelComment(value="费项对应货物的指导价")
    @Column(columnDefinition="number(10)")
    private Integer guidePrice;
    
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

	public String getCostCategoryname() {
		return costCategoryname;
	}

	public void setCostCategoryname(String costCategoryname) {
		this.costCategoryname = costCategoryname;
	}

	public String getGoodsCategory() {
		return goodsCategory;
	}

	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public Integer getCostCateprice() {
		return costCateprice;
	}

	public void setCostCateprice(Integer costCateprice) {
		this.costCateprice = costCateprice;
	}

	public Integer getGuidePrice() {
		return guidePrice;
	}

	public void setGuidePrice(Integer guidePrice) {
		this.guidePrice = guidePrice;
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
