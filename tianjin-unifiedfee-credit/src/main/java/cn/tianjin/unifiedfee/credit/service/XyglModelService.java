package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.TreeTools;
import cn.tianjin.unifiedfee.credit.domain.XyglModel;

/**
 * 功能Service层接口
 *
 */
public interface XyglModelService extends BaseService<XyglModel, String> {
	
	public List<TreeTools> getTree();
	
	public List<TreeTools> getTreeM(String model_id);
	
	public List<XyglModel> findXyglModel();
	
	public List<XyglModel> findXyglModelRisk();
	
	public List<XyglModel> findXyglModelAll(String modelName);
	
	public List<XyglModel> findXyglModelRiskAll(String modelNameRisk);
}
