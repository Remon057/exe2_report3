package jp.ac.uryukyu.ie.e205707;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    public Hero(String name, int hitPoint, int attack){
            super(name, hitPoint, attack);
        }
    /**
     * 勇者の名前のアクセサ
     * @return String name
     */
    
    /**
     * 勇者の体力のアクセサ
     * @return int hitPoint
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * 勇者の攻撃力のアクセサ
     * @return int attack
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * 勇者の生死のアクセサ
     * @return boolean dead
     */

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    
    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}