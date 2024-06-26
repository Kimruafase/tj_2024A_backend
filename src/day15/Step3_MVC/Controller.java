package day15.Step3_MVC;

import java.util.ArrayList;

public class Controller {
    //  외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 static 변수
    static Controller con = new Controller();

    //  1. 등록 제어 함수, 매개변수 : 저장할 이름 String, return : 등록 성공 여부 boolean
    public boolean signUpCon(String name){
        System.out.println("Controller.signUpCon");
        boolean result = Dao.dao.signUpConn(name);
        return result;
    }
    //  2. 출력 제어 함수, 매개변수 : 없음, return : 회원목록 ArrayList<String>
    public ArrayList<String> printCon(){
        System.out.println("Controller.printCon");
        ArrayList<String> result = Dao.dao.printConn();
        return result;
    }
    //  3. 수정 제어 함수, 매개변수 : 기존 이름 String, 새 이름 String, return : 수정 성공 여부 boolean
    public boolean updateCon(String oldName, String newName){
        System.out.println("Controller.updateCon");
        boolean result = Dao.dao.updateConn(oldName,newName);
        return result;
    }
    //  4. 삭제 제어 함수, 매개변수 : 삭제할 이름 String, return : 삭제 성공 여부 boolean
    public boolean deleteCon(String name){
        System.out.println("Controller.deleteCon");
        boolean result = Dao.dao.deleteConn(name);
        return result;
    }
}
