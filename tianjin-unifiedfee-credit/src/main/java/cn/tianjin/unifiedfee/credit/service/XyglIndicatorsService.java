package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicators;

/**
 * 功能Service层接口
 *
 */
public interface XyglIndicatorsService extends BaseService<XyglIndicators, String> {
	public List<XyglIndicators> findByIdName();

	public List<XyglIndicators> findByName( String idss);

	public List<XyglIndicators> findPindicByID(String idString);

}
