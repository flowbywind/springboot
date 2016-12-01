package com.example.springmvc_demo1.messageConvert;

import com.example.springmvc_demo1.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by myadmin on 2016/11/27.
 */
public class MyHttpMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyHttpMessageConverter(){
        super(new MediaType("application","x-wisely", Charset.forName("UTF-8")));
    }

    /**
     * 表明本HttpMessageConverter只处理DemoObj类
     */
    @Override
    protected boolean supports(Class aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    /**
     * 重写readInternal，处理请求的数据
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass,
                                  HttpInputMessage httpInputMessage)
            throws IOException, HttpMessageNotReadableException {
        String tmp= StreamUtils.copyToString(httpInputMessage.getBody(),
                Charset.forName("UTF-8"));
        String[] tempArr=tmp.split("-");
        return  new DemoObj(new Long(tempArr[0]),tempArr[1]);

    }

    /**
     * 重写writeInternal，处理输出数据到response
     */
    @Override
    protected void writeInternal(DemoObj o, HttpOutputMessage httpOutputMessage)
            throws IOException, HttpMessageNotWritableException {
        String out="output:"+o.getId()+"-"+o.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
