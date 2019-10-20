package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.XyglEvaluateresult;

/**
 * 功能Service层接口
 *
 */
public interface XyglUnitepunishService extends BaseService<XyglEvaluateresult, String> {
    
	/**
	* 结果详情查看
	* */
	public List<Object[]> getLeftJoin(String id);
	
	/**
	 *  结果详情查看二级列表
	 * */
	public List<Object[]> getevalHistory(String historyId);
}
