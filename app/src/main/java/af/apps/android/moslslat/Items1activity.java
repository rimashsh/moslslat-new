package af.apps.android.moslslat;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import af.apps.android.moslslat.AdaptersClass.Adapteritem1;

public class Items1activity extends ActionBarActivity {
    RecyclerView recyclerView;
    StaggeredGridLayoutManager st;
    Adapteritem1 adapteritem1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items1activity);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview1i);
        st = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        adapteritem1 = new Adapteritem1(this);
        recyclerView.setLayoutManager(st);
        recyclerView.setAdapter(adapteritem1);
    }
}
