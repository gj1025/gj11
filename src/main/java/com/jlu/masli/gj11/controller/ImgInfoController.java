package com.jlu.masli.gj11.controller;

import com.github.pagehelper.PageInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfoExample;
import com.jlu.masli.gj11.mybatis.ImgInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class ImgInfoController {

    @Resource
    private ImgInfoService imgInfoService ;

    // 增加
    @RequestMapping("/insert")
    public int insert(){
        ImgInfo record = new ImgInfo() ;
        record.setUploadUserId("A123");
        record.setImgTitle("博文图片");
        record.setSystemType(1) ;
        record.setImgType(2);
        record.setImgUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setLinkUrl("https://avatars0.githubusercontent.com/u/50793885?s=460&v=4");
        record.setShowState(1);
        record.setCreateDate(new Date());
        record.setUpdateDate(record.getCreateDate());
        record.setRemark("知了");
        record.setbEnable("1");
        return imgInfoService.insert(record) ;
    }

    // 组合查询
    @RequestMapping("/selectByExample")
    public List<ImgInfo> selectByExample(){
        ImgInfoExample example = new ImgInfoExample() ;
        example.createCriteria().andRemarkEqualTo("知了") ;
        return imgInfoService.selectByExample(example);
    }

    // 修改
    @RequestMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(){
        ImgInfo record = new ImgInfo() ;
        record.setImgId(11);
        record.setRemark("知了一笑");
        return imgInfoService.updateByPrimaryKeySelective(record);
    }

    // 分页查询
    @RequestMapping("/queryPage")
    public PageInfo<ImgInfo> queryPage () {
        int page = 1;
        int pageSize = 6 ;
        return imgInfoService.queryPage(page,pageSize);
    }

    // 删除
    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey() {
        Integer imgId = 11 ;
        return imgInfoService.deleteByPrimaryKey(imgId);
    }

}
