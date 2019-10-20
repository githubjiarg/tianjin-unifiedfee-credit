package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.taiji.web.base.controller.BaseController;
import cn.tianjin.unifiedfee.credit.service.XyglUnitepunishService;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-unitepunish")
public class XyglUnitepunishController extends BaseController {

	@Autowired
	public XyglUnitepunishService xyglUnitepunishService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-unitepunish/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-unitepunish/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-unitepunish/update");
		modelAndView.addObject("model", xyglUnitepunishService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-unitepunish/view");
		modelAndView.addObject("model", xyglUnitepunishService.get(id));
		return modelAndView;
	}
	
	@GetMapping("/view2/{id}")
	public ModelAndView view2(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-evaluateresult/view2");
		modelAndView.addObject("model", xyglUnitepunishService.getLeftJoin(id));
		return modelAndView;
	}

}
