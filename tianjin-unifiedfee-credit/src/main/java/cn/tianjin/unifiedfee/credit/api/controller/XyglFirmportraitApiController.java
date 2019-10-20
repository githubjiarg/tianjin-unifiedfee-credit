package cn.tianjin.unifiedfee.credit.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.taiji.format.PageInfo;
import cn.taiji.format.result.ResponseResult;
import cn.taiji.web.base.controller.BaseApiController;
import cn.tianjin.unifiedfee.credit.domain.XyglFirmportrait;
import cn.tianjin.unifiedfee.credit.service.XyglFirmportraitService;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xygl-firmportrait")
public class XyglFirmportraitApiController extends BaseApiController {

	@Autowired
	public XyglFirmportraitService xyglFirmportraitService;

	/**
	 * 获取列表
	 * 
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XyglFirmportrait> pageInfo) {
		return renderSuccess(xyglFirmportraitService.findPage(pageInfo));
	}

	
}
