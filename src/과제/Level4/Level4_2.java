package 과제.Level4;

public class Level4_2 {
    public static void main(String[] args) {
        visitor visitor1 = new visitor();
        visitor visitor2 = new visitor();

        visitor1.visitorNum = 1;
        visitor2.visitorNum = 2;

        visitor1.visitorDetail = "안녕하세요 반갑습니다.";
        visitor2.visitorDetail = "잘 놀다 갑니다.";

        visitor1.visitorDate = "2024-06-17";
        visitor2.visitorDate = "2024-06-18";

        visitor1.visitorName = "김민석";
        visitor2.visitorName = "김희철";

        System.out.println(" ------------------------------- 방문록 ---------------------------------- ");
        System.out.println("번호               날짜                이름           내용");
        System.out.println(visitor1.visitorNum + "               " + visitor1.visitorDate + "           " + visitor1.visitorName +
                "          " + visitor1.visitorDetail);
        System.out.println(visitor2.visitorNum + "               " + visitor2.visitorDate + "           " + visitor2.visitorName+
                "          " + visitor2.visitorDetail);
    }

}
