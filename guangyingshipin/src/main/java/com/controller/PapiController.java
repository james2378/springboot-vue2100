



















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
 * papi酱视频
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/papi")
public class PapiController {
    private static final Logger logger = LoggerFactory.getLogger(PapiController.class);

    @Autowired
    private PapiService papiService;


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
        params.put("papiDeleteStart",1);params.put("papiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = papiService.queryPage(params);

        //字典表数据转换
        List<PapiView> list =(List<PapiView>)page.getList();
        for(PapiView c:list){
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
        PapiEntity papi = papiService.selectById(id);
        if(papi !=null){
            //entity转view
            PapiView view = new PapiView();
            BeanUtils.copyProperties( papi , view );//把实体数据重构到view中

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
    public R save(@RequestBody PapiEntity papi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,papi:{}",this.getClass().getName(),papi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        Wrapper<PapiEntity> queryWrapper = new EntityWrapper<PapiEntity>()
            .eq("papi_name", papi.getPapiName())
            .eq("papi_video", papi.getPapiVideo())
            .eq("papi_types", papi.getPapiTypes())
            .eq("papi_clicknum", papi.getPapiClicknum())
            .eq("shangxia_types", papi.getShangxiaTypes())
            .eq("papi_delete", papi.getPapiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PapiEntity papiEntity = papiService.selectOne(queryWrapper);
        if(papiEntity==null){
            papi.setPapiClicknum(1);
            papi.setShangxiaTypes(1);
            papi.setPapiDelete(1);
            papi.setCreateTime(new Date());
            papiService.insert(papi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody PapiEntity papi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,papi:{}",this.getClass().getName(),papi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<PapiEntity> queryWrapper = new EntityWrapper<PapiEntity>()
            .notIn("id",papi.getId())
            .andNew()
            .eq("papi_name", papi.getPapiName())
            .eq("papi_video", papi.getPapiVideo())
            .eq("papi_types", papi.getPapiTypes())
            .eq("papi_clicknum", papi.getPapiClicknum())
            .eq("shangxia_types", papi.getShangxiaTypes())
            .eq("papi_delete", papi.getPapiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PapiEntity papiEntity = papiService.selectOne(queryWrapper);
        if("".equals(papi.getPapiPhoto()) || "null".equals(papi.getPapiPhoto())){
                papi.setPapiPhoto(null);
        }
        if("".equals(papi.getPapiVideo()) || "null".equals(papi.getPapiVideo())){
                papi.setPapiVideo(null);
        }
        if(papiEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      papi.set
            //  }
            papiService.updateById(papi);//根据id更新
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
        ArrayList<PapiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            PapiEntity papiEntity = new PapiEntity();
            papiEntity.setId(id);
            papiEntity.setPapiDelete(2);
            list.add(papiEntity);
        }
        if(list != null && list.size() >0){
            papiService.updateBatchById(list);
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
            List<PapiEntity> papiList = new ArrayList<>();//上传的东西
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
                            PapiEntity papiEntity = new PapiEntity();
//                            papiEntity.setPapiName(data.get(0));                    //papi酱视频名称 要改的
//                            papiEntity.setPapiPhoto("");//照片
//                            papiEntity.setPapiVideo(data.get(0));                    //papi酱视频视频 要改的
//                            papiEntity.setPapiTypes(Integer.valueOf(data.get(0)));   //papi酱视频类型 要改的
//                            papiEntity.setPapiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            papiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            papiEntity.setPapiDelete(1);//逻辑删除字段
//                            papiEntity.setPapiContent("");//照片
//                            papiEntity.setCreateTime(date);//时间
                            papiList.add(papiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        papiService.insertBatch(papiList);
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
        PageUtils page = papiService.queryPage(params);

        //字典表数据转换
        List<PapiView> list =(List<PapiView>)page.getList();
        for(PapiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        PapiEntity papi = papiService.selectById(id);
            if(papi !=null){

                //点击数量加1
                papi.setPapiClicknum(papi.getPapiClicknum()+1);
                papiService.updateById(papi);

                //entity转view
                PapiView view = new PapiView();
                BeanUtils.copyProperties( papi , view );//把实体数据重构到view中

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
    public R add(@RequestBody PapiEntity papi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,papi:{}",this.getClass().getName(),papi.toString());
        Wrapper<PapiEntity> queryWrapper = new EntityWrapper<PapiEntity>()
            .eq("papi_name", papi.getPapiName())
            .eq("papi_video", papi.getPapiVideo())
            .eq("papi_types", papi.getPapiTypes())
            .eq("papi_clicknum", papi.getPapiClicknum())
            .eq("shangxia_types", papi.getShangxiaTypes())
            .eq("papi_delete", papi.getPapiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PapiEntity papiEntity = papiService.selectOne(queryWrapper);
        if(papiEntity==null){
            papi.setPapiDelete(1);
            papi.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      papi.set
        //  }
        papiService.insert(papi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



}
