package irisandmimi.com.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        EditText edUsrid = (EditText)findViewById(R.id.userid);
        EditText edPaswd = (EditText)findViewById(R.id.passwd);
        String userid = edUsrid.getText().toString();
        String passwd = edPaswd.getText().toString();
        if("mimi".equals(userid) && "8787".equals(passwd)){
            Toast.makeText(this,"登入成功", Toast.LENGTH_LONG).show();
            getIntent().putExtra("LOGIN_USERID",userid);
            getIntent().putExtra("LOGIN_PASSWD", passwd);
            setResult(RESULT_OK,getIntent());
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("登入")
                    .setMessage("登入失敗")
                    .setPositiveButton("Ok",null)
                    .show();
        }

    }

}
