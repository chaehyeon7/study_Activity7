package kr.hs.emirim.chaehyeon.study_activity7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Dialog dialog;
    Button btn_ok,btn_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btn_ok = findViewById(R.id.btn_yes)

    }

    //뒤로가기 버튼 클릭 감지

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //다이얼로그 생성
        dialog = new Dialog( MainActivity.this);
        dialog.setContentView(R.layout.my_dialog);

        btn_ok = dialog.findViewById(R.id.btn_yes);
        btn_no = dialog.findViewById(R.id.btn_no);

        btn_ok.setOnClickListener(click);
        btn_no.setOnClickListener(click);

        dialog.setTitle("app name");

        //show()메서드를 호출하지 않으면 다이얼로그가 화면에 노출되지 않는다.
        dialog.show();

    }//onBackPressed

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_yes:
                    //앱(액티비티)종료
                    finish();
                    break;
                case R.id.btn_no:
                    //다이얼로그 취소
                    dialog.dismiss();
                    break;
            }
        }
    };
}