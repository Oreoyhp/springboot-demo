package com.zhp.springbootfdfsdemo;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Instant;

@SpringBootTest
class SpringbootFdfsDemoApplicationTests {

    /**
     * 上传图片测试
     * return
     * group1/M00/00/00/wKhYgV6k-suAD2KIAACPkAzJ4N4916.jpg
     */
    @Test
    void testUpload() {
        try {
            ClientGlobal.initByProperties("fastdfs-client.properties");
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient1 client = new StorageClient1(trackerServer, storageServer);
            NameValuePair nvp[] = null;
            //上传到文件系统
            String fileId = client.upload_file1("D:\\123\\crsc.jpg", "jpg",
                    nvp);
            System.out.println(fileId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 下载图片测试
     */
    @Test
    void testDownload() {
        try {
            ClientGlobal.initByProperties("fastdfs-client.properties");
            TrackerClient tracker = new TrackerClient();
            TrackerServer trackerServer = tracker.getConnection();
            StorageServer storageServer = null;
            StorageClient1 client = new StorageClient1(trackerServer, storageServer);
            byte[] bytes = client.download_file1("group1/M00/00/00/wKhYgV6k-suAD2KIAACPkAzJ4N4916.jpg");
            FileOutputStream fos = new FileOutputStream(new File("D:\\666.jpg"));
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 前端访问时追加token和时间戳
     * 根据 ProtoCommon.getToken 方法来获取令牌，注意这个方法的第一个参数是你要访问的文件 id，
     * 注意，这个地址里边不包含 group，千万别搞错了；第二个参数是时间戳，第三个参数是密钥，密钥要和服务端的配置一致。
     * @throws Exception
     */
    @Test
    public void getToken() throws Exception {
        int ts = (int) Instant.now().getEpochSecond();
        String token = ProtoCommon.getToken("M00/00/00/wKhYgV6lCCSAWoK5AACPkAzJ4N4505.jpg", ts, "FastDFS1234567890");
        StringBuilder sb = new StringBuilder();
        sb.append("?token=").append(token);
        sb.append("&ts=").append(ts);
        System.out.println(sb.toString());
    }

}
