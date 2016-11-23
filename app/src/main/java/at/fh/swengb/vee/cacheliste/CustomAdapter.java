package at.fh.swengb.vee.cacheliste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vee on 22.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<GeoCache> listGeoCache;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext,List<GeoCache> listGeoCache){
        this.context=applicationContext;
        this.listGeoCache=listGeoCache;
        inflter=(LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return listGeoCache.size();
    }

    @Override
    public Object getItem(int i) {
        return listGeoCache.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewOwner=(TextView)view.findViewById(R.id.textViewListO);
        TextView viewType=(TextView)view.findViewById(R.id.textViewListT);


        GeoCache geoCache = listGeoCache.get(i);
        viewName.setText(geoCache.getName());
        viewOwner.setText(geoCache.getOwner());
        viewType.setText(geoCache.getType());


        return view;
    }

}
