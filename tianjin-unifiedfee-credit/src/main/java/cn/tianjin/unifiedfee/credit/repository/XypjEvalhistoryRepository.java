package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XypjEvalhistory;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XypjEvalhistoryRepository extends BaseRepository<XypjEvalhistory, String> {

    /** 查询评价历史明细 */
    @Query(nativeQuery = true, value="select xe.firm_name,xh.indicate_score,xi.indicate_name," +
	"xi.indic_grade, xi.indic_data_source,xi.indic_desc,xi.id \n" +
    	"from xypj_evalhistory xe join xypj_historydetail xh on xe.id=xh.eval_history_id " + 
    	"left join xygl_indicators xi on xi.id=xh.indicateid " +
    	"where xe.id = :id ")
    List<Object[]> getevalHistory(@Param("id") String id);
    
    /** 查询评价历史详情 */
    @Query(nativeQuery = true, value="select xe.firm_name,xh.indicate_score,xi.indicate_name," +
	"xi.indic_grade, xi.indic_data_source,xi.indic_desc,xi.id \n" +
	 "from xypj_evalhistory xe join xypj_historydetail xh on xe.id=xh.eval_history_id " + 
	 "join xygl_indicators xi on xi.id=xh.indicateid " +
	 "where xi.id = :id ")
    public List<Object[]> findDetail(@Param("id") String id);
    
}