package af.apps.android.moslslat.AdaptersClass;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import af.apps.android.moslslat.ImageRes;
import af.apps.android.moslslat.Items1activity;
import af.apps.android.moslslat.R;

/**
 * Created by X201 on 10/29/2016.
 */

   public class Adapteritem1 extends RecyclerView.Adapter<Adapteritem1.ViewHolder> {

    private Context context;
    private ImageRes getimage;
    private String textres[];
    private Integer imageres[];

    public Adapteritem1(Context mcontext) {
        this.context = mcontext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1;
        TextView textView1;
        public ViewHolder(View itemView) {
            super(itemView);
            getimage = new ImageRes();
            imageres = getimage.imageitem1res;
            image1 = (ImageView)itemView.findViewById(R.id.placeImage);
            textView1 = (TextView)itemView.findViewById(R.id.placeName);
            textres = itemView.getResources().getStringArray(R.array.stringarrayitem1);
        }
    }

    @Override
    public Adapteritem1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mainadapter_activity,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(Adapteritem1.ViewHolder holder, final int position) {
   holder.textView1.setText(textres[position]);
   holder.image1.setImageResource(imageres[position]);
    }
    @Override
    public int getItemCount() {
        ImageRes g = new ImageRes();
        return g.imageitem1res.length;
    }

}
