package com.dao;

import com.entity.PapiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PapiCollectionView;

/**
 * papi酱视频收藏 Dao 接口
 *
 * @author 
 */
public interface PapiCollectionDao extends BaseMapper<PapiCollectionEntity> {

   List<PapiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
