package cn.lz.cloud.dataservice.controller;

import cn.lz.cloud.dataservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.dataservice.controller-GoodsController
 * date: 2019/11/14 0014 15:18
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class GoodsController {

    @Autowired
    GoodsService gs;

    @RequestMapping("goods")
    public Object listGoods() {
        return gs.listGoods();
    }

}