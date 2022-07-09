package cn.lz.cloud.publics.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: cloud-cn.lz.cloud.publics.util-AccessViewService
 * date: 2019/11/21 0021 17:26
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
public class AccessViewService {

    public static void main(String[] args) {
        while (true) {
            ThreadUtil.sleep(1000);
            try {
                String html = HttpUtil.get("http://localhost/view/goods");
                System.out.println("html length:" + html.length());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}