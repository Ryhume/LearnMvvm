package ryhume.learnmvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ryhume.learnmvvm.databinding.ActivityTextViewBinding;
import ryhume.learnmvvm.model.TextViewData;

public class TextViewActivity extends AppCompatActivity {
    ActivityTextViewBinding binding;
    TextViewData textViewData = new TextViewData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_text_view);
    }

    protected void changeTextData(View view){

        textViewData.text.set("这是个测试");
        binding.setData(textViewData);
    }

    protected void changeTextColor(View view){

        textViewData.textColor.set(getResources().getColor(R.color.colorAccent));
        binding.setData(textViewData);
    }

    protected void changeBackgroundColor(View view){

        textViewData.backGroundColor.set(getResources().getColor(R.color.colorPrimary));
        binding.setData(textViewData);
    }

}
