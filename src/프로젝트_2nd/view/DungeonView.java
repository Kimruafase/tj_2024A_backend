package 프로젝트_2nd.view;

public class DungeonView {
    private static DungeonView dungeonView = new DungeonView();
    private DungeonView(){}

    public static DungeonView getInstance(){
        return dungeonView;
    }

    public void dungeonIndex(){
        while (true){
                try {
                    int ch = (int) (Math.random() * 6 + 1);
                    if (ch == 1) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("몬스터를 조우했습니다!");
                    } else if (ch == 2) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("랜덤한 아이템을 획득하였습니다!");
                    } else if (ch == 3) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("강제 귀환! 던전의 처음으로 돌아갑니다!");
                    } else if (ch == 4) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("아무 일도 일어나지 않았습니다. 그대로 진행합니다.");
                    } else if (ch == 5) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("길이 막혀있습니다! 뒤로 돌아갑니다.");
                    } else if (ch == 6) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("숨어있던 강도를 만났습니다! 살아가려면 갖고 있는 아이템 하나를 내놔야합니다.");
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
        }


    }

    //  1. 몬스터 조우 함수
//    public void


    //  2. 아이템 발견 함수

    //  3. 강제 귀환 함수

    //  4. 그대로 진행 함수

    //  5. 뒤로 가기 함수

    //  6. 강도 조우 함수

    //  7. 전투 함수


}
