package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XyglModeldetail;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XyglModeldetailRepository extends BaseRepository<XyglModeldetail, String> {
    
    @Transactional
    @Modifying
    @Query(nativeQuery=true, value="delete from xygl_modeldetail mx where mx.indicate_id in (:ids) and model_id=:model_id ")
    public int delete(@Param("ids") String[] ids,@Param("model_id") String model_id);
    /**
     * 根据模型id 获取明细
     * @param model_id
     * @return
     */   
    @Query(nativeQuery=true, value="select * from xygl_modeldetail where model_id=:model_id ")
    public List<XyglModeldetail> getMxData(@Param("model_id") String model_id);
    
    
    /**
     * 根据获取到的id，查询模型明细表里的指标名称、详细说明、指标权重
     */
    @Query("select  xm.indicateName,xm.delDescription,xm.indicateWeight  from  XyglModeldetail  xm  where xm.indicateId=:sid ")
    public List<XyglModeldetail> findInforById(@Param("sid") String sid);

    
    /**
     * 保存数据
     */
    @Transactional
    @Modifying
    @Query(nativeQuery=true, value="update Xygl_Modeldetail   set  indicate_Weight =:weight   where indicate_Id=:zid  ")
    public Integer updatab(@Param("zid") String zid, @Param("weight") String weight);
    
    /**
     *  根据指标id获取当前行的id
     */
    @Query("select xm.id from XyglModeldetail xm  where xm.indicateId=:id ")
    public List<XyglModeldetail> findIdByIndicId(@Param("id") String id);
    
    /**
     * 根据模型明细id查询指标值公式信息
     */
    @Query("select  xi.parameterA,xi.parameterB,xi.maxXvalue,xi.minXvalue,xi.equalValuex,xi.formulaDesc,xi.id "+
     "from  XyglIndicformula  xi  where  xi.indicDetailid = :aid  ")
    public List<Object[]> findInformationByid(@Param("aid")  String aid);

    /**
     * 保存指标值公式的数据
     */
    @Transactional
    @Modifying
    @Query(nativeQuery=true, value="update Xygl_Indicformula xi  set  xi.parameterA =:aparamentA,xi.parameterB=:aparamentB,xi.max_Xvalue=:axmaxvalue,xi.min_Xvalue=:axminvalue   where xi.id=:azhibiaoID  ")
    public Integer updateData(@Param("aparamentA") String aparamentA, @Param("aparamentB") String aparamentB,@Param("axminvalue") String axminvalue,@Param("axmaxvalue") String axmaxvalue,@Param("azhibiaoID") String azhibiaoID);
    
    /**
     * 插入指标值公式的数据
     */
    @Transactional
    @Modifying
    @Query(nativeQuery=true, value="insert into  Xygl_Indicformula xi  (xi.parameterA,xi.parameterB,xi.min_Xvalue,xi.max_Xvalue,xi.id,xi.indic_Detailid)  values(:aparamentA,:aparamentB,:axminvalue,:axmaxvalue,:growthId,:adataId) ")
    public Integer insertData(@Param("aparamentA") String aparamentA, @Param("aparamentB") String aparamentB,@Param("axminvalue") String axminvalue,@Param("axmaxvalue") String axmaxvalue,@Param("growthId") String growthId,@Param("adataId") String adataId);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}