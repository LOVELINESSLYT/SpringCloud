package cn.lz.cloud.viewservicefeign.service;

import cn.lz.cloud.publics.vo.Goods;
import cn.lz.cloud.viewservicefeign.client.GoodsClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.service-GoodsService
 * date: 2019/11/14 0014 15:04
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Service
public class GoodsService {

    @Autowired
    GoodsClientFeign goodsClientFeign;

    public List<Goods> listGoods() {
        return goodsClientFeign.listGoods();
    }

}
