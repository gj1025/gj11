package com.jlu.masli.gj11.mybatis;

import com.github.pagehelper.PageInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfoExample;

import java.util.List;

public interface ImgInfoService {

    // 增加
    int insert(ImgInfo record);

    // 组合查询
    List<ImgInfo> selectByExample(ImgInfoExample example);

    // 修改
    int updateByPrimaryKeySelective(ImgInfo record);

    // 删除
    int deleteByPrimaryKey(Integer imgId);

    // 分页查询
    PageInfo<ImgInfo> queryPage(int page, int pageSize);

}
