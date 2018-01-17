package massive_mark.waitetarot;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ResultActivity extends AppCompatActivity {

    ImageView cardOne,cardTwo,cardThree,cardFour,cardFive;
    int ranNum1, ranNum2,ranNum3, ranNum4, ranNum5;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        //MobileAds.initialize(this, "ca-app-pub-8661570416579598/6729438664");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        cardOne = (ImageView)findViewById(R.id.firstCard);
        cardTwo = (ImageView)findViewById(R.id.secondCard);
        cardThree = (ImageView)findViewById(R.id.thirdCard);
        cardFour = (ImageView)findViewById(R.id.fourthCard);
        cardFive = (ImageView)findViewById(R.id.fifthCard);

        Intent submit = getIntent();
        String myfate = submit.getStringExtra("fate");
        String myfate2 = submit.getStringExtra("fate2");
        String myfate3 = submit.getStringExtra("fate3");
        String myfate4 = submit.getStringExtra("fate4");
        String myfate5 = submit.getStringExtra("fate5");

        ranNum1 = Integer.parseInt(myfate);
        ranNum2 = Integer.parseInt(myfate2);
        ranNum3 = Integer.parseInt(myfate3);
        ranNum4 = Integer.parseInt(myfate4);
        ranNum5 = Integer.parseInt(myfate5);




        final int[] imageArray = new int[]{
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
                R.drawable.four_cups,
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

        if(ranNum1==0)
            cardOne.setImageResource(imageArray[0]);

        if(ranNum2==0)
            cardOne.setImageResource(imageArray[0]);

        if(ranNum3==0)
            cardOne.setImageResource(imageArray[0]);

        if(ranNum4==0)
            cardOne.setImageResource(imageArray[0]);

        if(ranNum5==0)
            cardOne.setImageResource(imageArray[0]);



        cardOne.setImageResource(imageArray[ranNum1]);
        cardTwo.setImageResource(imageArray[ranNum2]);
        cardThree.setImageResource(imageArray[ranNum3]);
        cardFour.setImageResource(imageArray[ranNum4]);
        cardFive.setImageResource(imageArray[ranNum5]);


        /*
        Random randomGenerator = new Random();
        int fate = randomGenerator.nextInt(78);
        int fate2 = randomGenerator.nextInt(78);
            if(fate2 == fate){
                fate2 = randomGenerator.nextInt(78);
            }
        int fate3 = randomGenerator.nextInt(78);
            if(fate3 == fate2 || fate3 == fate){
                fate3 = randomGenerator.nextInt(78);
            }
        int fate4 = randomGenerator.nextInt(78);
            if(fate4 == fate3 || fate4 == fate2 || fate4 == fate){
                fate4 = randomGenerator.nextInt(78);
        }
        int fate5 = randomGenerator.nextInt(78);
            if(fate5 == fate4 || fate5 == fate3 || fate5 == fate2 || fate5 == fate){
               fate5 = randomGenerator.nextInt(78);
        }

        cardOne.setImageResource(imageArray[fate]);
        cardTwo.setImageResource(imageArray[fate2]);
        cardThree.setImageResource(imageArray[fate3]);
        cardFour.setImageResource(imageArray[fate4]);
        cardFive.setImageResource(imageArray[fate5]);
        */

    }


    public void meaning_bt1(View view){
        if(ranNum1 == 0){

        }else {

            Intent mIntent = getIntent();
            String meaningNumber = mIntent.getStringExtra("fate");

            Intent meanIntent = new Intent();
            meanIntent.setClass(ResultActivity.this,MeaningActivity.class);
            meanIntent.putExtra("meaningNum", meaningNumber);
            startActivity(meanIntent);
        }
    }

    public void meaning_bt2(View view){
        if(ranNum2 == 0){

        }else {

            Intent mIntent = getIntent();
            String meaningNumber = mIntent.getStringExtra("fate2");

            Intent meanIntent = new Intent();
            meanIntent.setClass(ResultActivity.this,MeaningActivity.class);
            meanIntent.putExtra("meaningNum", meaningNumber);
            startActivity(meanIntent);
        }
    }

    public void meaning_bt3(View view){
        if(ranNum3 == 0){

        }else {

            Intent mIntent = getIntent();
            String meaningNumber = mIntent.getStringExtra("fate3");

            Intent meanIntent = new Intent();
            meanIntent.setClass(ResultActivity.this,MeaningActivity.class);
            meanIntent.putExtra("meaningNum", meaningNumber);
            startActivity(meanIntent);
        }
    }

    public void meaning_bt4(View view){
        if(ranNum4 == 0){

        }else {

            Intent mIntent = getIntent();
            String meaningNumber = mIntent.getStringExtra("fate4");

            Intent meanIntent = new Intent();
            meanIntent.setClass(ResultActivity.this,MeaningActivity.class);
            meanIntent.putExtra("meaningNum", meaningNumber);
            startActivity(meanIntent);
        }
    }


    public void meaning_bt5(View view){
        if(ranNum5 == 0){

        }else {

            Intent mIntent = getIntent();
            String meaningNumber = mIntent.getStringExtra("fate5");

            Intent meanIntent = new Intent();
            meanIntent.setClass(ResultActivity.this,MeaningActivity.class);
            meanIntent.putExtra("meaningNum", meaningNumber);
            startActivity(meanIntent);
        }
    }



}
