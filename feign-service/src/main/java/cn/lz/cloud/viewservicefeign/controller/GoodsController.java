package cn.lz.cloud.viewservicefeign.controller;

import cn.lz.cloud.viewservicefeign.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.viewservicefeign.controller-GoodsController
 * date: 2019/11/14 0014 15:10
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RefreshScope
public class GoodsController {

    @Value("${version}")
    String version;

    @Value("${server.port}")
    String port;

    @Autowired
    GoodsService bs;

    @RequestMapping("goods")
    public String goods(Model model) {
        model.addAttribute("goods", bs.listGoods());
        model.addAttribute("port", port);
        model.addAttribute("version", version);
        return "goods";
    }

}