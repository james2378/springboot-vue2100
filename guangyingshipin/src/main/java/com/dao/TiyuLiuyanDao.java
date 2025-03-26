package com.dao;

import com.entity.TiyuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyuLiuyanView;

/**
 * 体育留言 Dao 接口
 *
 * @author 
 */
public interface TiyuLiuyanDao extends BaseMapper<TiyuLiuyanEntity> {

   List<TiyuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
