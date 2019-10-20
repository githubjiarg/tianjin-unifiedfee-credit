package cn.tianjin.unifiedfee.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.taiji.db.jpa.base.repository.BaseRepository;
import cn.tianjin.unifiedfee.credit.domain.XyglDict;

/**
 * 功能Repository层
 *
 */
@Repository
public interface XyglDictRepository extends BaseRepository<XyglDict, String> {
    
    
    @Query("select xd from XyglDict xd where xd.isDlete='0' and xd.category=:category ")
    public List<XyglDict> findByType(@Param("category")String category);

}