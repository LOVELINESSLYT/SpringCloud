package cn.lz.cloud.publics.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: cloud-cn.lz.cloud.publics.util-RefreshConfigUtil
 * date: 2019/11/26 0026 13:46
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
public class RefreshConfigUtil {

    public static void main(String[] args) {
        HashMap<String,String> headers = new HashMap<>(1);
        headers.put("Content-Type", "application/json; charset=utf-8");
        System.out.println("因为要去git获取，还要刷新 config-server, 会比较卡，所以一般会要好几秒才能完成，请耐心等待......");
        Long l1 = System.currentTimeMillis();
        HttpUtil.createPost("http://localhost/view/actuator/bus-refresh").addHeaders(headers).execute().body();
        Long l2 = System.currentTimeMillis();
        System.out.println("耗时:" + (l2 - l1) + "ms.");
        System.out.println("refresh 完成.");
    }

}