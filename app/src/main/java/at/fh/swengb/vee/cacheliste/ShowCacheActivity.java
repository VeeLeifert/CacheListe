package at.fh.swengb.vee.cacheliste;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Vee on 22.11.2016.
 */
public class ShowCacheActivity extends AppCompatActivity {


    private GeoCache geoCache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_geocache);

        Intent intent = getIntent();
        geoCache = (GeoCache) intent.getExtras().get("geoCache");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewOwner = (TextView) findViewById(R.id.textViewOwner);
        TextView viewType = (TextView) findViewById(R.id.textViewType);
        TextView viewTD = (TextView) findViewById(R.id.textViewTD);

        viewName.setText("Name: "+geoCache.getName());
        viewOwner.setText("Owner: "+geoCache.getOwner());
        viewType.setText("Type: "+geoCache.getType());
        viewTD.setText("Terrain and Difficulty: "+geoCache.getTerrainAndDifficulty());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("http://www.geocaching.com");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }


}
