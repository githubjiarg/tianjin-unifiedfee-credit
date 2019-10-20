package cn.tianjin.unifiedfee.credit.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.taiji.format.PageInfo;
import cn.taiji.format.result.ResponseResult;
import cn.taiji.web.base.controller.BaseApiController;
import cn.tianjin.unifiedfee.credit.domain.XyglEvaluateresult;
import cn.tianjin.unifiedfee.credit.service.XyglEvaluateresultService;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xygl-evaluateresult")
public class XyglEvaluateresultApiController extends BaseApiController {

	@Autowired
	public XyglEvaluateresultService xyglEvaluateresultService;

	/**
	 * 等级分类 信用企业总数
	 * @return {code: 200, msg: null, success: true, data: Array()}
	 *  Array : [[leves,num],[leves,num]] 
	 *  leves : 等级名称
	 *  num : 统计当前等级的企业数量
	 */
	@PostMapping("/listLevels")
	public ResponseResult findByLevels() {
		
		
		return renderSuccess(xyglEvaluateresultService.findByLevels());
	}
	
	/**
	 * 等级分类 风险企业总数
	 * @return {code: 200, msg: null, success: true, data: Array()}
	 *  Array : [[leves,num],[leves,num]] 
	 *  leves : 等级名称
	 *  num : 统计当前等级的企业数量
	 */
	@PostMapping("/listLevelsRiskearly")
	public ResponseResult findByLevelsRiskearly() {
		
		
		return renderSuccess(xyglEvaluateresultService.findByLevelsRiskearly());
	}
	
	/**
	 * 获取列表
	 * 
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XyglEvaluateresult> pageInfo) {
		return renderSuccess(xyglEvaluateresultService.findPage(pageInfo));
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
		XyglEvaluateresult domain = xyglEvaluateresultService.get(id);
		return domain != null ? renderSuccess(domain) : renderError("数据不存在");
	}

	/**
	 * 添加一条数据
	 * 
	 * @param XyglEvaluateresult
	 *            实体类
	 * @return 添加结果
	 */
	@PostMapping
	public ResponseResult add(@Valid @RequestBody XyglEvaluateresult domain) {
		domain = xyglEvaluateresultService.save(domain);
		return domain != null ? renderSuccess() : renderError("添加失败");
	}

	/**
	 * 更新全部数据
	 * 
	 * @param XyglEvaluateresult
	 * @return 更新结果
	 */
	@PutMapping
	public ResponseResult updateAll(@Valid @RequestBody XyglEvaluateresult domain) {
		domain = xyglEvaluateresultService.update(domain);
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
		xyglEvaluateresultService.delete(id);
		return renderSuccess();
	}
	
	/**
	 *  关联查询获取历史明细二级列表
	 * @param pageInfo
	 *            
	 * @return 结果集
	 */
	@PostMapping("/findHistorydetail")
	public ResponseResult getevalHistory(@RequestBody String historyId) {
	    
		return renderSuccess(xyglEvaluateresultService.getevalHistory(historyId));
	}
//  /**
//  * 更新部分字段，新建dot类
//  */
//	@PatchMapping
//	public ResponseResult updatePart(@Valid @RequestBody xxxDto dot) {
//		XyglEvaluateresult domain = xyglEvaluateresultService.get(id);
//		domain.setxxx();
//		//TODO 设置更新值
//		domain = xyglEvaluateresultService.update(domain);
//		return domain != null ? renderSuccess() : renderError("更新失败");
//	}
	
}
