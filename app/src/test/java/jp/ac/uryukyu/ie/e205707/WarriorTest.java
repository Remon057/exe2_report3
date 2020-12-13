package jp.ac.uryukyu.ie.e205707;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    /**
     * Heroクラスからオブジェクトを生成し、
     * attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void attackWithWeponSkillTest(){
        int testAttack = 10;
        int testhitPoint;
        Warrior demoWarrior = new Warrior("tes戦士", 10, testAttack);
        Enemy demoEnemy = new Enemy("tet敵", 200, 10);
        for (int i = 0; i < 3; i++ ){
            testhitPoint = demoEnemy.hitPoint;
            demoWarrior.attackWithWeponSkill(demoEnemy);
            assertEquals(testhitPoint - demoEnemy.hitPoint, (int) (testAttack * 1.5));
        }
        
    }

}
