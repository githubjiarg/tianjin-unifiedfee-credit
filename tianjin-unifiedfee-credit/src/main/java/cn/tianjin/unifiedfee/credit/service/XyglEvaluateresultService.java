package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.XyglEvaluateresult;

/**
 * 功能Service层接口
 *
 */
public interface XyglEvaluateresultService extends BaseService<XyglEvaluateresult, String> {
    /**
	* 结果详情查看弹窗
	* */
	public List<Object[]> getLeftJoin(String id);

	/**
	*等级分类 信用企业总数
	* */	
	public List<Object[]> findByLevels();
	
	/**
	*等级分类风险企业总数
	* */	
	public List<Object[]> findByLevelsRiskearly();
	
	/**
	 *  结果详情查看二级列表
	 * */
	public List<Object[]> getevalHistory(String historyId);
	
}
