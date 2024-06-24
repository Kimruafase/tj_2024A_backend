package day13.Step5;

class Car {
    Tire tire;
    public void run(){  this.tire.roll();    }
}
class Tire {
    public void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}
class HankookTire extends Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire extends Tire {
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}

public class Step5 {
    public static void main(String[] args) {

        Car myCar = new Car();
        // myCar.run();
        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run();                  // 일반 타이어가 회전합니다. class Tire의 roll() 메소드를 호출함.

        myCar.tire = new Tire();
        myCar.run();                    // 일반 타이어가 회전합니다. class Tire의 roll() 메소드를 호출함.

        myCar.tire = new HankookTire();
        myCar.run();                    // 한국 타이어가 회전합니다. class Tire의 roll() 메소드를 오버라이드하여 다시 덮어씌워서 "한국 타이어가 회전합니다"로 재정의함

        myCar.tire = new KumhoTire();
        myCar.run();
        yourCar.run();

        System.out.println( myCar.tire instanceof  KumhoTire  );
        if( myCar.tire instanceof Tire ){       //  만약 mycar.tire 객체가 Tire를 포함하는 지 확인 포함하면 true 아니면 false
            myCar.tire = new HankookTire();     //  mycar.tire 객체가 Tire를 포함하면 mycar.tire 객체를 new 한국타이어로 재대입
        }
        myCar.run();
    }
}