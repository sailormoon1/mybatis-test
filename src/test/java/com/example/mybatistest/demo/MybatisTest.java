package com.example.mybatistest.demo;

import com.example.mybatistest.demo.entity.ClcDiagEntity;
import com.example.mybatistest.demo.mapper.IClcDiagMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2021/2/25 2:16 下午
 * @description 类描述
 */
@Slf4j
public class MybatisTest {
    @Test
    public void testMyBatisBuild() throws IOException {
        InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = sessionFactory.openSession();
        IClcDiagMapper mapper = sqlSession.getMapper(IClcDiagMapper.class);
        ClcDiagEntity student = mapper.queryByDiagId("89ffcbd7a3a44db8a0b40a2bbffff452");
        log.info("查询到的信息为：{}",student);
    }
}
