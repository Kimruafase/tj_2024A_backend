package 프로젝트_2nd.model;

public class DungeonDto_Monster {
    //  멤버변수
    private int mkey;
    private String mname;
    private int mhp;
    private int mdropmoney;
    private int mdropitem;
    private int mdamage;
    private int ikey;

    //  생성자
    public DungeonDto_Monster(){}

    public DungeonDto_Monster(int mkey, String mname, int mhp, int mdropmoney, int mdropitem, int mdamage, int ikey) {
        this.mkey = mkey;
        this.mname = mname;
        this.mhp = mhp;
        this.mdropmoney = mdropmoney;
        this.mdropitem = mdropitem;
        this.mdamage = mdamage;
        this.ikey = ikey;
    }

    public int getMkey() {
        return mkey;
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMhp() {
        return mhp;
    }

    public void setMhp(int mhp) {
        this.mhp = mhp;
    }

    public int getMdropmoney() {
        return mdropmoney;
    }

    public void setMdropmoney(int mdropmoney) {
        this.mdropmoney = mdropmoney;
    }

    public int getMdropitem() {
        return mdropitem;
    }

    public void setMdropitem(int mdropitem) {
        this.mdropitem = mdropitem;
    }

    public int getMdamage() {
        return mdamage;
    }

    public void setMdamage(int mdamage) {
        this.mdamage = mdamage;
    }

    public int getIkey() {
        return ikey;
    }

    public void setIkey(int ikey) {
        this.ikey = ikey;
    }

    @Override
    public String toString() {
        return "DungeonDto_Monster{" +
                "mkey=" + mkey +
                ", mname='" + mname + '\'' +
                ", mhp=" + mhp +
                ", mdropmoney=" + mdropmoney +
                ", mdropitem=" + mdropitem +
                ", mdamage=" + mdamage +
                ", ikey=" + ikey +
                '}';
    }
}
