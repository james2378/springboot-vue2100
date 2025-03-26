package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PapiCollectionEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * papi酱视频收藏 服务类
 */
public interface PapiCollectionService extends IService<PapiCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}