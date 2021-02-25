package com.example.mybatistest.demo.mapper;

import com.example.mybatistest.demo.entity.ClcDiagEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author chuzhiqiang
 * @Version 1.0.0
 * @date 2020-11-24
 * @description 诊断表
 */
@Mapper
public interface IClcDiagMapper {

    /**
     * 新增
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    int insert(ClcDiagEntity clcDiagEntity);

    /**
     * 刪除
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    int delete(int id);

    /**
     * 更新
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    int update(ClcDiagEntity clcDiagEntity);

    /**
     * 更新
     *
     * @author guomengmeng
     * @date 2020/11/24
     **/
    int updateByDiagId(ClcDiagEntity clcDiagEntity);

    /**
     * 查询 根据主键 id 查询
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    ClcDiagEntity queryById(int id);

    /**
     * 查询 根据主键 id 查询
     *
     * @author guomengmeng
     * @date 2020/11/24
     **/
    ClcDiagEntity queryByDiagId(@Param("diagId") String diagId);


    /**
     * 查询 根据就诊id、诊断类别、诊断状态
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    int pageListCount(int offset, int pagesize);

    /**
     * 查询 根据就诊id、诊断类别、诊断状态查询
     *
     * @author chuzhiqiang
     * @date 2020/11/24
     **/
    List<ClcDiagEntity> getDiagInfo(String inpNo, String diagType, String diagStatus);

    int deleteByDiagTypeAndDtMainId(@Param("diagType") String diagType, @Param("dtMainId") String inpNo);

    List<ClcDiagEntity> queryByDtmainId(@Param("hosNum") String hosNum, @Param("dtmainId") String dtmainId);

    List<ClcDiagEntity> getDiagInfoByDiagTypeAndDtMainId(@Param("dtMainId") String dtMainId, @Param("diagType") String diagType);

    List<ClcDiagEntity> getHospitalDiagInfo(@Param("inpNoList") List<String> inpNoList, @Param("diagTypeList") List<String> diagTypeList, @Param("sureStatus") String sureStatus, @Param("diagClass") String diagClass);

}
