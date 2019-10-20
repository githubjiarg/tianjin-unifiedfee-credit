package cn.tianjin.unifiedfee.credit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.taiji.annotations.ModelComment;
import cn.taiji.db.jpa.base.domain.BaseDomain;

/**
 * 指标值公式
 * @author Administrator
 * Xygl_Indicatorsystem
 */
@Table
@Entity
public class XyglIndicformula extends BaseDomain{
	

	private static final long serialVersionUID = 8387211652291156001L;

	@ModelComment("所属指标明细ID")
	@Column(name="indicDetailid",length = 32)
	private String indicDetailid;
	
	@ModelComment("参数A")
	@Column(name="parameterA",length = 50)
	private String parameterA;
	
	@ModelComment("参数B")
	@Column(name="parameterB",length = 50)
	private String parameterB;
	
	@ModelComment("X取值最大")
	@Column(name="maxXvalue",length = 50)
	private String maxXvalue;
	
	@ModelComment("X取值最小")
	@Column(name="minXvalue",length = 50)
	private String minXvalue;
		
	@ModelComment("X等于值")
	@Column(name="equalValuex",length = 50)
	private String equalValuex;
			
	@ModelComment("计算公式文本描述")
	@Column(name="formulaDesc",length = 200)
	private String formulaDesc;

	@Override
	public String toString() {
		return "XyglIndicformula [indicDetailid=" + indicDetailid + ", parameterA=" + parameterA + ", parameterB="
				+ parameterB + ", maxXvalue=" + maxXvalue + ", minXvalue=" + minXvalue + ", equalValuex=" + equalValuex
				+ ", formulaDesc=" + formulaDesc + "]";
	}

	public XyglIndicformula(String indicDetailid, String parameterA, String parameterB, String maxXvalue,
			String minXvalue, String equalValuex, String formulaDesc) {
		super();
		this.indicDetailid = indicDetailid;
		this.parameterA = parameterA;
		this.parameterB = parameterB;
		this.maxXvalue = maxXvalue;
		this.minXvalue = minXvalue;
		this.equalValuex = equalValuex;
		this.formulaDesc = formulaDesc;
	}

	public XyglIndicformula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIndicDetailid() {
		return indicDetailid;
	}

	public void setIndicDetailid(String indicDetailid) {
		this.indicDetailid = indicDetailid;
	}

	public String getParameterA() {
		return parameterA;
	}

	public void setParameterA(String parameterA) {
		this.parameterA = parameterA;
	}

	public String getParameterB() {
		return parameterB;
	}

	public void setParameterB(String parameterB) {
		this.parameterB = parameterB;
	}

	public String getMaxXvalue() {
		return maxXvalue;
	}

	public void setMaxXvalue(String maxXvalue) {
		this.maxXvalue = maxXvalue;
	}

	public String getMinXvalue() {
		return minXvalue;
	}

	public void setMinXvalue(String minXvalue) {
		this.minXvalue = minXvalue;
	}

	public String getEqualValuex() {
		return equalValuex;
	}

	public void setEqualValuex(String equalValuex) {
		this.equalValuex = equalValuex;
	}

	public String getFormulaDesc() {
		return formulaDesc;
	}

	public void setFormulaDesc(String formulaDesc) {
		this.formulaDesc = formulaDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
