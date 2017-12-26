package irisandmimi.com.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {
    private Spinner spCty;
    private Spinner spArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        spCty = (Spinner)findViewById(R.id.sp_cty);
        spArea = (Spinner)findViewById(R.id.sp_area);
        ArrayAdapter adapter = new ArrayAdapter(this
                , android.R.layout.simple_expandable_list_item_1
                , new String[]{"A","B","C"}
        );
        spCty.setAdapter(adapter);
        spCty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String[] data = null;
                if (position ==0){
                    data = new String[]{"1","2"};
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
