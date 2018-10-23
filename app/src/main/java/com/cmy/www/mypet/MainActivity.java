package com.cmy.www.mypet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOk;
    ImageView imgPet;
    TextView Text1, Text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text1 =(TextView) findViewById(R.id.Text1);
        Text2 =(TextView) findViewById(R.id.Text2);
        chkAgree = (CheckBox)findViewById(R.id.chkAgree);
        this.rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        this.rdoDog = (RadioButton) findViewById(R.id.rdoDog);
        this.rdoCat = (RadioButton)findViewById(R.id.rdoCat);
        this.rdoRabbit = (RadioButton)findViewById(R.id.rdoRabbit);
        this.btnOk = (Button) findViewById(R.id.btnOk);
        this.imgPet = (ImageView) findViewById(R.id.imgPet);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()){
                    Text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else{
                    Text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }

        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgPet.setImageResource(R.drawable.dog); break;
                    case R.id.rdoCat:
                        imgPet.setImageResource(R.drawable.cat); break;
                    case R.id.rdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit); break;
                    default:
                        Toast.makeText(getApplication(),"동물을 선택하세요", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
