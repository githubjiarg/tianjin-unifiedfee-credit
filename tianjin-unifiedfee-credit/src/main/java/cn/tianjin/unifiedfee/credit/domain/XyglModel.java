package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;
@Table
@Entity
public class XyglModel extends BaseDomain{

	/**
	 * 模型
	 */
	private static final long serialVersionUID = 2017376020802301421L;

	

	@ModelComment(value="类型（信用、风险）")//信用风险各自只存在一条数据被启用
	@Column(length = 50)
	private String modelType;
	
	@ModelComment(value="模型名称")
	@Column(length = 100)
	private String modelName;
	
	@ModelComment(value="模型编码")
	@Column(length = 8)
	private String modelCode;
	
	@ModelComment(value="模型来源")
	@Column(length = 100)
	private String modelSource;
	
	@ModelComment(value="模型描述")
	@Column(length = 200)
	private String modelDesc;
	
	@ModelComment(value="模型版本")
	@Column(length = 8)
	private String modelVersion;
	
	@ModelComment(value="模型状态")//1启用，0停用
	@Column(length = 8,nullable=true)
	private String modelStatus;
	
	@ModelComment(value="行业类型")//（不展示列表，临时不用）示例：1家电，2食品...，3服务...
	@Column(length = 8)
	private String firmType;

	public XyglModel() {
		super();
	}

	public XyglModel(String modelType, String modelName, String modelCode, String modelSource, String modelDesc,
			String modelVersion, String modelStatus, String firmType) {
		super();
		this.modelType = modelType;
		this.modelName = modelName;
		this.modelCode = modelCode;
		this.modelSource = modelSource;
		this.modelDesc = modelDesc;
		this.modelVersion = modelVersion;
		this.modelStatus = modelStatus;
		this.firmType = firmType;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelSource() {
		return modelSource;
	}

	public void setModelSource(String modelSource) {
		this.modelSource = modelSource;
	}

	public String getModelDesc() {
		return modelDesc;
	}

	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

	public String getModelVersion() {
		return modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	public String getModelStatus() {
		return modelStatus;
	}

	public void setModelStatus(String modelStatus) {
		this.modelStatus = modelStatus;
	}

	public String getFirmType() {
		return firmType;
	}

	public void setFirmType(String firmType) {
		this.firmType = firmType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "xyglModel [modelType=" + modelType + ", modelName=" + modelName + ", modelCode=" + modelCode
				+ ", modelSource=" + modelSource + ", modelDesc=" + modelDesc + ", modelVersion=" + modelVersion
				+ ", modelStatus=" + modelStatus + ", firmType=" + firmType + "]";
	}
	
	
}
