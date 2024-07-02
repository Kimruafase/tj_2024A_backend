package 프로젝트_2nd.model;

public class CharacterDto {
    //이동객체 DTO생성
    //1. 멤버변수
    private String nickname;
    private int chp;
    private int cmp;
    private int cmoney;
    private int cdamage;
    //2. 생성자
    //기본생성자
    public CharacterDto(){}
    //전체 생성자
    public CharacterDto(String nickname, int chp, int cmp, int cmoney, int cdamage) {
        this.nickname = nickname;
        this.chp = chp;
        this.cmp = cmp;
        this.cmoney = cmoney;
        this.cdamage = cdamage;
    }
    //필요 생성자

    public CharacterDto(String nickname) {
        this.nickname = nickname;
    }

    //3. 메소드

    //3-1 getter & setter
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getChp() {
        return chp;
    }

    public void setChp(int chp) {
        this.chp = chp;
    }

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public int getCmoney() {
        return cmoney;
    }

    public void setCmoney(int cmoney) {
        this.cmoney = cmoney;
    }

    public int getCdamage() {
        return cdamage;
    }

    public void setCdamage(int cdamage) {
        this.cdamage = cdamage;
    }

    //3-2 toString

    @Override
    public String toString() {
        return "CharacterDTO{" +
                "nickname='" + nickname + '\'' +
                ", chp=" + chp +
                ", cmp=" + cmp +
                ", cmoney=" + cmoney +
                ", cdamage=" + cdamage +
                '}';
    }
}
