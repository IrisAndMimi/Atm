package irisandmimi.com.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends AppCompatActivity {
    EditText edUsrnam;
    EditText edUsrph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void ok(View view){
        edUsrnam = (EditText)findViewById(R.id.user_name);
        edUsrph = (EditText)findViewById(R.id.user_phone);
        String nicknam = edUsrnam.getText().toString();
        String phone = edUsrph.getText().toString();
        getIntent().putExtra("EXTRA_NICKNAME", nicknam);
        getIntent().putExtra("EXTRA_PHONE", phone);
        setResult(RESULT_OK, getIntent());
        finish();
    }

}
