package jp.techacademy.maiko.uetani.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("私", "読書");     // 名前を私、趣味読書、Dogのインスタンスを作る

        human.think();
    }

}