package massive_mark.waitetarot;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MeaningActivity extends AppCompatActivity {

    ImageView im_result;
    TextView cardname, keyword, planet, elements, meaning;
    int[] imageArray;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);

        im_result = (ImageView)findViewById(R.id.imageView_result);
        cardname = (TextView)findViewById(R.id.card_name);
        keyword = (TextView)findViewById(R.id.key_word);
        planet = (TextView)findViewById(R.id.planet);
        elements = (TextView)findViewById(R.id.elements);
        meaning = (TextView)findViewById(R.id.card_meaning);


        Intent getIntent = getIntent();
        String myfate = getIntent.getStringExtra("meaningNum");

        String myfate2 = getIntent.getStringExtra("fate2");
        String myfate3 = getIntent.getStringExtra("fate3");
        String myfate4 = getIntent.getStringExtra("fate4");
        String myfate5 = getIntent.getStringExtra("fate5");



        int number1 = Integer.parseInt(myfate);



        switch (number1){
            case 0:
                cardname.setText("未選擇");
                keyword.setText("未選擇");
                planet.setText("未選擇");
                elements.setText("未選擇");
                break;
            case 1:
                cardname.setText("聖杯一");
                keyword.setText("情感的付出、心靈的滿足");
                planet.setText("無");
                elements.setText("水");
                meaning.setText(R.string.聖杯一1);
                break;
            case 2:
                cardname.setText("錢幣一");
                keyword.setText("物質、地位、財富");
                planet.setText("無");
                elements.setText("土");
                meaning.setText(R.string.錢幣一2);
                break;
            case 3:
                cardname.setText("寶劍一");
                keyword.setText("思想、理智、跨越困難");
                planet.setText("無");
                elements.setText("風");
                meaning.setText(R.string.寶劍一3);
                break;
            case 4:
                cardname.setText("權杖一");
                keyword.setText("起源、行動的開始、創造");
                planet.setText("無");
                elements.setText("火");
                meaning.setText(R.string.權杖一4);
                break;
            case 5:
                cardname.setText("戰車");
                keyword.setText("勝利、行動、調整");
                planet.setText("月亮");
                elements.setText("水");
                meaning.setText(R.string.戰車5);
                break;
            case 6:
                cardname.setText("死神");
                keyword.setText("決定的時候、改變、結束");
                planet.setText("冥王星");
                elements.setText("水");
                meaning.setText(R.string.死神6);
            case 7:
                cardname.setText("魔鬼");
                keyword.setText("本能與慾望、迷惑、限制");
                planet.setText("土星");
                elements.setText("土");
                meaning.setText(R.string.魔鬼7);
                break;
            case 8:
                cardname.setText("聖杯八");
                keyword.setText("放棄計畫、疑心病、倦怠冷漠");
                planet.setText("土星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯八8);
                break;
            case 9:
                cardname.setText("錢幣八");
                keyword.setText("謹慎扎實、細心經營、學習");
                planet.setText("太陽、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣八9);
                break;
            case 10:
                cardname.setText("寶劍八");
                keyword.setText("干擾、限制、思想不集中");
                planet.setText("木星、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍八10);
                break;
            case 11:
                cardname.setText("權杖八");
                keyword.setText("迅速、傳達、急遽變化");
                planet.setText("火星、射手");
                elements.setText("火");
                meaning.setText(R.string.權杖八11);
                break;
            case 12:
                cardname.setText("皇帝");
                keyword.setText("支配、成熟、有經驗的");
                planet.setText("火星");
                elements.setText("火");
                meaning.setText(R.string.皇帝12);
                break;
            case 13:
                cardname.setText("女皇");
                keyword.setText("豐收、懷孕、愛情");
                planet.setText("金星");
                elements.setText("土/風");
                meaning.setText(R.string.女皇13);
                break;
            case 14:
                cardname.setText("聖杯五");
                keyword.setText("失望、悲觀、原地踏步");
                planet.setText("火星、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯五14);
                break;
            case 15:
                cardname.setText("錢幣五");
                keyword.setText("憂慮、困擾、窘境");
                planet.setText("水星、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣五15);
                break;
            case 16:
                cardname.setText("寶劍五");
                keyword.setText("紛爭、暫時的勝利、惡化");
                planet.setText("金星、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍五16);
                break;
            case 17:
                cardname.setText("權杖五");
                keyword.setText("鬥爭、反抗、艱辛");
                planet.setText("土星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖五17);
                break;
            case 18:
                cardname.setText("愚人");
                keyword.setText("靈性、自由、不切實際");
                planet.setText("天王星");
                elements.setText("風");
                meaning.setText(R.string.愚人18);
                break;
            case 19:
                cardname.setText("命運之輪");
                keyword.setText("輪迴、轉變、好壞交替");
                planet.setText("木星");
                elements.setText("火");
                meaning.setText(R.string.命運之輪19);
                break;
            case 20:
                cardname.setText("聖杯四");
                keyword.setText("漠不關心、不滿足、觀望");
                planet.setText("巨蟹、月亮");
                elements.setText("水");
                meaning.setText(R.string.聖杯四20);
                break;
            case 21:
                cardname.setText("錢幣四");
                keyword.setText("固守、固執、吝嗇");
                planet.setText("太陽、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣四21);
                break;
            case 22:
                cardname.setText("寶劍四");
                keyword.setText("休戰、消極、放下心中煩惱");
                planet.setText("木星、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍四22);
                break;
            case 23:
                cardname.setText("權杖四");
                keyword.setText("到達、完成、回家");
                planet.setText("金星、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖四23);
                break;
            case 24:
                cardname.setText("吊人");
                keyword.setText("犧牲、付出、考驗");
                planet.setText("海王星");
                elements.setText("水");
                meaning.setText(R.string.吊人24);
                break;
            case 25:
                cardname.setText("隱士");
                keyword.setText("審慎、反省、黑暗中的光明");
                planet.setText("水星");
                elements.setText("土");
                meaning.setText(R.string.隱士25);
                break;
            case 26:
                cardname.setText("教皇");
                keyword.setText("規範、教導、制約");
                planet.setText("金星");
                elements.setText("土");
                meaning.setText(R.string.教皇26);
                break;
            case 27:
                cardname.setText("女祭司");
                keyword.setText("思考、直覺、隱藏、智慧");
                planet.setText("月亮");
                elements.setText("水");
                meaning.setText(R.string.女祭司27);
                break;
            case 28:
                cardname.setText("審判");
                keyword.setText("大逆轉、解決、真理");
                planet.setText("冥王星");
                elements.setText("水");
                meaning.setText(R.string.審判28);
                break;
            case 29:
                cardname.setText("正義");
                keyword.setText("公平、糾正、均衡、衡量");
                planet.setText("金星");
                elements.setText("風");
                meaning.setText(R.string.正義29);
                break;
            case 30:
                cardname.setText("聖杯國王");
                keyword.setText("和善的男人、慈祥、親切");
                planet.setText("天蠍");
                elements.setText("水/土");
                meaning.setText(R.string.聖杯國王30);
                break;
            case 31:
                cardname.setText("錢幣國王");
                keyword.setText("穩重的男人、踏實、堅定保守");
                planet.setText("金牛");
                elements.setText("土/土");
                meaning.setText(R.string.錢幣國王31);
                break;
            case 32:
                cardname.setText("寶劍國王");
                keyword.setText("嚴肅、公正、經驗");
                planet.setText("水瓶");
                elements.setText("風/土");
                meaning.setText(R.string.寶劍國王32);
                break;
            case 33:
                cardname.setText("權杖國王");
                keyword.setText("穩重、堅強、良知賢明");
                planet.setText("獅子");
                elements.setText("火/土");
                meaning.setText(R.string.權杖國王33);
                break;
            case 34:
                cardname.setText("聖杯騎士");
                keyword.setText("體貼的人、多變、機會接近");
                planet.setText("雙魚");
                elements.setText("水/火");
                meaning.setText(R.string.聖杯騎士34);
                break;
            case 35:
                cardname.setText("錢幣騎士");
                keyword.setText("努力、累積、安定");
                planet.setText("處女");
                elements.setText("土/火");
                meaning.setText(R.string.錢幣騎士35);
                break;
            case 36:
                cardname.setText("寶劍騎士");
                keyword.setText("強勢、急燥、不切實際");
                planet.setText("雙子");
                elements.setText("風/火");
                meaning.setText(R.string.寶劍騎士36);
                break;
            case 37:
                cardname.setText("權杖騎士");
                keyword.setText("積極、行動、有了變化");
                planet.setText("射手");
                elements.setText("火/火");
                meaning.setText(R.string.權杖騎士37);
                break;
            case 38:
                cardname.setText("戀人");
                keyword.setText("結合、選擇、合作");
                planet.setText("水星");
                elements.setText("風");
                meaning.setText(R.string.戀人38);
                break;
            case 39:
                cardname.setText("魔術師");
                keyword.setText("創造、說服、運用、實現");
                planet.setText("水星");
                elements.setText("風");
                meaning.setText(R.string.魔術師39);
                break;
            case 40:
                cardname.setText("月亮");
                keyword.setText("不安、多變、刻板印象");
                planet.setText("海王星");
                elements.setText("水");
                meaning.setText(R.string.月亮40);
                break;
            case 41:
                cardname.setText("聖杯九");
                keyword.setText("享樂、滿足、願望達成");
                planet.setText("木星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯九41);
                break;
            case 42:
                cardname.setText("錢幣九");
                keyword.setText("魅力、貴氣、收穫、有眼光");
                planet.setText("金星、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣九42);
                break;
            case 43:
                cardname.setText("寶劍九");
                keyword.setText("擔心、夢魘、自我壓抑");
                planet.setText("火星、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍九43);
                break;
            case 44:
                cardname.setText("權杖九");
                keyword.setText("警覺、審慎、小心、防守備戰");
                planet.setText("月亮，射手");
                elements.setText("火");
                meaning.setText(R.string.權杖九44);
                break;
            case 45:
                cardname.setText("聖杯侍者");
                keyword.setText("深情的、柔弱、情竇初開");
                planet.setText("無");
                elements.setText("水/風");
                meaning.setText(R.string.聖杯侍者45);
                break;
            case 46:
                cardname.setText("錢幣侍者");
                keyword.setText("集中力、上進、吸引、認真");
                planet.setText("無");
                elements.setText("土/風");
                meaning.setText(R.string.錢幣侍者46);
                break;
            case 47:
                cardname.setText("寶劍侍者");
                keyword.setText("機警、小心、嗅覺靈敏");
                planet.setText("無");
                elements.setText("風/風");
                meaning.setText(R.string.寶劍侍者47);
                break;
            case 48:
                cardname.setText("權杖侍者");
                keyword.setText("認真、優秀的輔佐、值得信賴");
                planet.setText("無");
                elements.setText("火/風");
                meaning.setText(R.string.權杖侍者48);
                break;
            case 49:
                cardname.setText("聖杯皇后");
                keyword.setText("溫柔、傾聽、兼具知性和感性");
                planet.setText("巨蟹");
                elements.setText("水/水");
                meaning.setText(R.string.聖杯皇后49);
                break;
            case 50:
                cardname.setText("錢幣皇后");
                keyword.setText("善解人意、知性、自立與成熟");
                planet.setText("摩羯");
                elements.setText("土/水");
                meaning.setText(R.string.錢幣皇后50);
                break;
            case 51:
                cardname.setText("寶劍皇后");
                keyword.setText("道德、準備就緒、孤獨和哀愁");
                planet.setText("天秤");
                elements.setText("風/水");
                meaning.setText(R.string.寶劍皇后51);
                break;
            case 52:
                cardname.setText("權杖皇后");
                keyword.setText("純樸的、柔及廣闊的心思");
                planet.setText("牡羊");
                elements.setText("火/水");
                meaning.setText(R.string.權杖皇后52);
                break;
            case 53:
                cardname.setText("聖杯七");
                keyword.setText("沉浸幻想、不切實際、白日夢");
                planet.setText("金星、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯七53);
                break;
            case 54:
                cardname.setText("錢幣七");
                keyword.setText("等待時機、無法得到預期成果");
                planet.setText("土星、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣七54);
                break;
            case 55:
                cardname.setText("寶劍七");
                keyword.setText("暗地的敵人、突發奇想、與眾不同");
                planet.setText("月亮、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍七55);
                break;
            case 56:
                cardname.setText("權杖七");
                keyword.setText("勇氣、挑戰、防禦、不要退縮");
                planet.setText("火星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖七56);
                break;
            case 57:
                cardname.setText("聖杯六");
                keyword.setText("依靠、安全、回憶與過去");
                planet.setText("太陽、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯六57);
                break;
            case 58:
                cardname.setText("錢幣六");
                keyword.setText("佈施、給與、滿足、寬大的");
                planet.setText("月亮、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣六58);
                break;
            case 59:
                cardname.setText("寶劍六");
                keyword.setText("療傷、帶著問題前行、遠離困境");
                planet.setText("水星、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍六59);
                break;
            case 60:
                cardname.setText("權杖六");
                keyword.setText("勝利、收穫、努力的成果");
                planet.setText("木星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖六60);
                break;
            case 61:
                cardname.setText("星星");
                keyword.setText("希望、被祝福、心想事成");
                planet.setText("天王星");
                elements.setText("風");
                meaning.setText(R.string.星星61);
                break;
            case 62:
                cardname.setText("力量");
                keyword.setText("意志、堅持、克制、意志力");
                planet.setText("太陽");
                elements.setText("火");
                meaning.setText(R.string.力量62);
                break;
            case 63:
                cardname.setText("太陽");
                keyword.setText("受祝福、純真、合諧");
                planet.setText("太陽");
                elements.setText("火");
                meaning.setText(R.string.太陽63);
                break;
            case 64:
                cardname.setText("節制");
                keyword.setText("淨化、交流、斟酌、漸入佳境");
                planet.setText("木星");
                elements.setText("火");
                meaning.setText(R.string.節制64);
                break;
            case 65:
                cardname.setText("聖杯十");
                keyword.setText("內心平靜、家人幸福、愛的喜悅");
                planet.setText("火星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯十65);
                break;
            case 66:
                cardname.setText("錢幣十");
                keyword.setText("繼承家業、家族繁榮、家風良好");
                planet.setText("水星、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣十66);
                break;
            case 67:
                cardname.setText("寶劍十");
                keyword.setText("希望絕滅、結束、極端、苛責");
                planet.setText("太陽、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍十67);
            case 68:
                cardname.setText("權杖十");
                keyword.setText("過重的負擔、壓迫感、勞累");
                planet.setText("土星、射手");
                elements.setText("火");
                meaning.setText(R.string.權杖十68);
                break;
            case 69:
                cardname.setText("聖杯三");
                keyword.setText("喜悅、一同慶祝、事情的解決");
                planet.setText("水星、巨蟹");
                elements.setText("水");
                meaning.setText(R.string.聖杯三69);
                break;
            case 70:
                cardname.setText("錢幣三");
                keyword.setText("討論、沈迷計劃、一步一步來");
                planet.setText("火星、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣三70);
                break;
            case 71:
                cardname.setText("寶劍三");
                keyword.setText("悲傷、分離、失去的愛");
                planet.setText("土星、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍三71);
                break;
            case 72:
                cardname.setText("權杖三");
                keyword.setText("遠見、旅行、探索新領域");
                planet.setText("太陽、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖三72);
                break;
            case 73:
                cardname.setText("高塔");
                keyword.setText("急速惡化、崩潰、意外、被連累");
                planet.setText("火星");
                elements.setText("火");
                meaning.setText(R.string.高塔73);
                break;
            case 74:
                cardname.setText("聖杯二");
                keyword.setText("真愛、平等、相互瞭解");
                planet.setText("金星、巨蟹");
                elements.setText("水");
                meaning.setText(R.string.聖杯二74);
                break;
            case 75:
                cardname.setText("錢幣二");
                keyword.setText("金錢流通、借貸投資、交流");
                planet.setText("木星、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣二75);
                break;
            case 76:
                cardname.setText("寶劍二");
                keyword.setText("謊言？實話？要睿智快刀斬亂麻");
                planet.setText("月亮、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍二76);
                break;
            case 77:
                cardname.setText("權杖二");
                keyword.setText("分析、掌握、成功而來的煩惱");
                planet.setText("火星、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖二77);
                break;
            case 78:
                cardname.setText("世界");
                keyword.setText("達成、完成後銜接的另一個開始");
                planet.setText("土星");
                elements.setText("土");
                meaning.setText(R.string.世界78);
                break;
//---------------------------逆位--------------------------------------------
            case 79:
                cardname.setText("聖杯一・逆位");
                keyword.setText("無愛意、喜悅中暗藏陰影");
                planet.setText("無");
                elements.setText("水");
                meaning.setText(R.string.聖杯_逆位79);
                break;
            case 80:
                cardname.setText("錢幣一・逆位");
                keyword.setText("失利、破財、慾望太深");
                planet.setText("無");
                elements.setText("土");
                meaning.setText(R.string.錢幣一_逆位80);
                break;
            case 81:
                cardname.setText("寶劍一・逆位");
                keyword.setText("失敗、引起爭端、事與願違");
                planet.setText("無");
                elements.setText("風");
                meaning.setText(R.string.寶劍一_逆位81);
                break;
            case 82:
                cardname.setText("權杖一・逆位");
                keyword.setText("錯誤的開始、衰弱、頹廢");
                planet.setText("無");
                elements.setText("火");
                meaning.setText(R.string.權杖一_逆位82);
                break;
            case 83:
                cardname.setText("戰車・逆位");
                keyword.setText("原地踏步、失敗、挫折多");
                planet.setText("月亮");
                elements.setText("水");
                meaning.setText(R.string.戰車_逆位83);
                break;
            case 84:
                cardname.setText("死神・逆位");
                keyword.setText("奇蹟地恢復、不確定、拋棄過去");
                planet.setText("冥王星");
                elements.setText("水");
                meaning.setText(R.string.死神_逆位84);
                break;
            case 85:
                cardname.setText("魔鬼・逆位");
                keyword.setText("擺脫老毛病、心情走出陰霾");
                planet.setText("土星");
                elements.setText("土");
                meaning.setText(R.string.魔鬼_逆位85);
                break;
            case 86:
                cardname.setText("聖杯八・逆位");
                keyword.setText("舊情復燃、欲走還留、停滯不前");
                planet.setText("土星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯八_逆位86);
                break;
            case 87:
                cardname.setText("錢幣八・逆位");
                keyword.setText("虛榮心、技能不足、心胸狹隘");
                planet.setText("太陽、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣八_逆位87);
                break;
            case 88:
                cardname.setText("寶劍八・逆位");
                keyword.setText("看清事實、解放、掙脫束縛");
                planet.setText("木星、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍八_逆位88);
                break;
            case 89:
                cardname.setText("權杖八・逆位");
                keyword.setText("失控、草率行動、欲速則不達");
                planet.setText("火星、射手");
                elements.setText("火");
                meaning.setText(R.string.權杖八_逆位89);
                break;
            case 90:
                cardname.setText("皇帝・逆位");
                keyword.setText("不負責、被人擺佈、被壓制");
                planet.setText("火星");
                elements.setText("火");
                meaning.setText(R.string.皇帝90_逆位);
                break;
            case 91:
                cardname.setText("女皇・逆位");
                keyword.setText("過度、失控、沒有結果的愛");
                planet.setText("金星");
                elements.setText("土/風");
                meaning.setText(R.string.女皇_逆位91);
                break;
            case 92:
                cardname.setText("聖杯五・逆位");
                keyword.setText("背叛、求解脫、得到改變");
                planet.setText("火星、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯五_逆位92);
                break;
            case 93:
                cardname.setText("錢幣五・逆位");
                keyword.setText("損失、短缺、貧窮");
                planet.setText("水星、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣五_逆位93);
                break;
            case 94:
                cardname.setText("寶劍五・逆位");
                keyword.setText("沒信心、爭執、惡意傷害");
                planet.setText("金星、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍五_逆位94);
                break;
            case 95:
                cardname.setText("權杖五・逆位");
                keyword.setText("衝突、混亂、受牽連");
                planet.setText("土星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖五_逆位95);
                break;
            case 96:
                cardname.setText("愚人・逆位");
                keyword.setText("無知、不安定的、盲目");
                planet.setText("天王星");
                elements.setText("風");
                meaning.setText(R.string.愚人_逆位96);
                break;
            case 97:
                cardname.setText("命運之輪・逆位");
                keyword.setText("逆勢、重複、曇花一現");
                planet.setText("木星");
                elements.setText("火");
                meaning.setText(R.string.命運之輪_逆位97);
                break;
            case 98:
                cardname.setText("聖杯四・逆位");
                keyword.setText("發現新目標、新的思考、增加機會");
                planet.setText("巨蟹、月亮");
                elements.setText("水");
                meaning.setText(R.string.聖杯四_逆位98);
                break;
            case 99:
                cardname.setText("錢幣四・逆位");
                keyword.setText("奢侈無度、覬覦、不滿足");
                planet.setText("太陽、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣四_逆位99);
                break;
            case 100:
                cardname.setText("寶劍四・逆位");
                keyword.setText("康復、獲得精力、重新再行動");
                planet.setText("木星、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍四_逆位100);
                break;
            case 101:
                cardname.setText("權杖四・逆位");
                keyword.setText("中斷、沒結果、不可靠");
                planet.setText("金星、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖四_逆位101);
                break;
            case 102:
                cardname.setText("吊人・逆位");
                keyword.setText("陷入困境、痛苦、犧牲");
                planet.setText("海王星");
                elements.setText("水");
                meaning.setText(R.string.吊人_逆位102);
                break;
            case 103:
                cardname.setText("隱士・逆位");
                keyword.setText("不被瞭解、隱瞞、不夠沈著");
                planet.setText("水星");
                elements.setText("土");
                meaning.setText(R.string.隱士_逆位103);
                break;
            case 104:
                cardname.setText("教皇・逆位");
                keyword.setText("保守、被孤立、精神疲憊");
                planet.setText("金星");
                elements.setText("土");
                meaning.setText(R.string.教皇104_逆位);
                break;
            case 105:
                cardname.setText("女祭司・逆位");
                keyword.setText("秘密、欠缺理解、不智");
                planet.setText("月亮");
                elements.setText("水");
                meaning.setText(R.string.女祭司_逆位105);
                break;
            case 106:
                cardname.setText("審判・逆位");
                keyword.setText("無法挽回、舉步維艱、幻滅");
                planet.setText("冥王星");
                elements.setText("水");
                meaning.setText(R.string.審判_逆位106);
                break;
            case 107:
                cardname.setText("正義・逆位");
                keyword.setText("不公平、單戀、偏見");
                planet.setText("金星");
                elements.setText("風");
                meaning.setText(R.string.正義_逆位107);
                break;
            case 108:
                cardname.setText("聖杯國王・逆位");
                keyword.setText("表裡不一、欺騙、欠缺道德");
                planet.setText("天蠍");
                elements.setText("水/土");
                meaning.setText(R.string.聖杯國王_逆位108);
                break;
            case 109:
                cardname.setText("錢幣國王・逆位");
                keyword.setText("貪婪的男人、盲從、危險關係");
                planet.setText("金牛");
                elements.setText("土/土");
                meaning.setText(R.string.錢幣國王_逆位109);
                break;
            case 110:
                cardname.setText("寶劍國王・逆位");
                keyword.setText("反覆無常的、批判、冷酷無情");
                planet.setText("水瓶");
                elements.setText("風/土");
                meaning.setText(R.string.寶劍國王_逆位110);
                break;
            case 111:
                cardname.setText("權杖國王・逆位");
                keyword.setText("太過嚴格、控制、獨斷");
                planet.setText("獅子");
                elements.setText("火/土");
                meaning.setText(R.string.權杖國王_逆位111);
                break;
            case 112:
                cardname.setText("聖杯騎士・逆位");
                keyword.setText("花心的人、陰險、行為不正");
                planet.setText("雙魚");
                elements.setText("水/火");
                meaning.setText(R.string.聖杯騎士_逆位112);
                break;
            case 113:
                cardname.setText("錢幣騎士・逆位");
                keyword.setText("倦怠、平庸、思想過於保守");
                planet.setText("處女");
                elements.setText("土/火");
                meaning.setText(R.string.聖杯侍者_逆位123);
                break;
            case 114:
                cardname.setText("寶劍騎士・逆位");
                keyword.setText("自負、輕率、固執己見");
                planet.setText("雙子");
                elements.setText("風/火");
                meaning.setText(R.string.寶劍騎士_逆位114);
                break;
            case 115:
                cardname.setText("權杖騎士・逆位");
                keyword.setText("中斷、偏執、突發的狀況");
                planet.setText("射手");
                elements.setText("火/火");
                meaning.setText(R.string.權杖騎士_逆位115);
                break;
            case 116:
                cardname.setText("戀人・逆位");
                keyword.setText("關係失和、分離、挫折");
                planet.setText("水星");
                elements.setText("風");
                meaning.setText(R.string.戀人_逆位116);
                break;
            case 117:
                cardname.setText("魔術師・逆位");
                keyword.setText("檢視、操弄、優柔寡斷");
                planet.setText("水星");
                elements.setText("風");
                meaning.setText(R.string.魔術師_逆位117);
                break;
            case 118:
                cardname.setText("月亮・逆位");
                keyword.setText("不安、迷惑、靜觀其變");
                planet.setText("海王星");
                elements.setText("水");
                meaning.setText(R.string.月亮_逆位118);
                break;
            case 119:
                cardname.setText("聖杯九・逆位");
                keyword.setText("獨善其身、破財、無法得到");
                planet.setText("木星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯九_逆位119);
                break;
            case 120:
                cardname.setText("錢幣九・逆位");
                keyword.setText("背信、失去魅力、荒廢計劃");
                planet.setText("金星、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣九_逆位120);
                break;
            case 121:
                cardname.setText("寶劍九・逆位");
                keyword.setText("謠言、中傷、忍耐痛苦、失去轉機");
                planet.setText("火星、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍九_逆位121);
                break;
            case 122:
                cardname.setText("權杖九・逆位");
                keyword.setText("有妨礙、不愉快的過去、逆境");
                planet.setText("月亮，射手");
                elements.setText("火");
                meaning.setText(R.string.權杖九_逆位122);
                break;
            case 123:
                cardname.setText("聖杯侍者・逆位");
                keyword.setText("阿諛奉承、懶散、貪圖享受");
                planet.setText("無");
                elements.setText("水/風");
                meaning.setText(R.string.聖杯侍者_逆位123);
                break;
            case 124:
                cardname.setText("錢幣侍者・逆位");
                keyword.setText("浪費精力、輕率、視野狹窄");
                planet.setText("無");
                elements.setText("土/風");
                meaning.setText(R.string.錢幣侍者_逆位124);
                break;
            case 125:
                cardname.setText("寶劍侍者・逆位");
                keyword.setText("沒預期到的變化、有漏洞");
                planet.setText("無");
                elements.setText("風/風");
                meaning.setText(R.string.寶劍侍者_逆位125);
                break;
            case 126:
                cardname.setText("權杖侍者・逆位");
                keyword.setText("不值得信賴、不安定、禍從口出");
                planet.setText("無");
                elements.setText("火/風");
                meaning.setText(R.string.權杖侍者_逆位126);
                break;
            case 127:
                cardname.setText("聖杯皇后・逆位");
                keyword.setText("情緒化的、自負、品行不良");
                planet.setText("巨蟹");
                elements.setText("水/水");
                meaning.setText(R.string.聖杯皇后_逆位127);
                break;
            case 128:
                cardname.setText("錢幣皇后・逆位");
                keyword.setText("虛榮心、表面的繁榮、被盤算");
                planet.setText("摩羯");
                elements.setText("土/水");
                meaning.setText(R.string.錢幣皇后_逆位128);
                break;
            case 129:
                cardname.setText("寶劍皇后・逆位");
                keyword.setText("心中有惡意、虛假、小心眼");
                planet.setText("天秤");
                elements.setText("風/水");
                meaning.setText(R.string.寶劍皇后_逆位129);
                break;
            case 130:
                cardname.setText("權杖皇后・逆位");
                keyword.setText("游移不定、有阻力、不被重視");
                planet.setText("牡羊");
                elements.setText("火/水");
                meaning.setText(R.string.權杖皇后_逆位130);
                break;
            case 131:
                cardname.setText("聖杯七・逆位");
                keyword.setText("覺悟、面對現實、堅強的意志");
                planet.setText("金星、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯七_逆位131);
                break;
            case 132:
                cardname.setText("錢幣七・逆位");
                keyword.setText("金錢損失、坐困愁城、無法順利");
                planet.setText("土星、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣七_逆位132);
                break;
            case 133:
                cardname.setText("寶劍七・逆位");
                keyword.setText("意想不到的好運、好壞各半");
                planet.setText("月亮、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍七_逆位133);
                break;
            case 134:
                cardname.setText("權杖七・逆位");
                keyword.setText("缺乏自信、困惑、懷疑自己");
                planet.setText("火星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖七_逆位134);
                break;
            case 135:
                cardname.setText("聖杯六・逆位");
                keyword.setText("回憶過去、陰影、新的展望");
                planet.setText("太陽、天蠍");
                elements.setText("水");
                meaning.setText(R.string.聖杯六_逆位135);
                break;
            case 136:
                cardname.setText("錢幣六・逆位");
                keyword.setText("貪得無饜、不均衡、羨慕");
                planet.setText("月亮、金牛");
                elements.setText("土");
                meaning.setText(R.string.錢幣六_逆位136);
                break;
            case 137:
                cardname.setText("寶劍六・逆位");
                keyword.setText("無路可走、現在沒有好對策");
                planet.setText("水星、水瓶");
                elements.setText("風");
                meaning.setText(R.string.寶劍六_逆位137);
                break;
            case 138:
                cardname.setText("權杖六・逆位");
                keyword.setText("驕傲、內部有敵人、不誠實");
                planet.setText("木星、獅子");
                elements.setText("火");
                meaning.setText(R.string.權杖六_逆位138);
                break;
            case 139:
                cardname.setText("星星・逆位");
                keyword.setText("失望、期望過高、無能為力");
                planet.setText("天王星");
                elements.setText("風");
                meaning.setText(R.string.星星_逆位139);
                break;
            case 140:
                cardname.setText("力量・逆位");
                keyword.setText("控制不了、退縮、軟弱");
                planet.setText("太陽");
                elements.setText("火");
                meaning.setText(R.string.力量_逆位140);
                break;
            case 141:
                cardname.setText("太陽・逆位");
                keyword.setText("志氣消沈、破碎的愛、惰性");
                planet.setText("太陽");
                elements.setText("火");
                meaning.setText(R.string.太陽_逆位141);
                break;
            case 142:
                cardname.setText("節制・逆位");
                keyword.setText("矛盾、消耗、白費心力");
                planet.setText("木星");
                elements.setText("火");
                meaning.setText(R.string.節制_逆位142);
                break;
            case 143:
                cardname.setText("聖杯十・逆位");
                keyword.setText("家庭失和、不安感、不和與對立");
                planet.setText("火星、雙魚");
                elements.setText("水");
                meaning.setText(R.string.聖杯十_逆位143);
                break;
            case 144:
                cardname.setText("錢幣十・逆位");
                keyword.setText("無祖先庇佑、與他人對立");
                planet.setText("水星、處女");
                elements.setText("土");
                meaning.setText(R.string.錢幣十_逆位144);
                break;
            case 145:
                cardname.setText("寶劍十・逆位");
                keyword.setText("一時的利益、隱藏的危機、極端");
                planet.setText("太陽、雙子");
                elements.setText("風");
                meaning.setText(R.string.寶劍十_逆位145);
                break;
            case 146:
                cardname.setText("權杖十・逆位");
                keyword.setText("陰謀、損失、逃避各種責任");
                planet.setText("土星、射手");
                elements.setText("火");
                meaning.setText(R.string.權杖十_逆位146);
                break;
            case 147:
                cardname.setText("聖杯三・逆位");
                keyword.setText("放縱慾望、快樂中帶痛苦、樂極生悲");
                planet.setText("水星、巨蟹");
                elements.setText("水");
                meaning.setText(R.string.聖杯三_逆位147);
                break;
            case 148:
                cardname.setText("錢幣三・逆位");
                keyword.setText("計畫之外、能力不足、不聽他人勸告");
                planet.setText("火星、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣三_逆位148);
                break;
            case 149:
                cardname.setText("寶劍三・逆位");
                keyword.setText("疏遠、衝突爭吵、無法放開");
                planet.setText("土星、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍三_逆位149);
                break;
            case 150:
                cardname.setText("權杖三・逆位");
                keyword.setText("自作主張、濫用權力、計劃不周");
                planet.setText("太陽、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖三_逆位150);
                break;
            case 151:
                cardname.setText("高塔・逆位");
                keyword.setText("暴風雨前的寧靜、緊張狀態");
                planet.setText("火星");
                elements.setText("火");
                meaning.setText(R.string.高塔_逆位151);
                break;
            case 152:
                cardname.setText("聖杯二・逆位");
                keyword.setText("虛偽的戀情、對立、互相猜忌");
                planet.setText("金星、巨蟹");
                elements.setText("水");
                meaning.setText(R.string.聖杯二_逆位152);
                break;
            case 153:
                cardname.setText("錢幣二・逆位");
                keyword.setText("表面爽朗、用錢過度、浪費成癖");
                planet.setText("木星、摩羯");
                elements.setText("土");
                meaning.setText(R.string.錢幣二_逆位153);
                break;
            case 154:
                cardname.setText("寶劍二・逆位");
                keyword.setText("虛偽、雙重人格、注意損友");
                planet.setText("月亮、天秤");
                elements.setText("風");
                meaning.setText(R.string.寶劍二_逆位154);
                break;
            case 155:
                cardname.setText("權杖二・逆位");
                keyword.setText("悲嘆、猶豫、無從選擇");
                planet.setText("火星、牡羊");
                elements.setText("火");
                meaning.setText(R.string.權杖二_逆位155);
                break;
            case 156:
                cardname.setText("世界・逆位");
                keyword.setText("無疾而終、勞燕分飛、無從選擇");
                planet.setText("土星");
                elements.setText("土");
                meaning.setText(R.string.世界_逆位156);
                break;
            default:
                cardname.setText("未選擇");
                keyword.setText("未選擇");
                planet.setText("未選擇");
                elements.setText("未選擇");
        }




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


        im_result.setImageResource(imageArray[number1]);


    }

}
