package com.jlu.masli.gj11.mybatis.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfo;
import com.jlu.masli.gj11.mybatis.entity.ImgInfoExample;
import com.jlu.masli.gj11.mapper.ImgInfoMapper;
import com.jlu.masli.gj11.mybatis.ImgInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImgInfoServiceImpl implements ImgInfoService {

    @Resource
    private ImgInfoMapper imgInfoMapper;


    @Override
    public int insert(ImgInfo record) {
        return imgInfoMapper.insert(record);
    }

    @Override
    public List<ImgInfo> selectByExample(ImgInfoExample example) {
        return imgInfoMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(ImgInfo record) {
        return imgInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer imgId) {
        return imgInfoMapper.deleteByPrimaryKey(imgId);
    }

    @Override
    public PageInfo<ImgInfo> queryPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        ImgInfoExample example = new ImgInfoExample();
        // 查询条件
        example.createCriteria().andBEnableEqualTo("1").andShowStateEqualTo(1);
        // 排序条件
        example.setOrderByClause("create_date DESC,img_id ASC");
        List<ImgInfo> imgInfoList = imgInfoMapper.selectByExample(example);
        PageInfo<ImgInfo> pageInfo = new PageInfo<>(imgInfoList);
        return pageInfo;
    }


}
