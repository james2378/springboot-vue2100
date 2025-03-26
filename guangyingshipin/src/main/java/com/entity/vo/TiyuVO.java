package com.entity.vo;

import com.entity.TiyuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 体育
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tiyu")
public class TiyuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 体育名称
     */

    @TableField(value = "tiyu_name")
    private String tiyuName;


    /**
     * 体育照片
     */

    @TableField(value = "tiyu_photo")
    private String tiyuPhoto;


    /**
     * 体育视频
     */

    @TableField(value = "tiyu_video")
    private String tiyuVideo;


    /**
     * 体育类型
     */

    @TableField(value = "tiyu_types")
    private Integer tiyuTypes;


    /**
     * 点击次数
     */

    @TableField(value = "tiyu_clicknum")
    private Integer tiyuClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "tiyu_delete")
    private Integer tiyuDelete;


    /**
     * 体育简介
     */

    @TableField(value = "tiyu_content")
    private String tiyuContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：体育名称
	 */
    public String getTiyuName() {
        return tiyuName;
    }


    /**
	 * 获取：体育名称
	 */

    public void setTiyuName(String tiyuName) {
        this.tiyuName = tiyuName;
    }
    /**
	 * 设置：体育照片
	 */
    public String getTiyuPhoto() {
        return tiyuPhoto;
    }


    /**
	 * 获取：体育照片
	 */

    public void setTiyuPhoto(String tiyuPhoto) {
        this.tiyuPhoto = tiyuPhoto;
    }
    /**
	 * 设置：体育视频
	 */
    public String getTiyuVideo() {
        return tiyuVideo;
    }


    /**
	 * 获取：体育视频
	 */

    public void setTiyuVideo(String tiyuVideo) {
        this.tiyuVideo = tiyuVideo;
    }
    /**
	 * 设置：体育类型
	 */
    public Integer getTiyuTypes() {
        return tiyuTypes;
    }


    /**
	 * 获取：体育类型
	 */

    public void setTiyuTypes(Integer tiyuTypes) {
        this.tiyuTypes = tiyuTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getTiyuClicknum() {
        return tiyuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setTiyuClicknum(Integer tiyuClicknum) {
        this.tiyuClicknum = tiyuClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getTiyuDelete() {
        return tiyuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setTiyuDelete(Integer tiyuDelete) {
        this.tiyuDelete = tiyuDelete;
    }
    /**
	 * 设置：体育简介
	 */
    public String getTiyuContent() {
        return tiyuContent;
    }


    /**
	 * 获取：体育简介
	 */

    public void setTiyuContent(String tiyuContent) {
        this.tiyuContent = tiyuContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
