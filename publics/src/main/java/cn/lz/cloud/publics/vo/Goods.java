package cn.lz.cloud.publics.vo;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: LinZeCloud-cn.lz.cloud.publics.vo-Goods
 * date: 2019/11/13 0013 15:11
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
public class Goods {

    private String gid;

    private String gname;

    private String gprice;

    private String gport;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGprice() {
        return gprice;
    }

    public void setGprice(String gprice) {
        this.gprice = gprice;
    }

    public String getGport() {
        return gport;
    }

    public void setGport(String gport) {
        this.gport = gport;
    }

    public Goods() {

    }

    public Goods(String gid, String gname, String gprice, String gport) {
        this.gid = gid;
        this.gname = gname;
        this.gprice = gprice;
        this.gport = gport;
    }

}