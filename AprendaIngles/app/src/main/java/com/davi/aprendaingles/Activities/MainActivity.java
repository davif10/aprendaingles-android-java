package com.davi.aprendaingles.Activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.davi.aprendaingles.Fragments.BichosFragment;
import com.davi.aprendaingles.Fragments.NumerosFragment;
import com.davi.aprendaingles.Fragments.VogaisFragment;
import com.davi.aprendaingles.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurações actionBar

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda Inglês");

        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewpager);

////////////Criando o Adapter///////////////////
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment.class)
                .add("Números", NumerosFragment.class)
                .add("Vogais", VogaisFragment.class)
                .create()
        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
