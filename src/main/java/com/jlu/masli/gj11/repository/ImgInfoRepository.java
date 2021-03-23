package com.jlu.masli.gj11.repository;

import com.jlu.masli.gj11.mybatis.entity.ImgInfo;

public interface ImgInfoRepository {
    void saveImg(ImgInfo imgInfo);

    ImgInfo findByImgTitle(String imgTitle);

    long updateImgInfo(ImgInfo imgInfo);

    void deleteById(Integer imgId);
}