package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.taiji.web.base.controller.BaseController;
import cn.tianjin.unifiedfee.credit.service.XyglRiskearlyService;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-riskearly")
public class XyglRiskearlyController extends BaseController {

	@Autowired
	public XyglRiskearlyService xyglRiskearlyService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-riskearly/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-riskearly/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-riskearly/update");
		modelAndView.addObject("model", xyglRiskearlyService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-riskearly/view");
		modelAndView.addObject("model", xyglRiskearlyService.get(id));
		return modelAndView;
	}
	
	@GetMapping("/view2/{id}")
	public ModelAndView view2(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-evaluateresult/view2");
		modelAndView.addObject("model", xyglRiskearlyService.getLeftJoin(id));
		return modelAndView;
	}

}
