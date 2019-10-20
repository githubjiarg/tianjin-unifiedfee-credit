package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XyglIndicators;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XyglIndicatorsRepository extends BaseRepository<XyglIndicators, String> {
	@Query("select  xyin.id,xyin.indicName  from  XyglIndicators  xyin where  xyin.parentId  is null")
	public List<XyglIndicators> findByIdName();
	
	@Query("select xm.indicName  from  XyglIndicators  xm  where  xm.id = :idss ")
	public List<XyglIndicators> findByName(@Param(value="idss") String idss);
	
	@Query("select m.indicName from XyglIndicators  m  where  m.parentId = :idString ")
	public List<XyglIndicators> findPindicByID(@Param(value="idString") String idString);
}