package 프로젝트_2nd.view;

import 프로젝트_2nd.controller.DungeonController;
import 프로젝트_2nd.model.CharacterDto;
import 프로젝트_2nd.model.DungeonDto_Monster;
import 프로젝트_2nd.model.SkillDto;

import java.util.Scanner;

public class DungeonView {
    Scanner scan = new Scanner(System.in);

    private static DungeonView dungeonView = new DungeonView();
    private DungeonView(){}

    public static DungeonView getInstance(){
        return dungeonView;
    }
    //  던전의 진행 상황 변수
    int dungeonState = 0;
    //  캐릭터와 몬스터의 체력과 데미지 설정
    int cDamage = 20;
    int cHp = 100;
    int mDamage = 10;
    int mHp = 100;
    public void dungeonIndex(){
                try {
                    int ch = (int)(Math.random() * 6 + 1);
                    if (ch == 1) {
                        System.out.println(ch + "번이 나왔습니다!");
                        meetMonster();
                    } else if (ch == 2) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("회복의 크리스탈을 발견하였습니다! 체력을 회복합니다.");
                        hpRecovery();
                    } else if (ch == 3) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("강제 귀환! 던전의 처음으로 돌아갑니다!");
                        backToTheBeginning();
                    } else if (ch == 4) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("아무 일도 일어나지 않았습니다. 그대로 진행합니다.");
                        goContinue();
                    } else if (ch == 5) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("길이 막혀있습니다! 뒤로 돌아갑니다.");
                        goBackOneSpace();
                    } else if (ch == 6) {
                        System.out.println(ch + "번이 나왔습니다!");
                        System.out.println("함정이 발동되었습니다! 체력이 감소합니다.");
                        meetTrap();
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
    }


    //  1. 몬스터 조우 함수
    public void meetMonster(){
        fight();
        dungeonState += 20;
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
    }

    //  2. 체력 회복 함수
    public void hpRecovery(){
        cHp += 50;
        dungeonState += 20;
        System.out.println("현재 체력은 " + cHp + "입니다.");
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
        gameOver();
    }

    //  3. 강제 귀환 함수
    public void backToTheBeginning(){


        dungeonState = 0;
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
        gameOver();
    }

    //  4. 그대로 진행 함수
    public void goContinue(){


        dungeonState += 20;
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
        gameOver();
    }

    //  5. 뒤로 가기 함수
    public void goBackOneSpace(){

        if(dungeonState > 0){
            dungeonState -= 20;
        }else {
            dungeonState = 0;
        }
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
        gameOver();
    }

    //  6. 함정 발동 함수
    public void meetTrap(){
        cHp -= 50;
        dungeonState += 20;
        System.out.println("현재 체력은 " + cHp + "입니다.");
        System.out.println("던전의 진행 상황은 [" + dungeonState + "%]입니다.");
        gameOver();

    }

    //  7. 전투 함수
    public void fight(){
        System.out.println("몬스터를 만났습니다! 전투하시겠습니까?");
        System.out.println("1번 : 전투하기 / 나머지 : 후퇴하기");
        int ch = scan.nextInt();
        if(ch == 1){
            myCharacterFight();
        }else{
            return;
        }
    }

    public void myCharacterFight(){

        CharacterDto characterDto = new CharacterDto();
        DungeonDto_Monster dungeonDtoMonster = new DungeonDto_Monster();
        SkillDto skillDto = new SkillDto();

        dungeonDtoMonster.setMdamage(mDamage);
        skillDto.setSkdamage(cDamage);
        characterDto.setChp(cHp);
        dungeonDtoMonster.setMhp(mHp);
        while (true){
            System.out.println("아무 키나 입력하세요. (INSERT)");
            scan.next();
            DungeonController.getInstance().myCharacterFight(characterDto,dungeonDtoMonster,skillDto);
            System.out.println("나의 체력 : " + characterDto.getChp());
            System.out.println("몬스터의 체력 : " + dungeonDtoMonster.getMhp());
            if(characterDto.getChp() <= 0){
                cHp = characterDto.getChp();
                gameOver();
                return;
            } else if (dungeonDtoMonster.getMhp() <= 0) {
                System.out.println("전투에서 승리하였습니다!");
                cHp = characterDto.getChp();
                dungeonIndex();
            }
        }
    }

    //  8.

    // 진행 or 후퇴 함수
    public void goOrBack(){
        System.out.println(" == 계속 진행하시겠습니까? ==");
        System.out.println(" == 1번 : 진행하기 / 나머지 후퇴하기 ==");
        int ch = scan.nextInt();
        if(ch == 1){
            dungeonIndex();
        }else{
            return;
        }
    }

    // 게임 종료 함수
    public void gameOver(){
        if(cHp == 0 || cHp < 0){
            System.out.println("[[캐릭터의 체력이 0 이하이므로 클리어하지 못했습니다.]]");
            return;
        } else if (dungeonState == 100) {
            System.out.println("[[던전을 클리어하셨습니다! 축하드립니다!]]");
            return;
        } else{
            goOrBack();
        }
    }
}
