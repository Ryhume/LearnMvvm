package ryhume.learnmvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ryhume.learnmvvm.databinding.ActivityTextViewBinding;
import ryhume.learnmvvm.model.TextViewData;

public class TextViewActivity extends AppCompatActivity {
    ActivityTextViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_text_view);
    }

    protected void change(View view){

        TextViewData textViewData = new TextViewData();
        textViewData.text.set("这是个测试");
        binding.setData(textViewData);
    }

}
