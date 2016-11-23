package at.fh.swengb.vee.cacheliste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<GeoCache> listGeoCache;
    private ListView myListView;
    private CustomAdapter myAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView=(ListView)findViewById(R.id.myGeoCacheList);

        listGeoCache=new ArrayList<>();
        listGeoCache.add(new GeoCache("Kapelle am Gniebingberg","meisterYoda","Tradi","2/1,5"));
        listGeoCache.add(new GeoCache("Strahlungsturm","Luckyweizmartin","Tradi","1,5/3"));
        listGeoCache.add(new GeoCache("Steiles Stück","Chrisstmk85","Tradi","3/1,5"));
        listGeoCache.add(new GeoCache("Drei Bahnhöfe","verica4b,neisti","Multi","2/2,5"));
        listGeoCache.add(new GeoCache("Alround-Talent","verica4b","Mystery","2/4"));
        listGeoCache.add(new GeoCache("Opok","beagotchi","EarthCache","1,5/1,5"));

        myAdapter=new CustomAdapter(this,listGeoCache);
        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        GeoCache selectedCache = listGeoCache.get(i);
        Intent intent = new Intent(view.getContext(),ShowCacheActivity.class);
        intent.putExtra("geoCache",selectedCache);
        startActivity(intent);

    }
}
