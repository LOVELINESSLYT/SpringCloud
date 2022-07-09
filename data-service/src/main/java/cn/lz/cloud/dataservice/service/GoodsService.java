package cn.lz.cloud.dataservice.service;

import cn.lz.cloud.publics.vo.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.dataservice.service-GoodsService
 * date: 2019/11/13 0013 16:21
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Service
public class GoodsService {

    /**
     * 端口号，用于区分数据来源
     */
    @Value("${server.port}")
    String port;

    public List<Goods> listGoods() {
        return new ArrayList<Goods>() {{
            add(new Goods("1", "苹果", "6", "" + port));
            add(new Goods("2", "菠萝", "12", "" + port));
            add(new Goods("3", "提子", "34", "" + port));
            add(new Goods("4", "西瓜", "11", "" + port));
            add(new Goods("5", "草莓", "50", "" + port));
            add(new Goods("6", "橘子", "22", "" + port));
        }};
    }

}
