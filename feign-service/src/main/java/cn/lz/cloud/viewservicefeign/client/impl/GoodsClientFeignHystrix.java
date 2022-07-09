package cn.lz.cloud.viewservicefeign.client.impl;

import cn.lz.cloud.publics.vo.Goods;
import cn.lz.cloud.viewservicefeign.client.GoodsClientFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.client.impl-GoodsClientFeignHystrix
 * date: 2019/11/21 0021 14:56
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Component
public class GoodsClientFeignHystrix implements GoodsClientFeign {

    @Override
    public List<Goods> listGoods() {
        return new ArrayList<Goods>() {{
            add(new Goods("500", "数据微服务不可用", "500", "500"));
        }};
    }

}