package com.positivo.rafaellcarloss.apppositivo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.SwitchDrawerItem;
import com.mikepenz.materialdrawer.model.ToggleDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.model.interfaces.OnCheckedChangeListener;
import com.positivo.rafaellcarloss.apppositivo.Fragments.CarteiraFragment;
import com.positivo.rafaellcarloss.apppositivo.Fragments.MenuFragment;
import com.positivo.rafaellcarloss.apppositivo.Fragments.Teste;

public class MainActivity extends AppCompatActivity {


    private Drawer.Result navigationDrawerLeft;
    private AccountHeader.Result headerNavigationLeft;
    private Toolbar mToolbar;
    private int mPositionClicked;
    private int mItemDrawerSelected;


    private OnCheckedChangeListener mOnCheckedChangeListener = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(IDrawerItem iDrawerItem, CompoundButton compoundButton, boolean b) {
            Toast.makeText(MainActivity.this, "onCheckedChanged: " + (b ? "true" : "false"), Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = (Toolbar) findViewById(R.id.tb_main);
        mToolbar.setTitle("Positivo Recarga");
        mToolbar.setSubtitle("Faça sua recarga diária");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(mToolbar);


        Fragment frag = frag = new MenuFragment();


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.rl_fragment_container, frag);
        ft.addToBackStack("");
        ft.commit();


        headerNavigationLeft = new AccountHeader()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withThreeSmallProfileImages(true)
                .withHeaderBackground(R.color.colorPrimary)
                .addProfiles(
                        new ProfileDrawerItem().withName("Rafael Carlos").withEmail("rafaelcarlosrc2014@gmail.com").withIcon(getResources().getDrawable(R.mipmap.ic_usuario_preto)),
                        new ProfileDrawerItem().withName("Armando").withEmail("armandopositivo@gmail.com").withIcon(getResources().getDrawable(R.mipmap.ic_usuario_preto))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile iProfile, boolean b) {
                        Toast.makeText(MainActivity.this, "onProfileChanged: " + iProfile.getName(), Toast.LENGTH_SHORT).show();
                        headerNavigationLeft.setBackgroundRes(R.color.colorPrimary);
                        return false;
                    }
                })
                .build();

        navigationDrawerLeft = new Drawer()
                .withActivity(this)
                .withToolbar(mToolbar)
                .withDisplayBelowToolbar(false)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.LEFT)
                .withSavedInstance(savedInstanceState)
                .withSelectedItem(0)
                .withActionBarDrawerToggle(true)
                .withAccountHeader(headerNavigationLeft)
                    /*.withOnDrawerNavigationListener(new Drawer.OnDrawerNavigationListener() {
                        @Override
                        public boolean onNavigationClickListener(View view) {
                            return false;
                        }
                    })*/
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {

                        Fragment frag = null;


                        if (i == 0) {
                            frag = new MenuFragment();
                            mToolbar.setTitle("Home");
                        } else if (i == 1) {
                            frag = new CarteiraFragment();
                            mToolbar.setTitle("Recarga Grátis");
                        } else if (i == 2) {
                            mToolbar.setTitle("Minha Carteira");
                        } else {
                            mToolbar.setTitle("Shopping");

                        }

                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.rl_fragment_container, frag);
                        ft.addToBackStack(null);
                        ft.commit();
//                        Fragment frag = null;
//                        mItemDrawerSelected = i;
//
//                        if (i == 0) {
//                            frag = new MenuFragment();
//                        } else if (i == 1) {
//                            frag = new MenuFragment();
//                        }
//
//                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                        ft.replace(R.id.rl_fragment_container, frag);
//                        ft.addToBackStack(null);
//                        ft.commit();


                        for (int count = 0, tam = navigationDrawerLeft.getDrawerItems().size(); count < tam; count++) {
                            if (count == mPositionClicked && mPositionClicked <= 3) {
                                PrimaryDrawerItem aux = (PrimaryDrawerItem) navigationDrawerLeft.getDrawerItems().get(count);
                                aux.setIcon(getResources().getDrawable(getCorretcDrawerIcon(count, false)));
                                break;
                            }
                        }

                        if (i <= 3) {
                            ((PrimaryDrawerItem) iDrawerItem).setIcon(getResources().getDrawable(getCorretcDrawerIcon(i, true)));
                        }

                        mPositionClicked = i;
                        navigationDrawerLeft.getAdapter().notifyDataSetChanged();
                    }
                })
                .withOnDrawerItemLongClickListener(new Drawer.OnDrawerItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
                        Toast.makeText(MainActivity.this, "onItemLongClick: " + i, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                })
                .build();

        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Home").withIcon(getResources().getDrawable(R.mipmap.ic_home)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Recarga Grátis").withIcon(getResources().getDrawable(R.mipmap.ic_cifrao)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Minha Carteira").withIcon(getResources().getDrawable(R.mipmap.ic_carteira)));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Shopping").withIcon(getResources().getDrawable(R.mipmap.ic_carrinho)));
        navigationDrawerLeft.addItem(new SectionDrawerItem().withName("Configurações"));
        navigationDrawerLeft.addItem(new SwitchDrawerItem().withName("Notificação").withChecked(true).withOnCheckedChangeListener(mOnCheckedChangeListener));
        navigationDrawerLeft.addItem(new ToggleDrawerItem().withName("News").withChecked(true).withOnCheckedChangeListener(mOnCheckedChangeListener));


    }

    private int getCorretcDrawerIcon(int position, boolean isSelecetd) {
        switch (position) {
            case 0:
                return (isSelecetd ? R.mipmap.ic_home : R.mipmap.ic_home);
            case 1:
                return (isSelecetd ? R.mipmap.ic_cifrao : R.mipmap.ic_cifrao);
            case 2:
                return (isSelecetd ? R.mipmap.ic_carteira : R.mipmap.ic_carteira);
            case 3:
                return (isSelecetd ? R.mipmap.ic_carrinho : R.mipmap.ic_carrinho);
        }
        return (0);
    }


    @Override
    public void onBackPressed() {
        if (navigationDrawerLeft.isDrawerOpen()) {
            navigationDrawerLeft.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState = navigationDrawerLeft.saveInstanceState(outState);
        outState = headerNavigationLeft.saveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
