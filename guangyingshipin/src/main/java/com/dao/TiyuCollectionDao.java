package com.dao;

import com.entity.TiyuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuCollectionView;

/**
 * 体育收藏 Dao 接口
 *
 * @author 
 */
public interface TiyuCollectionDao extends BaseMapper<TiyuCollectionEntity> {

   List<TiyuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
