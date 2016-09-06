package jp.techacademy.maiko.uetani.javalog;

/**
 * Created by uetanimaiko on 16/09/05.
 */
abstract class Animal {
    // メンバ変数
    String name;  // 名前
    String hobby;


    abstract public void say();

    public abstract void think();
}