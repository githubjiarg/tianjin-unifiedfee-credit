package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.XyglDict;

/**
 * 功能Service层接口
 *
 */
public interface XyglDictService extends BaseService<XyglDict, String> {

    public List<XyglDict> findByType(XyglDict xyglDict);
    
}
