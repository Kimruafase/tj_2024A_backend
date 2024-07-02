package 프로젝트_2nd.controller;

import 프로젝트_2nd.model.CharacterDto;
import 프로젝트_2nd.model.DungeonDto_Monster;
import 프로젝트_2nd.model.SkillDto;
import 프로젝트_2nd.view.DungeonView;

public class DungeonController {
    private static DungeonController dungeonController = new DungeonController();
    private DungeonController(){}

    public static DungeonController getInstance(){
        return dungeonController;
    }

    public void myCharacterFight(CharacterDto characterDto, DungeonDto_Monster dungeonDtoMonster, SkillDto skillDto){
        int Chp = characterDto.getChp();
        int Mhp = dungeonDtoMonster.getMhp();
        int Cdamage = skillDto.getSkdamage();
        int Mdamage = dungeonDtoMonster.getMdamage();

        Mhp -= Cdamage;
        Chp -= Mdamage;

        characterDto.setChp(Chp);
        dungeonDtoMonster.setMhp(Mhp);
    }

}
