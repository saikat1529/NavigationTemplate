package com.saikat.mymac.farm;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        navigationView = (NavigationView)findViewById(R.id.drawerItems);

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        navigationView.getMenu().getItem(0).setChecked(true);

//        if(getIntent().hasExtra("rid")){
//            String recipe_id =  getIntent().getStringExtra("rid");
//            mFragmentTransaction.replace(R.id.containerView, new RecipeTab(MainActivity.this, recipe_id)).commit();
//            navigationView.getMenu().getItem(0).setChecked(true);
//        }
//        else if(getIntent().hasExtra("cid")){
//            String category_id = getIntent().getStringExtra("cid");
//            mFragmentTransaction.replace(R.id.containerView, new CategorizedRecipe(MainActivity.this, category_id)).commit();
//            navigationView.getMenu().getItem(1).setChecked(true);
//        }
//        else {
//
//            mFragmentTransaction.replace(R.id.containerView, new AllRecipe(MainActivity.this)).commit();
//            navigationView.getMenu().getItem(0).setChecked(true);
//        }


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                drawerLayout.closeDrawers();
                if (item.getItemId() == R.id.menu_collection) {
//                    FragmentTransaction transaction = mFragmentManager.beginTransaction();
//                    transaction.replace(R.id.containerView, new AllRecipe(MainActivity.this)).commit();
//                    navigationView.getMenu().getItem(0).setChecked(true);
                }
                if (item.getItemId() == R.id.menu_food) {
//                    FragmentTransaction transaction = mFragmentManager.beginTransaction();
//                    transaction.replace(R.id.containerView, new Category(MainActivity.this)).commit();
//                    navigationView.getMenu().getItem(1).setChecked(true);
                }
                if (item.getItemId() == R.id.menu_medicine) {
//                    FragmentTransaction transaction = mFragmentManager.beginTransaction();
//                    transaction.replace(R.id.containerView, new Feedback(MainActivity.this)).commit();
//                    navigationView.getMenu().getItem(2).setChecked(true);
                }
                if (item.getItemId() == R.id.menu_sale) {
//                    FragmentTransaction transaction = mFragmentManager.beginTransaction();
//                    transaction.replace(R.id.containerView, new About(MainActivity.this)).commit();
//                    navigationView.getMenu().getItem(3).setChecked(true);
                }
                return true;
            }
        });



        /**
         * Setup Drawer Toggle of the Toolbar
         */
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.app_name,
                R.string.app_name);
        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
