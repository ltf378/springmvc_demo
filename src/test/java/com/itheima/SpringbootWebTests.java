package com.itheima;

import cn.hutool.core.io.FileUtil;
import com.itheima.utils.AliyunOSSOperator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class SpringbootWebTests {
    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;
    @Test
    public void testOSS() throws Exception {
        File file = new File("E:\\Image_1776683430916_125.png");
        String url = aliyunOSSOperator.upload(FileUtil.readBytes(file), "Image_1776683430916_125.png");
        System.out.println(url);
    }

}
