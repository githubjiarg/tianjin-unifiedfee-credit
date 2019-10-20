package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;
@Table
@Entity
public class XyglIndicators extends BaseDomain{

	/**
	 * 指标表
	 */
	private static final long serialVersionUID = 538066825058354448L;

	 @ModelComment(value="编码")
	 @Column(length = 32,nullable=true,unique=false)
	 private String indicCode;
	 
	 @ModelComment(value="指标名称")
	 @Column(length = 50)
	 private String indicName;
	 
	 @ModelComment(value="指标级别")
	 @Column(length = 4)
	 private String indicGrade;
	 
	 @ModelComment(value="父级指标id")
	 @Column(length = 32)
	 private String parentId;
	 
	 @ModelComment(value="数据来源")
	 @Column(length = 100)
	 private String dataSource;
	 
	 @ModelComment(value="计算x脚本")
	 @Column(length = 2000)
	 private String indicScript;
	 
	 @ModelComment(value="计算标识")//0大指标1小指标（）区分计算算法
	 @Column(length = 8)
	 private String countLogo;
	 
	 @ModelComment(value="指标描述")
	 @Column(length = 200)
	 private String indicDesc;

	public XyglIndicators() {
		super();
	}

	public XyglIndicators(String indicCode, String indicName, String indicGrade, String parentId, String dataSource,
			String indicScript, String countLogo, String indicDesc) {
		super();
		this.indicCode = indicCode;
		this.indicName = indicName;
		this.indicGrade = indicGrade;
		this.parentId = parentId;
		this.dataSource = dataSource;
		this.indicScript = indicScript;
		this.countLogo = countLogo;
		this.indicDesc = indicDesc;
	}

	public String getIndicCode() {
		return indicCode;
	}

	public void setIndicCode(String indicCode) {
		this.indicCode = indicCode;
	}

	public String getIndicName() {
		return indicName;
	}

	public void setIndicName(String indicName) {
		this.indicName = indicName;
	}

	public String getIndicGrade() {
		return indicGrade;
	}

	public void setIndicGrade(String indicGrade) {
		this.indicGrade = indicGrade;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getIndicScript() {
		return indicScript;
	}

	public void setIndicScript(String indicScript) {
		this.indicScript = indicScript;
	}

	public String getCountLogo() {
		return countLogo;
	}

	public void setCountLogo(String countLogo) {
		this.countLogo = countLogo;
	}

	public String getIndicDesc() {
		return indicDesc;
	}

	public void setIndicDesc(String indicDesc) {
		this.indicDesc = indicDesc;
	}

	@Override
	public String toString() {
		return "xyglIndicators [indicCode=" + indicCode + ", indicName=" + indicName + ", indicGrade=" + indicGrade
				+ ", parentId=" + parentId + ", dataSource=" + dataSource + ", indicScript=" + indicScript
				+ ", countLogo=" + countLogo + ", indicDesc=" + indicDesc + "]";
	}
	 
	 
}
