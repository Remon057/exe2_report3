package jp.ac.uryukyu.ie.e205707;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }
    
    /**
     * 敵の名前のアクセサ
     * @return　String name
     */
    
    /**
     * 敵の体力のアクセサ
     * @return　int hitPoint
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * 敵の攻撃力のアクセサ
     * @return　int attack
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * 敵の生死のアクセサ
     * @return　boolean　dead
     */
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}