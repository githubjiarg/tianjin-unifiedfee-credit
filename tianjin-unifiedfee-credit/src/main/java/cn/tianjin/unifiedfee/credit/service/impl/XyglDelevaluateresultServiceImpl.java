package cn.tianjin.unifiedfee.credit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XyglDelevaluateresult;
import cn.tianjin.unifiedfee.credit.repository.XyglDelevaluateresultRepository;
import cn.tianjin.unifiedfee.credit.service.XyglDelevaluateresultService;

@Service
public class XyglDelevaluateresultServiceImpl extends BaseServiceImpl<XyglDelevaluateresult, String> implements XyglDelevaluateresultService {
	@Autowired
	public XyglDelevaluateresultRepository xyglDelevaluateresultRepository;

}
