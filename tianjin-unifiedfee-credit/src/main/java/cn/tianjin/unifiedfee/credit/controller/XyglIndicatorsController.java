package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.tianjin.unifiedfee.credit.service.XyglIndicatorsService;
import cn.taiji.web.base.controller.BaseController;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-indicators")
public class XyglIndicatorsController extends BaseController {

	@Autowired
	public XyglIndicatorsService xyglIndicatorsService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-indicators/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-indicators/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-indicators/update");
		modelAndView.addObject("model", xyglIndicatorsService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-indicators/view");
		modelAndView.addObject("model", xyglIndicatorsService.get(id));
		return modelAndView;
	}

}
