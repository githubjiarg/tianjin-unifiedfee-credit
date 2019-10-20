package cn.tianjin.unifiedfee.credit.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 组装treeview的工具类
 * @author Administrator
 *
 */
public class ParamTools{
	
    public String model_id;
	public List<XyglModeldetail> mdList = new ArrayList<XyglModeldetail>();
	
	
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public List<XyglModeldetail> getMdList() {
		return mdList;
	}
	public void setMdList(List<XyglModeldetail> mdList) {
		this.mdList = mdList;
	}
	@Override
	public String toString() {
		return "ParamTools [model_id=" + model_id + ", mdList=" + mdList + "]";
	}
	public ParamTools(String model_id, List<XyglModeldetail> mdList) {
		super();
		this.model_id = model_id;
		this.mdList = mdList;
	}
	public ParamTools() {
		super();
	}
	
	
	
	
}
