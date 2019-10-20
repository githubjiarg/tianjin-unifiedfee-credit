package cn.tianjin.unifiedfee.credit.api.controller;

import java.io.Console;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import cn.tianjin.unifiedfee.credit.domain.ParamTools;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicformula;
import cn.tianjin.unifiedfee.credit.domain.XyglModeldetail;
import cn.tianjin.unifiedfee.credit.service.XyglModeldetailService;
import cn.taiji.web.base.controller.BaseApiController;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xygl-modeldetail")
public class XyglModeldetailApiController extends BaseApiController {

	@Autowired
	public XyglModeldetailService xyglModeldetailService;
	
	@PostMapping("/insertData")
	public Integer insertData(@RequestBody String insertData){
		return xyglModeldetailService.insertData(insertData);
	}
	
//	@PostMapping("/findDataByModId")
//	public List<XyglModeldetail> findDataByModId(@RequestBody String updateData){
//		
//		return xyglModeldetailService.findDataByModId(updateData);
//	}
	
	@PostMapping("/updateData")
	public Integer updateData(@RequestBody String updateData){
		return xyglModeldetailService.updateData(updateData);
	}
	
	@PostMapping("/findInformationByid")
	public List<Object[]> findInformationByid(@RequestBody String aid){
		return xyglModeldetailService.findInformationByid(aid);
	}
	
	@PostMapping("/findIdByIndicId")
	public List<XyglModeldetail> findIdByIndicId(@RequestBody String id){
		return xyglModeldetailService.findIdByIndicId(id);
	}
	
	@PostMapping("/inserta")
	public int  updatab(@RequestBody String inputValue){
			return xyglModeldetailService.updatab(inputValue);
	}
	
	@PostMapping("/findInforById")
	public List<XyglModeldetail> findInforById(@RequestBody String sid){
		return xyglModeldetailService.findInforById(sid);
	}
	
	@PostMapping("/addModel")
	public ResponseResult addModel(@RequestBody ParamTools paramTools){
		
		return renderSuccess(xyglModeldetailService.addModel(paramTools));
	}
	
	@PostMapping("/delModel")
	public ResponseResult delModle(String[] ids,String model_id){
		return renderSuccess(xyglModeldetailService.delModel(ids,model_id));
	}


	/**
	 * 获取列表
	 * 
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XyglModeldetail> pageInfo) {
		return renderSuccess(xyglModeldetailService.findPage(pageInfo));
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
		XyglModeldetail domain = xyglModeldetailService.get(id);
		return domain != null ? renderSuccess(domain) : renderError("数据不存在");
	}

	/**
	 * 添加一条数据
	 * 
	 * @param XyglModeldetail
	 *            实体类
	 * @return 添加结果
	 */
	@PostMapping
	public ResponseResult add(@Valid @RequestBody XyglModeldetail domain) {
		domain = xyglModeldetailService.save(domain);
		return domain != null ? renderSuccess() : renderError("添加失败");
	}

	/**
	 * 更新全部数据
	 * 
	 * @param XyglModeldetail
	 * @return 更新结果
	 */
	@PutMapping
	public ResponseResult updateAll(@Valid @RequestBody XyglModeldetail domain) {
		domain = xyglModeldetailService.update(domain);
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
		xyglModeldetailService.delete(id);
		return renderSuccess();
	}
//  /**
//  * 更新部分字段，新建dot类
//  */
//	@PatchMapping
//	public ResponseResult updatePart(@Valid @RequestBody xxxDto dot) {
//		XyglModeldetail domain = xyglModeldetailService.get(id);
//		domain.setxxx();
//		//TODO 设置更新值
//		domain = xyglModeldetailService.update(domain);
//		return domain != null ? renderSuccess() : renderError("更新失败");
//	}
	
}
