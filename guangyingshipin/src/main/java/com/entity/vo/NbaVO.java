package com.entity.vo;

import com.entity.NbaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * NBA
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("nba")
public class NbaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * NBA名称
     */

    @TableField(value = "nba_name")
    private String nbaName;


    /**
     * NBA照片
     */

    @TableField(value = "nba_photo")
    private String nbaPhoto;


    /**
     * NBA视频
     */

    @TableField(value = "nba_video")
    private String nbaVideo;


    /**
     * NBA类型
     */

    @TableField(value = "nba_types")
    private Integer nbaTypes;


    /**
     * 点击次数
     */

    @TableField(value = "nba_clicknum")
    private Integer nbaClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "nba_delete")
    private Integer nbaDelete;


    /**
     * NBA简介
     */

    @TableField(value = "nba_content")
    private String nbaContent;


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
	 * 设置：NBA名称
	 */
    public String getNbaName() {
        return nbaName;
    }


    /**
	 * 获取：NBA名称
	 */

    public void setNbaName(String nbaName) {
        this.nbaName = nbaName;
    }
    /**
	 * 设置：NBA照片
	 */
    public String getNbaPhoto() {
        return nbaPhoto;
    }


    /**
	 * 获取：NBA照片
	 */

    public void setNbaPhoto(String nbaPhoto) {
        this.nbaPhoto = nbaPhoto;
    }
    /**
	 * 设置：NBA视频
	 */
    public String getNbaVideo() {
        return nbaVideo;
    }


    /**
	 * 获取：NBA视频
	 */

    public void setNbaVideo(String nbaVideo) {
        this.nbaVideo = nbaVideo;
    }
    /**
	 * 设置：NBA类型
	 */
    public Integer getNbaTypes() {
        return nbaTypes;
    }


    /**
	 * 获取：NBA类型
	 */

    public void setNbaTypes(Integer nbaTypes) {
        this.nbaTypes = nbaTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getNbaClicknum() {
        return nbaClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setNbaClicknum(Integer nbaClicknum) {
        this.nbaClicknum = nbaClicknum;
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
    public Integer getNbaDelete() {
        return nbaDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setNbaDelete(Integer nbaDelete) {
        this.nbaDelete = nbaDelete;
    }
    /**
	 * 设置：NBA简介
	 */
    public String getNbaContent() {
        return nbaContent;
    }


    /**
	 * 获取：NBA简介
	 */

    public void setNbaContent(String nbaContent) {
        this.nbaContent = nbaContent;
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
