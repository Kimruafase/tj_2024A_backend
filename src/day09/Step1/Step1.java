package day09.Step1;

public class Step1 {
    public static void main(String[] args) {

        //  [1] 학생(객체) 2명
        Student studentJames = new Student("James",5000);
            //  Student 클래스 내 기본 / 디폴트 생성자가 없으므로 오류
//        Student studentJames2 = new Student();
        Student studentThomas = new Student("Thomas",10000);

        //  [2] 버스 1대 생성
            // 제임스가 100번 버스를 탑니다.
        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        System.out.println(studentJames);
        System.out.println(bus100);


        //  [3] 지하철 1대 생성
        Subway subwayGreen = new Subway("2호선");
        studentThomas.takeSubway(subwayGreen);
        System.out.println(studentThomas);
        System.out.println(subwayGreen);

        //  [4] 180p. Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다.
        //  택시 요금은 10,000원을 지출했습니다. 이 과정을 구현하시오.
        Student studentEdward = new Student("Edward",20000);
        Taxi taxi7145 = new Taxi("741아7145");
        studentEdward.takeTaxi(taxi7145);
        System.out.println(studentEdward);
        System.out.println(taxi7145);
    }
}
