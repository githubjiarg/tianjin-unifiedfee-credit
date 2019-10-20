package cn.tianjin.unifiedfee.credit.service;

import java.util.List;

import cn.taiji.db.jpa.base.service.BaseService;
import cn.tianjin.unifiedfee.credit.domain.XypjEvalhistory;

/**
 * 功能Service层接口
 *
 */
public interface XypjEvalhistoryService extends BaseService<XypjEvalhistory, String> {

    public List<Object[]> getevalHistory(String historyId);
    
    public List<Object[]> findDetail(String id);

}
