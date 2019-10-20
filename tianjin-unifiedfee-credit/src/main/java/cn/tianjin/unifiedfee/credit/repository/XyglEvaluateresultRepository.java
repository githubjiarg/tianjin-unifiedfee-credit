package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XyglEvaluateresult;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XyglEvaluateresultRepository extends BaseRepository<XyglEvaluateresult, String> {
   
	/** 详情查看弹窗详情 */
    @Query(nativeQuery = true, value="select xd.INDICATE_NAME,xd.INDICATE_SCORE,xd.X_VALUE \n" +
    	"from Xygl_Delevaluateresult xd join XYGL_EVALUATERESULT xe  on xd.EVALUATE_ID=xe.ID " + 
    	"where xd.id = :id ")
    List<Object[]> getHistoryView(@Param("id") String id);
   
    /** 等级分类 信用企业总数 */
    @Query(nativeQuery = true, value="select LEVELS,count(LEVELS) as num from  \n"
    		+ "XYGL_EVALUATERESULT where CREDIT_SHOW = '信用' GROUP BY LEVELS ORDER BY LEVELS")
	List<Object[]> findByLevels();
	
	/** 等级分类 信用企业总数 */
    @Query(nativeQuery = true, value="select LEVELS,count(LEVELS) as num from  \n"
    		+ "XYGL_EVALUATERESULT where CREDIT_SHOW = '风险' GROUP BY LEVELS ORDER BY LEVELS")
	List<Object[]> findByLevelsRiskearly();
	
	/** 详情查看二级列表 */
    @Query(nativeQuery = true, value="select xd.INDICATE_NAME,xd.INDICATE_SCORE,xd.X_VALUE,xd.id \n" +
    	"from Xygl_Delevaluateresult xd join XYGL_EVALUATERESULT xe  on xd.EVALUATE_ID=xe.ID " + 
    	"where xe.id = :id ")
    List<Object[]> getevalHistory(@Param("id") String id);
}