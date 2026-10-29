package com.itheima;

import cn.hutool.core.io.FileUtil;
import com.example.HeaderParser;
import com.example.TokenParser;
import com.google.gson.Gson;
import com.itheima.pojo.Result;
import com.itheima.utils.AliyunOSSOperator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class SpringbootWebTests {
    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    @Autowired
    private Gson gson;
    @Test
    public void testJson(){
        System.out.println(gson.toJson(Result.success("hello Gson")));
    }

    @Test
    public void testOSS() throws Exception {
        File file = new File("E:\\Image_1776683430916_125.png");
        String url = aliyunOSSOperator.upload(FileUtil.readBytes(file), "Image_1776683430916_125.png");
        System.out.println(url);
    }

/*    @Autowired
    private TokenParser tokenParser;
    @Test
    public void testTokenParser(){
        tokenParser.parse();
    }*/
    @Autowired
    private HeaderParser headerParser;
    @Test
    public void testHeaderParser(){
        headerParser.parse();
    }

}
