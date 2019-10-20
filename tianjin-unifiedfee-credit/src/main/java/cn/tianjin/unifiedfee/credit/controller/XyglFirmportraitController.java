package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.taiji.web.base.controller.BaseController;
import cn.tianjin.unifiedfee.credit.service.XyglFirmportraitService;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-firmportrait")
public class XyglFirmportraitController extends BaseController {

	@Autowired
	public XyglFirmportraitService xyglFirmportraitService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-firmportrait/manage");
	}


}
