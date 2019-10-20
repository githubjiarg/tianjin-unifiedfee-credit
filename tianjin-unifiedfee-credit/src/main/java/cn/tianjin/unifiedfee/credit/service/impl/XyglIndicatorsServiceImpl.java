package cn.tianjin.unifiedfee.credit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicators;
import cn.tianjin.unifiedfee.credit.repository.XyglIndicatorsRepository;
import cn.tianjin.unifiedfee.credit.service.XyglIndicatorsService;

@Service
public class XyglIndicatorsServiceImpl extends BaseServiceImpl<XyglIndicators, String> implements XyglIndicatorsService {
	@Autowired
	public XyglIndicatorsRepository xyglIndicatorsRepository;

	@Override
	public List<XyglIndicators> findByIdName() {
		return xyglIndicatorsRepository.findByIdName();
	}

	@Override
	public List<XyglIndicators> findByName(String idss) {
		return xyglIndicatorsRepository.findByName(idss);
	}

	@Override
	public List<XyglIndicators> findPindicByID(String idString) {
		return xyglIndicatorsRepository.findPindicByID(idString);
	}

}
