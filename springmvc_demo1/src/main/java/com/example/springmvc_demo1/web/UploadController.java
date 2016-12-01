package com.example.springmvc_demo1.web;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by myadmin on 2016/11/23.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    public String index(){
        return "/upload/index";
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST,
            produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String upload(MultipartFile file) throws Exception {
        try {
            //解决中文文件名乱码问题
            String name=new String(file.getOriginalFilename().getBytes("ISO-8859-1"),"UTF-8");
            File f = new File("e:/upload/uploads/" + name);
            System.out.println("**********上传文件路径" + f.getAbsolutePath());
            FileUtils.writeByteArrayToFile(f, file.getBytes());
            return f.getAbsolutePath();
        } catch (Exception e) {
            return "wrong";
        }
    }


    @RequestMapping(value="/getFilePath",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getFilePath() throws Exception {
        File f = new File("e:/upload/uploads/test.txt");
        String msg="";
        try {
            boolean mkdir = f.mkdirs();
            msg+="创建文件夹是否成功" + mkdir;
            if (!f.exists()) {
                boolean mkfile = f.createNewFile();
                msg+="创建文件是否成功" + mkfile;
            }
            System.out.println(f.getAbsolutePath());

        } catch (Exception ex) {
            StringWriter stringWriter=new StringWriter();
            PrintWriter printWriter=new PrintWriter(stringWriter);
            ex.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            msg +=stringWriter.toString();
            stringWriter.close();
            printWriter.close();

        } finally {
            return f.getAbsolutePath() + " isCanWrite" + f.canWrite() + msg;
        }
    }
}
