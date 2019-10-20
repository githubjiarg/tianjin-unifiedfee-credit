package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 *  信用报告模板管理
 * @author chenghui
 * 
 */
@Table
@Entity
public class XyglReporttemplate extends BaseDomain {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3267467670414397349L;

	/**
     * 
     */
	 /** 编号*/
    @ModelComment(value="编号")
    @Column(length = 32)
    @NotEmpty
    private String templetID;
    
    /** 模型ID*/
    @ModelComment(value="模型ID")
    @Column(length = 32)
 
    private String modelId;
    
    /** 模板文件名称*/
    @ModelComment(value="模板文件名称")
    @Column(length = 100)

    private String templetName;
    
    /** 模板文件位置*/
    @ModelComment(value="模板文件位置")
    @Column(length = 100)
  
    private String templetAddress;
    
    /** 模板描述*/
    @ModelComment(value="模板描述")
    @Column(length = 200)

    private String description;

	public String getTempletID() {
		return templetID;
	}

	public void setTempletID(String templetID) {
		this.templetID = templetID;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getTempletName() {
		return templetName;
	}

	public void setTempletName(String templetName) {
		this.templetName = templetName;
	}

	public String getTempletAddress() {
		return templetAddress;
	}

	public void setTempletAddress(String templetAddress) {
		this.templetAddress = templetAddress;
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
