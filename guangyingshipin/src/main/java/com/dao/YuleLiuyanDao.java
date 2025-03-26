package com.dao;

import com.entity.YuleLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuleLiuyanView;

/**
 * 娱乐留言 Dao 接口
 *
 * @author 
 */
public interface YuleLiuyanDao extends BaseMapper<YuleLiuyanEntity> {

   List<YuleLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
