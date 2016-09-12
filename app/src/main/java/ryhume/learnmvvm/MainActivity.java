package ryhume.learnmvvm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void textView(View view){
        startActivity(new Intent(this,TextViewActivity.class));
    }

    protected void listView(View view){
        startActivity(new Intent(this,ListViewActivity.class));
    }

    protected void recycleView(View view){
        startActivity(new Intent(this,RecycleViewActivity.class));
    }

    protected void viewPagerView(View view){
        startActivity(new Intent(this,ViewPagerActivity.class));
    }

}
