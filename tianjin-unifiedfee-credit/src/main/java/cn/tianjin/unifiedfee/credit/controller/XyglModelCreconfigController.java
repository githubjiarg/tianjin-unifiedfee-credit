package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.tianjin.unifiedfee.credit.service.XyglModelService;
import cn.taiji.web.base.controller.BaseController;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-modelb")
public class XyglModelCreconfigController extends BaseController {

	@Autowired
	public XyglModelService xyglModelService;
	

	@GetMapping("/detail")
	public ModelAndView detail() {
		return new ModelAndView("credit/xygl-modelb/detail");
	}
	@GetMapping("/conf")
	public ModelAndView Conf(){
		return new ModelAndView("credit/xygl-modelb/conf");
	}


	
	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-modelb/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-modelb/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-modelb/update");
		modelAndView.addObject("model", xyglModelService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-modelb/view");
		modelAndView.addObject("model", xyglModelService.get(id));
		return modelAndView;
	}

}
