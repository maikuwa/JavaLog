package jp.techacademy.maiko.uetani.javalog;

/**
 * Created by uetanimaiko on 16/09/06.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "私";

    // コンストラクタ
    public Human(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは私クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + this.hobby);
    }

    @Override
    public void think() {
        Log.d("javatest", this.name  + "は" + this.hobby + "について考える");
    }
}