package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.tianjin.unifiedfee.credit.service.XyglDelevaluateresultService;
import cn.tianjin.unifiedfee.credit.service.XyglEvaluateresultService;
import cn.taijin.web.base.controller.BaseController;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-evaluateresult")
public class XyglEvaluateresultController extends BaseController {

	@Autowired
	public XyglEvaluateresultService xyglEvaluateresultService;
	@Autowired
	public XyglDelevaluateresultService xyglDelevaluateresultService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-evaluateresult/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-evaluateresult/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-evaluateresult/update");
		modelAndView.addObject("model", xyglEvaluateresultService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-evaluateresult/view");
		modelAndView.addObject("model", xyglEvaluateresultService.get(id));
		return modelAndView;
	}
	
	@GetMapping("/view2/{id}")
	public ModelAndView view2(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-evaluateresult/view2");
		modelAndView.addObject("model", xyglEvaluateresultService.getLeftJoin(id));
		return modelAndView;
	}

}
