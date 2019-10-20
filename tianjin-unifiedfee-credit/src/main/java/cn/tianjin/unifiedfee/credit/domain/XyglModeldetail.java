package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 * 模型明细
 * @author Administrator
 * Xygl_Indicatorsystem
 */
@Table
@Entity
public class XyglModeldetail extends BaseDomain{
	

	private static final long serialVersionUID = 1L;

	@ModelComment("模型ID")
	@Column(name="modelId",length = 32)
	private String modelId;
	
	@ModelComment("指标名称")
	@Column(name="indicateName",length = 100)
	private String indicateName;
	
	@ModelComment("编码")
	@Column(name="indicateCode",length = 50)
	private String indicateCode;
	
	@ModelComment("指标级别")
	@Column(name="indicateGrade",length = 50)
	private String indicateGrade;
	
	@ModelComment("指标ID")
	@Column(name="indicateId",length = 32)
	private String indicateId;
	
	@ModelComment("父级指标ID")
	@Column(name="parentIndicId",length = 32)
	private String parentIndicId;
		
	@ModelComment("详细说明")
	@Column(name="delDescription",length = 100)
	private String delDescription;
			
	@ModelComment("指标权重")
	@Column(name="indicateWeight",length = 20)
	private Double indicateWeight;
	
	@ModelComment("计算标识")
	@Column(name="modelCalLogo",length = 50)
	private String modelCalLogo;
	
	@ModelComment("X取值方式（SQL脚本）")
	@Column(name="xValueStyle",length = 200)
	private String xValueStyle;

	@Override
	public String toString() {
		return "XyglModeldetail [modelId=" + modelId + ", indicateName=" + indicateName + ", indicateCode="
				+ indicateCode + ", indicateGrade=" + indicateGrade + ", indicateId=" + indicateId + ", parentIndicId="
				+ parentIndicId + ", delDescription=" + delDescription + ", indicateWeight=" + indicateWeight
				+ ", modelCalLogo=" + modelCalLogo + ", xValueStyle=" + xValueStyle + "]";
	}

	public XyglModeldetail(String modelId, String indicateName, String indicateCode, String indicateGrade,
			String indicateId, String parentIndicId, String delDescription, Double indicateWeight, String modelCalLogo,
			String xValueStyle) {
		super();
		this.modelId = modelId;
		this.indicateName = indicateName;
		this.indicateCode = indicateCode;
		this.indicateGrade = indicateGrade;
		this.indicateId = indicateId;
		this.parentIndicId = parentIndicId;
		this.delDescription = delDescription;
		this.indicateWeight = indicateWeight;
		this.modelCalLogo = modelCalLogo;
		this.xValueStyle = xValueStyle;
	}

	public XyglModeldetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getIndicateName() {
		return indicateName;
	}

	public void setIndicateName(String indicateName) {
		this.indicateName = indicateName;
	}

	public String getIndicateCode() {
		return indicateCode;
	}

	public void setIndicateCode(String indicateCode) {
		this.indicateCode = indicateCode;
	}

	public String getIndicateGrade() {
		return indicateGrade;
	}

	public void setIndicateGrade(String indicateGrade) {
		this.indicateGrade = indicateGrade;
	}

	public String getIndicateId() {
		return indicateId;
	}

	public void setIndicateId(String indicateId) {
		this.indicateId = indicateId;
	}

	public String getParentIndicId() {
		return parentIndicId;
	}

	public void setParentIndicId(String parentIndicId) {
		this.parentIndicId = parentIndicId;
	}

	public String getDelDescription() {
		return delDescription;
	}

	public void setDelDescription(String delDescription) {
		this.delDescription = delDescription;
	}

	public Double getIndicateWeight() {
		return indicateWeight;
	}

	public void setIndicateWeight(Double indicateWeight) {
		this.indicateWeight = indicateWeight;
	}

	public String getModelCalLogo() {
		return modelCalLogo;
	}

	public void setModelCalLogo(String modelCalLogo) {
		this.modelCalLogo = modelCalLogo;
	}

	public String getxValueStyle() {
		return xValueStyle;
	}

	public void setxValueStyle(String xValueStyle) {
		this.xValueStyle = xValueStyle;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
