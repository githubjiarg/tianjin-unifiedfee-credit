package cn.tianjin.unifiedfee.credit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.tianjin.unifiedfee.credit.service.XyglModeldetailService;
import cn.taiji.web.base.controller.BaseController;

/**
 * 页面访问层
 * 
 * @author guochao
 *
 */
@Controller
@RequestMapping("/credit/xygl-modeldetail")
public class XyglModeldetailController extends BaseController {

	@Autowired
	public XyglModeldetailService xyglModeldetailService;

	@GetMapping("/manage")
	public ModelAndView manage() {
		return new ModelAndView("credit/xygl-modeldetail/manage");
	}

	@GetMapping("/add")
	public ModelAndView add() {
		return new ModelAndView("credit/xygl-modeldetail/add");
	}

	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-modeldetail/update");
		modelAndView.addObject("model", xyglModeldetailService.get(id));
		return modelAndView;
	}

	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") String id) {
		ModelAndView modelAndView=new ModelAndView("credit/xygl-modeldetail/view");
		modelAndView.addObject("model", xyglModeldetailService.get(id));
		return modelAndView;
	}

}
