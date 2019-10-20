package cn.tianjin.unifiedfee.credit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XypjEvalhistory;
import cn.tianjin.unifiedfee.credit.repository.XypjEvalhistoryRepository;
import cn.tianjin.unifiedfee.credit.service.XypjEvalhistoryService;

@Service
public class XypjEvalhistoryServiceImpl extends BaseServiceImpl<XypjEvalhistory, String> implements XypjEvalhistoryService {
	
    	@Autowired
	public XypjEvalhistoryRepository xypjEvalhistoryRepository;

    	/** 查询评价历史明细 */
	@Override
	public List<Object[]> getevalHistory(String historyId) {
	    
	    return xypjEvalhistoryRepository.getevalHistory(historyId);
	}

	/** 查询评价明细详情 */
	@Override
	public List<Object[]> findDetail(String id) {
	    
	    return xypjEvalhistoryRepository.findDetail(id);
	}


}
