package jp.ac.uryukyu.ie.e205707;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing target){
        
        if(dead == false){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, target.getName(), damage);
            target.wounded(damage);
        }
        

    }
    
}
