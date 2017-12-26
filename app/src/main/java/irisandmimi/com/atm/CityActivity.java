package irisandmimi.com.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        ListView city = (ListView)findViewById(R.id.city);
        String[] cities = {"新北市","基隆市","台北市"};
        ArrayAdapter adapter = new ArrayAdapter(this
                , android.R.layout.simple_list_item_1
                , cities);
        city.setAdapter(adapter);
    }
}
