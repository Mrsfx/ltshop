package com.zysm.ltshop.controller;

import com.zysm.ltshop.util.AjaxResult;
import com.zysm.ltshop.util.FastDfsApiOpr;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Copyright (C), 2018-2019, Chong Qing  zy.
 *
 * @ClassName: FastDfsController
 * @Description: TODO
 * @Author: Mr_shi
 * @CreateDate: 2019/2/19 19:44
 * @Version: 1.0
 */
@RestController
public class FastDfsController {
    @RequestMapping(value = "/fastdfs",method = RequestMethod.POST)
    public AjaxResult saveFile(MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String filename = file.getOriginalFilename();
            System.out.println(filename);
            String extName = filename.substring(filename.lastIndexOf(".")+1);
            System.out.println(extName);
            String upload = FastDfsApiOpr.upload(bytes, extName);
            return AjaxResult.me().setMessage("上传成功").setRetObj(upload);
        } catch (IOException e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("上传失败");
        }
    }

    @RequestMapping(value = "/fastdfs",method = RequestMethod.DELETE)
    public AjaxResult deleteFile(String filePath){
        try {
            filePath = filePath.substring(1);
            String groupName = filePath.substring(0, filePath.indexOf("/"));
            String fileName = filePath.substring(filePath.indexOf("/") + 1);
            FastDfsApiOpr.delete(groupName,fileName);
            return AjaxResult.me().setMessage("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("删除失败");
        }
    }
}
