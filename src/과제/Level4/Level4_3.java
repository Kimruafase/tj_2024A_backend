package 과제.Level4;

public class Level4_3 {
    public static void main(String[] args) {
        member member1 = new member();
        member member2 = new member();

        member1.memberNum = 1;
        member2.memberNum = 2;

        member1.memberId = "qwer";
        member2.memberId = "asdf";

        member1.memberPw = "0123";
        member2.memberPw = "4567";

        member1.memberName = "김민석";
        member2.memberName = "김희철";

        System.out.println(" 회원번호 : " + member1.memberNum);
        System.out.println(" ID : " + member1.memberId);
        System.out.println(" Pw : " + member1.memberPw);
        System.out.println(" 회원 이름 : " + member1.memberName);
        System.out.println();
        System.out.println(" 회원번호 : " + member2.memberNum);
        System.out.println(" ID : " + member2.memberId);
        System.out.println(" Pw : " + member2.memberPw);
        System.out.println(" 회원 이름 : " + member2.memberName);
    }
}
