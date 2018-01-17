package massive_mark.waitetarot;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button chooseButton1,chooseButton2,chooseButton3,chooseButton4,chooseButton5,theResult;
    TextView titleText;
    ImageView imTitle;
    int fate, fate2, fate3, fate4, fate5;
    int i =0;
    Toast chooseToast, resultToast, resetToast;
    int[] imageArray;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //MobileAds.initialize(this, "ca-app-pub-8661570416579598/7008973169");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        chooseButton1 = (Button)findViewById(R.id.button);

        theResult = (Button)findViewById(R.id.result);
        titleText = (TextView) findViewById(R.id.textView);
        imTitle = (ImageView)findViewById(R.id.imageView);


        imageArray = new int[]{
                R.drawable.cover,
                R.drawable.ace_cups,
                R.drawable.ace_pentacles,
                R.drawable.ace_swords,
                R.drawable.ace_wands,
                R.drawable.chariot,
                R.drawable.death,
                R.drawable.devil,
                R.drawable.eight_cups,
                R.drawable.eight_pentacles,
                R.drawable.eight_swords,
                R.drawable.eight_wands,
                R.drawable.emperor,
                R.drawable.empress,
                R.drawable.five_cups,
                R.drawable.five_pentacles,
                R.drawable.five_swords,
                R.drawable.five_wands,
                R.drawable.fool,
                R.drawable.fortune_wheel,
                R.drawable.five_cups,
                R.drawable.four_pentacles,
                R.drawable.four_swords,
                R.drawable.four_wands,
                R.drawable.hanged_man,
                R.drawable.hermit,
                R.drawable.hierophant,
                R.drawable.high_priestess,
                R.drawable.judgement,
                R.drawable.justice,
                R.drawable.king_cups,
                R.drawable.king_pentacles,
                R.drawable.king_swords,
                R.drawable.king_wands,
                R.drawable.knight_cups,
                R.drawable.knight_pentacles,
                R.drawable.knight_swords,
                R.drawable.knight_wands,
                R.drawable.lovers,
                R.drawable.magician,
                R.drawable.moon,
                R.drawable.nine_cups,
                R.drawable.nine_pentacles,
                R.drawable.nine_swords,
                R.drawable.nine_wands,
                R.drawable.page_cups,
                R.drawable.page_pentacles,
                R.drawable.page_swords,
                R.drawable.page_wands,
                R.drawable.queen_cups,
                R.drawable.queen_pentacles,
                R.drawable.queen_swords,
                R.drawable.queen_wands,
                R.drawable.seven_cups,
                R.drawable.seven_pentacles,
                R.drawable.seven_swords,
                R.drawable.seven_wands,
                R.drawable.six_cups,
                R.drawable.six_pentacles,
                R.drawable.six_swords,
                R.drawable.six_wands,
                R.drawable.stars,
                R.drawable.strength,
                R.drawable.sun,
                R.drawable.temperance,
                R.drawable.ten_cups,
                R.drawable.ten_pentacles,
                R.drawable.ten_swords,
                R.drawable.ten_wands,
                R.drawable.three_cups,
                R.drawable.three_pentacles,
                R.drawable.three_swords,
                R.drawable.three_wands,
                R.drawable.tower,
                R.drawable.two_cups,
                R.drawable.two_pentacles,
                R.drawable.two_swords,
                R.drawable.ten_wands,
                R.drawable.world,
//---------------------------逆位--------------------------------------------
                R.drawable.ace_cups2,
                R.drawable.ace_pentacles2,
                R.drawable.ace_swords2,
                R.drawable.ace_wands2,
                R.drawable.chariot2,
                R.drawable.death2,
                R.drawable.devil2,
                R.drawable.eight_cups2,
                R.drawable.eight_pentacles2,
                R.drawable.eight_swords2,
                R.drawable.eight_wands2,
                R.drawable.emperor2,
                R.drawable.empress2,
                R.drawable.five_cups2,
                R.drawable.five_pentacles2,
                R.drawable.five_swords2,
                R.drawable.five_wands2,
                R.drawable.fool2,
                R.drawable.fortune_wheel2,
                R.drawable.five_cups2,
                R.drawable.four_pentacles2,
                R.drawable.four_swords2,
                R.drawable.four_wands2,
                R.drawable.hanged_man2,
                R.drawable.hermit2,
                R.drawable.hierophant2,
                R.drawable.high_priestess2,
                R.drawable.judgement2,
                R.drawable.justice2,
                R.drawable.king_cups2,
                R.drawable.king_pentacles2,
                R.drawable.king_swords2,
                R.drawable.king_wands2,
                R.drawable.knight_cups2,
                R.drawable.knight_pentacles2,
                R.drawable.knight_swords2,
                R.drawable.knight_wands2,
                R.drawable.lovers2,
                R.drawable.magician2,
                R.drawable.moon2,
                R.drawable.nine_cups2,
                R.drawable.nine_pentacles2,
                R.drawable.nine_swords2,
                R.drawable.nine_wands2,
                R.drawable.page_cups2,
                R.drawable.page_pentacles2,
                R.drawable.page_swords2,
                R.drawable.page_wands2,
                R.drawable.queen_cups2,
                R.drawable.queen_pentacles2,
                R.drawable.queen_swords2,
                R.drawable.queen_wands2,
                R.drawable.seven_cups2,
                R.drawable.seven_pentacles2,
                R.drawable.seven_swords2,
                R.drawable.seven_wands2,
                R.drawable.six_cups2,
                R.drawable.six_pentacles2,
                R.drawable.six_swords2,
                R.drawable.six_wands2,
                R.drawable.stars2,
                R.drawable.strength2,
                R.drawable.sun2,
                R.drawable.temperance2,
                R.drawable.ten_cups2,
                R.drawable.ten_pentacles2,
                R.drawable.ten_swords2,
                R.drawable.ten_wands2,
                R.drawable.three_cups2,
                R.drawable.three_pentacles2,
                R.drawable.three_swords2,
                R.drawable.three_wands2,
                R.drawable.tower2,
                R.drawable.two_cups2,
                R.drawable.two_pentacles2,
                R.drawable.two_swords2,
                R.drawable.ten_wands2,
                R.drawable.world2
        };





        theResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                if(i<6){
                    if(resultToast != null){
                        resultToast.cancel();
                    }
                    resultToast = Toast.makeText(getApplicationContext(),"請選完五張牌",Toast.LENGTH_LONG);
                    resultToast.show();

                }else {

                }
                */
                    Intent submit = new Intent();
                    submit.setClass(MainActivity.this, ResultActivity.class);

                    String num1 = String.valueOf(fate);
                    String num2 = String.valueOf(fate2);
                    String num3 = String.valueOf(fate3);
                    String num4 = String.valueOf(fate4);
                    String num5 = String.valueOf(fate5);


                        submit.putExtra("fate", num1);

                        submit.putExtra("fate2", num2);

                        submit.putExtra("fate3", num3);

                        submit.putExtra("fate4", num4);

                        submit.putExtra("fate5", num5);



                    startActivity(submit);




            }
        });


    }

    public void bt_1(View v){
        if(i==0){i=1;}

        if(i<6){
            if(i==1) {
                Random rdGenerator = new Random();
                fate = rdGenerator.nextInt(156)+1;
                imTitle.setImageResource(imageArray[fate]);
            }
            else if(i==2) {
                Random rdGenerator2 = new Random();
                fate2 = rdGenerator2.nextInt(156)+1;
                imTitle.setImageResource(imageArray[fate2]);

                if (fate2 == fate) {
                    fate2 = rdGenerator2.nextInt(156)+1;
                    imTitle.setImageResource(imageArray[fate2]);
                    if (fate2 == fate) {
                        fate2 = rdGenerator2.nextInt(156)+1;
                        imTitle.setImageResource(imageArray[fate2]);
                        if (fate2 == fate) {
                            fate2 = rdGenerator2.nextInt(156)+1;
                            imTitle.setImageResource(imageArray[fate2]);
                        }
                    }
                }
            }
            else if(i==3) {
                Random rdGenerator3 = new Random();
                fate3 = rdGenerator3.nextInt(156)+1;
                imTitle.setImageResource(imageArray[fate3]);
                if (fate3 == fate2 || fate3 == fate) {
                    fate3 = rdGenerator3.nextInt(156)+1;
                    imTitle.setImageResource(imageArray[fate3]);
                    if (fate3 == fate2 || fate3 == fate) {
                        fate3 = rdGenerator3.nextInt(156)+1;
                        imTitle.setImageResource(imageArray[fate3]);
                        if (fate3 == fate2 || fate3 == fate) {
                            fate3 = rdGenerator3.nextInt(156)+1;
                            imTitle.setImageResource(imageArray[fate3]);
                        }
                    }
                }
            }
            else if(i==4) {
                Random rdGenerator4 = new Random();
                fate4 = rdGenerator4.nextInt(156)+1;
                imTitle.setImageResource(imageArray[fate4]);
                if (fate4 == fate3 || fate4 == fate2 || fate4 == fate) {
                    fate4 = rdGenerator4.nextInt(156)+1;
                    imTitle.setImageResource(imageArray[fate4]);
                    if (fate4 == fate3 || fate4 == fate2 || fate4 == fate) {
                        fate4 = rdGenerator4.nextInt(156)+1;
                        imTitle.setImageResource(imageArray[fate4]);
                        if (fate4 == fate3 || fate4 == fate2 || fate4 == fate) {
                            fate4 = rdGenerator4.nextInt(156)+1;
                            imTitle.setImageResource(imageArray[fate4]);
                        }
                    }
                }
            }
            else if(i==5) {
                Random rdGenerator5 = new Random();
                fate5 = rdGenerator5.nextInt(156)+1;
                imTitle.setImageResource(imageArray[fate5]);
                if (fate5 == fate4 || fate5 == fate3 || fate5 == fate2 || fate5 == fate) {
                    fate5 = rdGenerator5.nextInt(156)+1;
                    imTitle.setImageResource(imageArray[fate5]);
                    if (fate5 == fate4 || fate5 == fate3 || fate5 == fate2 || fate5 == fate) {
                        fate5 = rdGenerator5.nextInt(156)+1;
                        imTitle.setImageResource(imageArray[fate5]);
                        if (fate5 == fate4 || fate5 == fate3 || fate5 == fate2 || fate5 == fate) {
                            fate5 = rdGenerator5.nextInt(156)+1;
                            imTitle.setImageResource(imageArray[fate5]+1);
                        }
                    }
                }
            }



                  chooseButton1.setText("已選" + i + "張牌");
        }else if(i<10){
                  chooseButton1.setText("已選5張牌");
        }else if(i >=10){
                  chooseButton1.setText("已選完5張");
                  if(chooseToast != null){
                       chooseToast.cancel();
                  }
                  chooseToast = Toast.makeText(getApplicationContext(),"已選定5張,不能再多了..",Toast.LENGTH_LONG);
                  chooseToast.show();

        }

            i++;
    }


        public void reset_bt(View v){
            fate = 0;
            fate2 = 0;
            fate3 = 0;
            fate4 = 0;
            fate5 = 0;
            i = 0;
            if(resetToast != null){
                resetToast.cancel();
            }
            chooseButton1.setText("按我選牌");
            resetToast = Toast.makeText(getApplicationContext(),"  重新洗牌中  ",Toast.LENGTH_LONG);
            imTitle.setImageResource(R.drawable.cover);
            resetToast.show();

        }



    }




