package com.dao;

import com.entity.TiyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuView;

/**
 * 体育 Dao 接口
 *
 * @author 
 */
public interface TiyuDao extends BaseMapper<TiyuEntity> {

   List<TiyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
