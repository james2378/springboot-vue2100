package com.dao;

import com.entity.PapiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PapiView;

/**
 * papi酱视频 Dao 接口
 *
 * @author 
 */
public interface PapiDao extends BaseMapper<PapiEntity> {

   List<PapiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
