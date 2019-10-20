package cn.tianjin.unifiedfee.credit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.taiji.db.jpa.base.service.BaseServiceImpl;
import cn.tianjin.unifiedfee.credit.domain.XyglFirmportrait;
import cn.tianjin.unifiedfee.credit.repository.XyglFirmportraitRepository;
import cn.tianjin.unifiedfee.credit.service.XyglFirmportraitService;

@Service
public class XyglFirmportraitServiceImpl extends BaseServiceImpl<XyglFirmportrait, String> implements XyglFirmportraitService {
	@Autowired
	public XyglFirmportraitRepository xyglFirmportraitRepository;

}
