package af.apps.android.moslslat.AdaptersClass;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import af.apps.android.moslslat.ImageRes;
import af.apps.android.moslslat.Items1activity;
import af.apps.android.moslslat.R;

/**
 * Created by X201 on 10/11/2016.
 */

  public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Context context;
    ImageRes ir;
    Integer images[];
    String plcaenmaeRes[];

    public MainAdapter(Context icontext) {
        this.context=icontext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {//Variables mainadapter.xml

       // LinearLayout mainholdre;
        ImageView imageView;//placeimage
       // LinearLayout placenameholder;
        TextView textView;//placename


        public ViewHolder(View itemView) {
            super(itemView);
            ir = new ImageRes();
            images = ir.imagemainres;//get from ImageRes Class-> imagemainres Array
        //    mainholdre = (LinearLayout)itemView.findViewById(R.id.mainholdre);
            imageView = (ImageView) itemView.findViewById(R.id.placeImage);
        //    placenameholder = (LinearLayout)itemView.findViewById(R.id.placeNameHolder);
            textView = (TextView)itemView.findViewById(R.id.placeName);
            //get from res/value/strings.xml->string-array(mainstring)
            plcaenmaeRes = itemView.getResources().getStringArray(R.array.mainstring);
        }
    }//End Holder

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {//Get Layout Xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mainadapter_activity,parent,false);
        return new ViewHolder(v);
    }//End ViewHolder

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
    holder.textView.setText(plcaenmaeRes[position]);
    holder.imageView.setImageResource(images[position]);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0:
                        Intent i0 = new Intent(context, Items1activity.class);
                        context.startActivity(i0);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        ImageRes gic = new ImageRes();
        return gic.imagemainres.length;
    }
}
