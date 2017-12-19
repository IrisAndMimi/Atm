package irisandmimi.com.atm;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UserInfoActivity extends AppCompatActivity {
    EditText edUsrnam;
    EditText edUsrph;
    private static final String TAG = UserInfoActivity.class.getSimpleName();
    private Spinner ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
       ages = (Spinner)findViewById(R.id.ages);
        ArrayList<String>data = new ArrayList<>();
//        for (int i = 15; i<=40; i++){
//            data.add(i+"");
//        }
//        String[]data = getResources().getStringArray(R.array.ages);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.ages, android.R.layout.simple_list_item_1);
        ages.setAdapter(adapter);
    }
    public void ok(View view){
        Log.d(TAG, "ok:"+ ages.getSelectedItem().toString());
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
