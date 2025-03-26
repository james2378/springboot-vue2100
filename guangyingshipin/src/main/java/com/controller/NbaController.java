



















package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * NBA
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/nba")
public class NbaController {
    private static final Logger logger = LoggerFactory.getLogger(NbaController.class);

    @Autowired
    private NbaService nbaService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("nbaDeleteStart",1);params.put("nbaDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = nbaService.queryPage(params);

        //字典表数据转换
        List<NbaView> list =(List<NbaView>)page.getList();
        for(NbaView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        NbaEntity nba = nbaService.selectById(id);
        if(nba !=null){
            //entity转view
            NbaView view = new NbaView();
            BeanUtils.copyProperties( nba , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody NbaEntity nba, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,nba:{}",this.getClass().getName(),nba.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<NbaEntity> queryWrapper = new EntityWrapper<NbaEntity>()
            .eq("nba_name", nba.getNbaName())
            .eq("nba_video", nba.getNbaVideo())
            .eq("nba_types", nba.getNbaTypes())
            .eq("nba_clicknum", nba.getNbaClicknum())
            .eq("shangxia_types", nba.getShangxiaTypes())
            .eq("nba_delete", nba.getNbaDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NbaEntity nbaEntity = nbaService.selectOne(queryWrapper);
        if(nbaEntity==null){
            nba.setNbaClicknum(1);
            nba.setShangxiaTypes(1);
            nba.setNbaDelete(1);
            nba.setCreateTime(new Date());
            nbaService.insert(nba);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody NbaEntity nba, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,nba:{}",this.getClass().getName(),nba.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<NbaEntity> queryWrapper = new EntityWrapper<NbaEntity>()
            .notIn("id",nba.getId())
            .andNew()
            .eq("nba_name", nba.getNbaName())
            .eq("nba_video", nba.getNbaVideo())
            .eq("nba_types", nba.getNbaTypes())
            .eq("nba_clicknum", nba.getNbaClicknum())
            .eq("shangxia_types", nba.getShangxiaTypes())
            .eq("nba_delete", nba.getNbaDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NbaEntity nbaEntity = nbaService.selectOne(queryWrapper);
        if("".equals(nba.getNbaPhoto()) || "null".equals(nba.getNbaPhoto())){
                nba.setNbaPhoto(null);
        }
        if("".equals(nba.getNbaVideo()) || "null".equals(nba.getNbaVideo())){
                nba.setNbaVideo(null);
        }
        if(nbaEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      nba.set
            //  }
            nbaService.updateById(nba);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<NbaEntity> list = new ArrayList<>();
        for(Integer id:ids){
            NbaEntity nbaEntity = new NbaEntity();
            nbaEntity.setId(id);
            nbaEntity.setNbaDelete(2);
            list.add(nbaEntity);
        }
        if(list != null && list.size() >0){
            nbaService.updateBatchById(list);
        }
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<NbaEntity> nbaList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            NbaEntity nbaEntity = new NbaEntity();
//                            nbaEntity.setNbaName(data.get(0));                    //NBA名称 要改的
//                            nbaEntity.setNbaPhoto("");//照片
//                            nbaEntity.setNbaVideo(data.get(0));                    //NBA视频 要改的
//                            nbaEntity.setNbaTypes(Integer.valueOf(data.get(0)));   //NBA类型 要改的
//                            nbaEntity.setNbaClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            nbaEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            nbaEntity.setNbaDelete(1);//逻辑删除字段
//                            nbaEntity.setNbaContent("");//照片
//                            nbaEntity.setCreateTime(date);//时间
                            nbaList.add(nbaEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        nbaService.insertBatch(nbaList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = nbaService.queryPage(params);

        //字典表数据转换
        List<NbaView> list =(List<NbaView>)page.getList();
        for(NbaView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        NbaEntity nba = nbaService.selectById(id);
            if(nba !=null){

                //点击数量加1
                nba.setNbaClicknum(nba.getNbaClicknum()+1);
                nbaService.updateById(nba);

                //entity转view
                NbaView view = new NbaView();
                BeanUtils.copyProperties( nba , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody NbaEntity nba, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,nba:{}",this.getClass().getName(),nba.toString());
        Wrapper<NbaEntity> queryWrapper = new EntityWrapper<NbaEntity>()
            .eq("nba_name", nba.getNbaName())
            .eq("nba_video", nba.getNbaVideo())
            .eq("nba_types", nba.getNbaTypes())
            .eq("nba_clicknum", nba.getNbaClicknum())
            .eq("shangxia_types", nba.getShangxiaTypes())
            .eq("nba_delete", nba.getNbaDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NbaEntity nbaEntity = nbaService.selectOne(queryWrapper);
        if(nbaEntity==null){
            nba.setNbaDelete(1);
            nba.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      nba.set
        //  }
        nbaService.insert(nba);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



}
