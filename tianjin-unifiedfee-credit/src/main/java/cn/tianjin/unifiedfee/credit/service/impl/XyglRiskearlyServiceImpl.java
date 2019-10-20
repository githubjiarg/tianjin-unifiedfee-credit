package cn.tianjin.unifiedfee.credit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XyglEvaluateresult;
import cn.tianjin.unifiedfee.credit.repository.XyglEvaluateresultRepository;
import cn.tianjin.unifiedfee.credit.service.XyglRiskearlyService;

@Service
public class XyglRiskearlyServiceImpl extends BaseServiceImpl<XyglEvaluateresult, String> implements XyglRiskearlyService {
    @Autowired
	public XyglEvaluateresultRepository xyglEvaluateresultRepository;

	/**
	 * 结果详情查看
	 * */
	@Override
	public List<Object[]> getLeftJoin(String id) {
		
		return xyglEvaluateresultRepository.getHistoryView(id);
	}
	/**
	 *  结果详情查看二级列表
	 * */
	@Override
	public List<Object[]> getevalHistory(String historyId) {
		
		return xyglEvaluateresultRepository.getevalHistory(historyId);
	}

}
