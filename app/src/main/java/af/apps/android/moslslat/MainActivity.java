package af.apps.android.moslslat;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import af.apps.android.moslslat.AdaptersClass.MainAdapter;

public class MainActivity extends AppCompatActivity {

    public StaggeredGridLayoutManager staggeredGridLayoutManager;
    public MainAdapter adapter;
    public RecyclerView recyclerView;
    public Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview1);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        adapter = new MainAdapter(this);
        recyclerView.setAdapter(adapter);

    }
   //menu options
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menu_cancel){
            System.exit(0);
        finish();}
        if (id==R.id.menu_share){
            shareApp();
        }
        return super.onOptionsItemSelected(item);
    }
  //end menu options
    //Create menu_item.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.meun_item,menu);

        this.menu=menu;
        return true;
    }

    private void shareApp() {

            String url = "http://c.top4top.net/m_47p9ft1.mp3";//test url
            Intent es = new Intent(Intent.ACTION_SEND);
            es.setType("text/plain");
            es.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
            es.putExtra(Intent.EXTRA_SUBJECT,"Share Link");
            es.putExtra(Intent.EXTRA_TEXT,url );
            startActivity(Intent.createChooser(es,"شارك التطبيق الان"));
    }

    private void exite() {
    AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.AlertDialog);
        builder.setCancelable(true);
        builder.setMessage("هل تريد الخروج ؟");
        builder.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            System.exit(0);
                finish();
            }
        });
        builder.setNegativeButton("لا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
        builder.create();
    }//End exit method

    @Override
    public void onBackPressed() {
        exite();

    }
}
