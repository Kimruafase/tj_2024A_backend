package day08.Step1;

public class Step1 {
    public static void main(String[] args) {
//        1,"유재석",40,"공격수",인천
//        2,"박지성",38,"미드필더",인천
//        3,"손흥민",31,"공격수",도트넘
//        4,"이강인",25,"미드필더",파리
//        5,"김민재",28,"수비수",독일
//        6,"서장훈",21,"공격수",서울

    플레이어 유재석 = new 플레이어();
    플레이어 박지성 = new 플레이어(2);
    플레이어 손흥민 = new 플레이어(3, "손흥민");
    플레이어 이강인 = new 플레이어(4, "이강인", 25);
    플레이어 김민재 = new 플레이어(5, "김민재", 28, "수비수");
    플레이어 서장훈 = new 플레이어(6, "서장훈", 21, "공격수", "서울");

//        1,"유재석",40,"공격수",인천
    유재석.set고유식별번호(1);
    유재석.set이름("유재석");
    유재석.set나이(40);
    유재석.set선호포지션("공격수");
    유재석.set소속팀("인천");

//        2,"박지성",38,"미드필더",인천
    박지성.set이름("박지성");
    박지성.set나이(38);
    박지성.set선호포지션("미드필더");
    박지성.set소속팀("인천");

//        3,"손흥민",31,"공격수",토트넘
    손흥민.set나이(31);
    손흥민.set선호포지션("공격수");
    손흥민.set소속팀("토트넘");

//        4,"이강인",25,"미드필더",파리
    이강인.set선호포지션("미드필더");
    이강인.set소속팀("파리");

//        5,"김민재",28,"수비수",독일
    김민재.set소속팀("독일");

    // 출력
    유재석.printPlayerInfo();
    박지성.printPlayerInfo();
    손흥민.printPlayerInfo();
    이강인.printPlayerInfo();
    김민재.printPlayerInfo();
    서장훈.printPlayerInfo();
}
}
