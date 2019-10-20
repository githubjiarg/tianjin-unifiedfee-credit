package cn.tianjin.unifiedfee.credit.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.taiji.format.PageInfo;
import cn.taiji.format.result.ResponseResult;
import cn.tianjin.unifiedfee.credit.domain.TreeTools;
import cn.tianjin.unifiedfee.credit.domain.XyglModel;
import cn.tianjin.unifiedfee.credit.service.XyglModelService;
import cn.taiji.web.base.controller.BaseApiController;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xygl-model")
public class XyglModelApiController extends BaseApiController {

	@Autowired
	public XyglModelService xyglModelService;

	@PostMapping("/findXyglModelRiskAll")
	public List<XyglModel> findXyglModelRiskAll(@RequestBody String modelNameRisk) {
		return xyglModelService.findXyglModelRiskAll(modelNameRisk);
	}
	
	@PostMapping("/findXyglModelAll")
	public List<XyglModel> findXyglModelAll(@RequestBody String modelName) {
		return xyglModelService.findXyglModelAll(modelName);
	}
	
	@PostMapping("/findXyglModelRisk")
	public List<XyglModel> findXyglModelRisk() {
		return xyglModelService.findXyglModelRisk();
	}
	
	@PostMapping("/findXyglModel")
	public List<XyglModel> findXyglModel() {
		return xyglModelService.findXyglModel();
	}
	
	@RequestMapping("/getTree") 
	public List<TreeTools> getData(){
		
		return xyglModelService.getTree();
	}
	
	@RequestMapping("/getTreeM") 
	public List<TreeTools> getDataM(@RequestParam String model_id){
		
		return xyglModelService.getTreeM(model_id);
	}
	
	/**
	 * 获取列表
	 * 
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XyglModel> pageInfo) {
		return renderSuccess(xyglModelService.findPage(pageInfo));
	}

	/**
	 * 根据主键查询数据
	 * 
	 * @param pageInfo
	 *            数据主键
	 * @return 结果集
	 */
	@GetMapping("/{id}")
	public ResponseResult find(@PathVariable("id") String id) {
		XyglModel domain = xyglModelService.get(id);
		return domain != null ? renderSuccess(domain) : renderError("数据不存在");
	}

	/**
	 * 添加一条数据
	 * 
	 * @param XyglModel
	 *            实体类
	 * @return 添加结果
	 */
	@PostMapping
	public ResponseResult add(@Valid @RequestBody XyglModel domain) {
		domain = xyglModelService.save(domain);
		return domain != null ? renderSuccess() : renderError("添加失败");
	}

	/**
	 * 更新全部数据
	 * 
	 * @param XyglModel
	 * @return 更新结果
	 */
	@PutMapping
	public ResponseResult updateAll(@Valid @RequestBody XyglModel domain) {
		domain = xyglModelService.update(domain);
		return domain != null ? renderSuccess() : renderError("更新失败");
	}
	
	/**
	 * 删除一条数据
	 * 
	 * @param id
	 *            数据主键
	 * @return 删除结果
	 */
	@DeleteMapping("/{id}")
	public ResponseResult del(@PathVariable String id) {
		xyglModelService.delete(id);
		return renderSuccess();
	}
//  /**
//  * 更新部分字段，新建dot类
//  */
//	@PatchMapping
//	public ResponseResult updatePart(@Valid @RequestBody xxxDto dot) {
//		XyglModel domain = xyglModelService.get(id);
//		domain.setxxx();
//		//TODO 设置更新值
//		domain = xyglModelService.update(domain);
//		return domain != null ? renderSuccess() : renderError("更新失败");
//	}
	
}
