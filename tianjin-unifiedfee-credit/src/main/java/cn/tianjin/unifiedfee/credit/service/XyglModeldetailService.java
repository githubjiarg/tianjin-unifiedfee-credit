package cn.tianjin.unifiedfee.credit.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.taiji.format.result.ResponseResult;
import cn.tianjin.unifiedfee.credit.domain.ParamTools;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicformula;
import cn.tianjin.unifiedfee.credit.domain.XyglModeldetail;

/**
 * 功能Service层接口
 *
 */
public interface XyglModeldetailService extends BaseService<XyglModeldetail, String> {
	
	public List<XyglModeldetail> addModel(ParamTools paramTools);
	public int delModel(String[] ids,String model_id);
	public List<XyglModeldetail> findInforById(String sid);
	public int  updatab(String inputValue);
	public List<XyglModeldetail> findIdByIndicId(String id);
	public List<Object[]> findInformationByid(String aid);
	public Integer updateData(String updateData);
	public List<XyglModeldetail> getMxData(String model_id);
	
	public Integer insertData(String insertData);
}
