package com.senssun.mymathdemo001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HTextView hTextView;
    private String wx_msg = "04-04-CC-01-04-E5-94-B1-E6-AD-8C-E8-B7-91-E8-B0-83-00-E4-BC-A0-E7-BB-9F-E4-BA-B2-E6-88-9A-E4-B9-8B-E9-97-B4-EF-BC-8C-E5-A4-A7-E5-A4-9A-E4-BB-8E-E5-B0-8F-E5-B0-B1-E7-BB-8F-E5-B8-B8-E6-9D-A5-E5-BE-80-EF-BC-8C-E5-9B-A0-E8-80-8C-E6-9C-89-E6-84-9F-E6-83-85-EF-BC-9B-E5-8D-B3-E4-BE-BF-E4-B8-8D-E5-9C-A8-E4-B8-80-E8-B5-B7-E9-95-BF-E5-A4-A7-EF-BC-8C-E4-B9-9F-E6-9C-89-E5-AE-B6-E6-97-8F-E5-9F-BA-E7-A1-80-E4-BD-9C-E4-BE-9D-E6-89-98-EF-BC-8C-E7-BB-8F-E9-95-BF-E8-BE-88-E4-BA-B2-E6-88-9A-E5-BC-95-E8-8D-90-E5-90-8E-E4-BE-BF-E8-83-BD-E8-BF-85-E9-80-9F-E7-86-9F-E8-AF-86-E3-80-82-E9-81-87-E4-BA-8B-E6-89-BE-E4-BA-B2-E6-88-9A-E5-B8-AE-E5-BF-99-EF-BC-8C-E6-88-90-E6-9C-AC-E4-B8-80-E8-88-AC-E5-BE-88-E4-BD-8E-E3-80-82-0D-0A-0D-0A-E4-BA-B2-E5-B1-9E-E5-85-B3-E7-B3-BB-EF-BC-8C-E8-A6-81-E7-9D-80-E9-87-8D-E7-BB-B4-E6-8A-A4-EF-BC-8C-E5-B9-B3-E6-97-B6-E4-B8-8D-E5-A6-A8-E5-A4-9A-E6-8A-95-E5-85-A5-E8-B5-84-E6-BA-90-E3-80-82-E5-AE-B6-E6-97-8F-E4-B8-AD-E7-9A-84-E5-AD-A9-E5-AD-90-E9-83-BD-E6-98-AF-E2-80-9C-E6-BD-9C-E5-9C-A8-E8-B5-84-E6-BA-90-E2-80-9D-EF-BC-8C-E7-89-B9-E5-88-AB-E6-98-AF-E4-BC-98-E7-A7-80-E7-9A-84-E5-B9-B4-E8-BD-BB-E4-BA-BA-EF-BC-8C-E5-B0-A4-E5-85-B6-E5-80-BC-E5-BE-97-E7-BB-93-E4-BA-A4-E4-B8-80-E4-B8-8B-E3-80-82-E6-97-A9-E7-82-B9-E5-8F-91-E6-8E-98-E5-92-8C-E5-9F-B9-E5-85-BB-EF-BC-8C-E4-BB-A5-E5-90-8E-E5-8F-AF-E8-83-BD-E4-BC-9A-E6-88-90-E4-B8-BA-E4-BD-A0-E7-9A-84-E5-BC-BA-E6-8F-B4-E3-80-82-00-D6-90-";
    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10, btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] split = wx_msg.split("-");
//        Log.i("ttttttttt", split[0] + "onCreate: 001长度是?" + split[split.length - 1]);
//        Log.i("ttttttttt", split[0] + "onCreate: 002长度是?" + split.length);

        btn01= (Button) findViewById(R.id.btn01);
        btn02= (Button) findViewById(R.id.btn02);
        btn03= (Button) findViewById(R.id.btn03);
        btn04= (Button) findViewById(R.id.btn04);
        btn05= (Button) findViewById(R.id.btn05);
        btn06= (Button) findViewById(R.id.btn06);
        btn07= (Button) findViewById(R.id.btn07);
        btn08= (Button) findViewById(R.id.btn08);
        btn09= (Button) findViewById(R.id.btn09);
        btn10= (Button) findViewById(R.id.btn10);
        btn11= (Button) findViewById(R.id.btn11);
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);
        btn06.setOnClickListener(this);
        btn07.setOnClickListener(this);
        btn08.setOnClickListener(this);
        btn09.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);

        hTextView = (HTextView) findViewById(R.id.text);
        // hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/font-name.ttf"));
// be sure to set custom typeface before setting the animate type, otherwise the font may not be updated.


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn01:
                hTextView.setAnimateType(HTextViewType.ANVIL);
                hTextView.animateText("我们讨论了一些方向性的问题"); // animate
                break;
            case R.id.btn02:
                hTextView.setAnimateType(HTextViewType.EVAPORATE);
                hTextView.animateText("一些方向性的问题"); // animate
                break;
            case R.id.btn03:
                hTextView.setAnimateType(HTextViewType.FALL);
                hTextView.animateText("我们讨"); // animate
                break;
            case R.id.btn04:
                hTextView.setAnimateType(HTextViewType.RAINBOW);
                hTextView.animateText("的问题"); // animate
                break;
            case R.id.btn05:
                hTextView.setAnimateType(HTextViewType.LINE);
                hTextView.animateText("我们方向性的问题"); // animate
                break;
            case R.id.btn06:
                hTextView.setAnimateType(HTextViewType.PIXELATE);
                hTextView.animateText("方向性的"); // animate
                break;
            case R.id.btn07:
                hTextView.setAnimateType(HTextViewType.ANVIL);
                hTextView.animateText("问题"); // animate
                break;
            case R.id.btn08:
                hTextView.setAnimateType(HTextViewType.SCALE);
                hTextView.animateText("向性的问题"); // animate
                break;
            case R.id.btn09:
                hTextView.setAnimateType(HTextViewType.SPARKLE);
                hTextView.animateText("讨论了"); // animate
                break;
            case R.id.btn10:
                hTextView.setAnimateType(HTextViewType.TYPER);
                hTextView.animateText("你好机器人"); // animate
                break;
            case R.id.btn11:
                hTextView.setAnimateType(HTextViewType.SPARKLE);
                hTextView.animateText("讨论了机器人"); // animate
                break;
        }


    }
}
