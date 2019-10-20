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
import org.springframework.web.bind.annotation.RestController;

import cn.taiji.format.PageInfo;
import cn.taiji.format.result.ResponseResult;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicators;
import cn.tianjin.unifiedfee.credit.service.XyglIndicatorsService;
import cn.taiji.web.base.controller.BaseApiController;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xygl-indicators")
public class XyglIndicatorsApiController extends BaseApiController {

	@Autowired
	public XyglIndicatorsService xyglIndicatorsService;

	//根据id查询
	@PostMapping(value="/findPindicByID")
	public List<XyglIndicators> findPindicByID(@RequestBody String idString){
			
		return xyglIndicatorsService.findPindicByID(idString);
	}
		
	@PostMapping(value="/findByName")
	public List<XyglIndicators> findByName(@RequestBody String id){
		
//		Xygl_Indicators aIndicators = new Xygl_Indicators();
//		aIndicators.setId(id);
//		List<Object[]> aString = xygl_IndicatorsService.findByName(aIndicators);
//		System.out.println(aString);
		return xyglIndicatorsService.findByName(id);
	}
	
	/**
	 * 获取id和指标名称
	 */
	
	@PostMapping("/findByIdName")
	public ResponseResult findByIdName(){
		return renderSuccess(xyglIndicatorsService.findByIdName());
	}
	
	/**
	 * 获取列表
	 * 
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XyglIndicators> pageInfo) {
		return renderSuccess(xyglIndicatorsService.findPage(pageInfo));
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
		XyglIndicators domain = xyglIndicatorsService.get(id);
		return domain != null ? renderSuccess(domain) : renderError("数据不存在");
	}

	/**
	 * 添加一条数据
	 * 
	 * @param XyglIndicators
	 *            实体类
	 * @return 添加结果
	 */
	@PostMapping
	public ResponseResult add(@Valid @RequestBody XyglIndicators domain) {
		domain = xyglIndicatorsService.save(domain);
		return domain != null ? renderSuccess() : renderError("添加失败");
	}

	/**
	 * 更新全部数据
	 * 
	 * @param XyglIndicators
	 * @return 更新结果
	 */
	@PutMapping
	public ResponseResult updateAll(@Valid @RequestBody XyglIndicators domain) {
		domain = xyglIndicatorsService.update(domain);
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
		xyglIndicatorsService.delete(id);
		return renderSuccess();
	}
//  /**
//  * 更新部分字段，新建dot类
//  */
//	@PatchMapping
//	public ResponseResult updatePart(@Valid @RequestBody xxxDto dot) {
//		XyglIndicators domain = xyglIndicatorsService.get(id);
//		domain.setxxx();
//		//TODO 设置更新值
//		domain = xyglIndicatorsService.update(domain);
//		return domain != null ? renderSuccess() : renderError("更新失败");
//	}
	
}
