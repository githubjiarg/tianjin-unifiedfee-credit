package cn.tianjin.unifiedfee.credit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XyglDict;
import cn.tianjin.unifiedfee.credit.repository.XyglDictRepository;
import cn.tianjin.unifiedfee.credit.service.XyglDictService;

@Service
public class XyglDictServiceImpl extends BaseServiceImpl<XyglDict, String> implements XyglDictService {
	
    	@Autowired
	public XyglDictRepository xyglDictRepository;
    	
    	/**
    	 *  保存数据
    	 */
    	public XyglDict save(XyglDict entity) {
    	    
    	    entity.setIsDlete("0");
    	    return xyglDictRepository.save(entity);
    	}

    	/**
    	 *  根据类型查询数据
    	 */
	@Override
	public List<XyglDict> findByType(XyglDict xyglDict) {
	    
	    return xyglDictRepository.findByType(xyglDict.getCategory());
	}
    	
    	
    	

}
