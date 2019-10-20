package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XyglModel;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XyglModelRepository extends BaseRepository<XyglModel, String> {

	@Query("select xm.id,xm.modelType,xm.modelName,xm.modelCode,xm.modelSource,xm.modelDesc,xm.modelVersion,xm.modelStatus,xm.firmType  from XyglModel xm  where xm.modelType='1' ")
	public List<XyglModel> findXyglModel();
	
	@Query("select xm.id,xm.modelType,xm.modelName,xm.modelCode,xm.modelSource,xm.modelDesc,xm.modelVersion,xm.modelStatus,xm.firmType  from XyglModel xm  where xm.modelType='0' ")
	public List<XyglModel> findXyglModelRisk();
	
	@Query("select xm.id,xm.modelType,xm.modelName,xm.modelCode,xm.modelSource,xm.modelDesc,xm.modelVersion,xm.modelStatus,xm.firmType from XyglModel xm  where  xm.modelName like %:modelName% and xm.modelType='1' ")
	public List<XyglModel> findXyglModelAll(@Param("modelName") String modelName);
	
	@Query("select xm.id,xm.modelType,xm.modelName,xm.modelCode,xm.modelSource,xm.modelDesc,xm.modelVersion,xm.modelStatus,xm.firmType from XyglModel xm  where  xm.modelName like %:modelNameRisk% and xm.modelType='0' ")
	public List<XyglModel> findXyglModelRiskAll(@Param("modelNameRisk") String modelNameRisk);
}