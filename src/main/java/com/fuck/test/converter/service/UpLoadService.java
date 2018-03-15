package com.fuck.test.converter.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * DESCRIPTION:
 * 文件转换成PDF上传接口
 * @author zouyan
 * @create 2018-01-29 下午4:31
 * created by fuck~
 **/
public interface UpLoadService {

    /**
     * 文件转换成PDF上传至fastdfs，返回fastdfs文件访问地址
     * @param uploadFile
     * @return
     * @throws Exception
     */
    public String uploadFile(MultipartFile uploadFile) throws Exception;

    /**
     * 图片base64上传至fastdfs，返回fastdfs文件访问地址
     * @param fileName
     * @param fileData
     * @return
     * @throws Exception
     */
    public String uploadBase64Img(String fileName, String fileData) throws Exception;
}
