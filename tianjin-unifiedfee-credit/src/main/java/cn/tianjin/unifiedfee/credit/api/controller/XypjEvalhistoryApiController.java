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
import cn.tianjin.unifiedfee.credit.domain.XypjEvalhistory;
import cn.tianjin.unifiedfee.credit.service.XypjEvalhistoryService;

/**
 * xx模块数据接口
 *
 */
@RestController
@RequestMapping("/api/credit/xypj-evalhistory")
public class XypjEvalhistoryApiController extends BaseApiController {

	@Autowired
	public XypjEvalhistoryService xypjEvalhistoryService;

	
	/**
	 * 获取列表
	 * @param pageInfo
	 *            查询条件
	 * @return 结果集
	 */
	@PostMapping("/list")
	public ResponseResult findPage(@RequestBody PageInfo<XypjEvalhistory> pageInfo) {
		return renderSuccess(xypjEvalhistoryService.findPage(pageInfo));
	}
	
	/**
	 *  关联查询获取历史明细
	 * @param pageInfo
	 *            
	 * @return 结果集
	 */
	@PostMapping("/findHistorydetail")
	public ResponseResult getevalHistory(@Valid @RequestBody String historyId) {
	    
		return renderSuccess(xypjEvalhistoryService.getevalHistory(historyId));
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
		XypjEvalhistory domain = xypjEvalhistoryService.get(id);
		return domain != null ? renderSuccess(domain) : renderError("数据不存在");
	}

	/**
	 * 添加一条数据
	 * 
	 * @param XypjEvalhistory
	 *            实体类
	 * @return 添加结果
	 */
	@PostMapping
	public ResponseResult add(@Valid @RequestBody XypjEvalhistory domain) {
		domain = xypjEvalhistoryService.save(domain);
		return domain != null ? renderSuccess() : renderError("添加失败");
	}

	/**
	 * 更新全部数据
	 * 
	 * @param XypjEvalhistory
	 * @return 更新结果
	 */
	@PutMapping
	public ResponseResult updateAll(@Valid @RequestBody XypjEvalhistory domain) {
		domain = xypjEvalhistoryService.update(domain);
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
		xypjEvalhistoryService.delete(id);
		return renderSuccess();
	}

	
}
