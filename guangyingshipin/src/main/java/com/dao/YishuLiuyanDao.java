package com.dao;

import com.entity.YishuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YishuLiuyanView;

/**
 * 艺术留言 Dao 接口
 *
 * @author 
 */
public interface YishuLiuyanDao extends BaseMapper<YishuLiuyanEntity> {

   List<YishuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
