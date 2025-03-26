package com.dao;

import com.entity.NbaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NbaView;

/**
 * NBA Dao 接口
 *
 * @author 
 */
public interface NbaDao extends BaseMapper<NbaEntity> {

   List<NbaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
