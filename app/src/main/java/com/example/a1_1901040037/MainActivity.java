package com.example.a1_1901040037;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHiragana();

        Button btnHiragana = findViewById(R.id.btnHiragana);
        btnHiragana.setOnClickListener(view -> initHiragana());
        Button btnKatakana = findViewById(R.id.btnKatakana);
        btnKatakana.setOnClickListener(view -> initKatakana());
    }

    private void  initKatakana(){
        TextView textView = findViewById(R.id.txtViewAlphabet);
        textView.setText(R.string.katakana);

        ImageButton a = findViewById(R.id.a);
        a.setImageResource(R.drawable.a);
        a.setAlpha(0f);
        a.animate().alpha(1f).setDuration(600);
        a.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
            mediaPlayer.start();
        });
        ImageButton i = findViewById(R.id.i);
        i.setImageResource(R.drawable.i);
        i.setAlpha(0f);
        i.animate().alpha(1f).setDuration(600);
        i.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
            mediaPlayer.start();
        });
        ImageButton u = findViewById(R.id.u);
        u.setImageResource(R.drawable.u);
        u.setAlpha(0f);
        u.animate().alpha(1f).setDuration(600);
        u.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
            mediaPlayer.start();
        });
        ImageButton e = findViewById(R.id.e);
        e.setImageResource(R.drawable.e);
        e.setAlpha(0f);
        e.animate().alpha(1f).setDuration(600);
        e.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
            mediaPlayer.start();
        });
        ImageButton o = findViewById(R.id.o);
        o.setImageResource(R.drawable.o);
        o.setAlpha(0f);
        o.animate().alpha(1f).setDuration(600);
        o.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
            mediaPlayer.start();
        });
        ImageButton ka = findViewById(R.id.ka);
        ka.setImageResource(R.drawable.ka);
        ka.setAlpha(0f);
        ka.animate().alpha(1f).setDuration(600);
        ka.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
            mediaPlayer.start();
        });
        ImageButton ki = findViewById(R.id.ki);
        ki.setImageResource(R.drawable.ki);
        ki.setAlpha(0f);
        ki.animate().alpha(1f).setDuration(600);
        ki.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
            mediaPlayer.start();
        });
        ImageButton ku = findViewById(R.id.ku);
        ku.setImageResource(R.drawable.ku);
        ku.setAlpha(0f);
        ku.animate().alpha(1f).setDuration(600);
        ku.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
            mediaPlayer.start();
        });
        ImageButton ke = findViewById(R.id.ke);
        ke.setImageResource(R.drawable.ke);
        ke.setAlpha(0f);
        ke.animate().alpha(1f).setDuration(600);
        ke.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
            mediaPlayer.start();
        });
        ImageButton ko = findViewById(R.id.ko);
        ko.setImageResource(R.drawable.ko);
        ko.setAlpha(0f);
        ko.animate().alpha(1f).setDuration(600);
        ko.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
            mediaPlayer.start();
        });
        ImageButton sa = findViewById(R.id.sa);
        sa.setImageResource(R.drawable.sa);
        sa.setAlpha(0f);
        sa.animate().alpha(1f).setDuration(600);
        sa.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
            mediaPlayer.start();
        });
        ImageButton shi = findViewById(R.id.shi);
        shi.setImageResource(R.drawable.shi);
        shi.setAlpha(0f);
        shi.animate().alpha(1f).setDuration(600);
        shi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
            mediaPlayer.start();
        });
        ImageButton su = findViewById(R.id.su);
        su.setImageResource(R.drawable.su);
        su.setAlpha(0f);
        su.animate().alpha(1f).setDuration(600);
        su.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
            mediaPlayer.start();
        });
        ImageButton se = findViewById(R.id.se);
        se.setImageResource(R.drawable.se);
        se.setAlpha(0f);
        se.animate().alpha(1f).setDuration(600);
        se.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
            mediaPlayer.start();
        });
        ImageButton so = findViewById(R.id.so);
        so.setImageResource(R.drawable.so);
        so.setAlpha(0f);
        so.animate().alpha(1f).setDuration(600);
        so.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
            mediaPlayer.start();
        });
        ImageButton ta = findViewById(R.id.ta);
        ta.setImageResource(R.drawable.ta);
        ta.setAlpha(0f);
        ta.animate().alpha(1f).setDuration(600);
        ta.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
            mediaPlayer.start();
        });
        ImageButton chi = findViewById(R.id.chi);
        chi.setImageResource(R.drawable.chi);
        chi.setAlpha(0f);
        chi.animate().alpha(1f).setDuration(600);
        chi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
            mediaPlayer.start();
        });
        ImageButton tsu = findViewById(R.id.tsu);
        tsu.setImageResource(R.drawable.tsu);
        tsu.setAlpha(0f);
        tsu.animate().alpha(1f).setDuration(600);
        tsu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
            mediaPlayer.start();
        });
        ImageButton te = findViewById(R.id.te);
        te.setImageResource(R.drawable.te);
        te.setAlpha(0f);
        te.animate().alpha(1f).setDuration(600);
        te.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
            mediaPlayer.start();
        });
        ImageButton to = findViewById(R.id.to);
        to.setImageResource(R.drawable.to);
        to.setAlpha(0f);
        to.animate().alpha(1f).setDuration(600);
        to.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
            mediaPlayer.start();
        });
        ImageButton na = findViewById(R.id.na);
        na.setImageResource(R.drawable.na);
        na.setAlpha(0f);
        na.animate().alpha(1f).setDuration(600);
        na.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
            mediaPlayer.start();
        });
        ImageButton ni = findViewById(R.id.ni);
        ni.setImageResource(R.drawable.ni);
        ni.setAlpha(0f);
        ni.animate().alpha(1f).setDuration(600);
        ni.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
            mediaPlayer.start();
        });
        ImageButton nu = findViewById(R.id.nu);
        nu.setImageResource(R.drawable.nu);
        nu.setAlpha(0f);
        nu.animate().alpha(1f).setDuration(600);
        nu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
            mediaPlayer.start();
        });
        ImageButton ne = findViewById(R.id.ne);
        ne.setImageResource(R.drawable.ne);
        ne.setAlpha(0f);
        ne.animate().alpha(1f).setDuration(600);
        ne.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
            mediaPlayer.start();
        });
        ImageButton no = findViewById(R.id.no);
        no.setImageResource(R.drawable.no);
        no.setAlpha(0f);
        no.animate().alpha(1f).setDuration(600);
        no.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
            mediaPlayer.start();
        });
        ImageButton ha = findViewById(R.id.ha);
        ha.setImageResource(R.drawable.ha);
        ha.setAlpha(0f);
        ha.animate().alpha(1f).setDuration(600);
        ha.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
            mediaPlayer.start();
        });
        ImageButton hi = findViewById(R.id.hi);
        hi.setImageResource(R.drawable.hi);
        hi.setAlpha(0f);
        hi.animate().alpha(1f).setDuration(600);
        hi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
            mediaPlayer.start();
        });
        ImageButton fu = findViewById(R.id.fu);
        fu.setImageResource(R.drawable.fu);
        fu.setAlpha(0f);
        fu.animate().alpha(1f).setDuration(600);
        fu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
            mediaPlayer.start();
        });
        ImageButton he = findViewById(R.id.he);
        he.setImageResource(R.drawable.he);
        he.setAlpha(0f);
        he.animate().alpha(1f).setDuration(600);
        he.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
            mediaPlayer.start();
        });
        ImageButton ho = findViewById(R.id.ho);
        ho.setImageResource(R.drawable.ho);
        ho.setAlpha(0f);
        ho.animate().alpha(1f).setDuration(600);
        ho.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
            mediaPlayer.start();
        });
        ImageButton ma = findViewById(R.id.ma);
        ma.setImageResource(R.drawable.ma);
        ma.setAlpha(0f);
        ma.animate().alpha(1f).setDuration(600);
        ma.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
            mediaPlayer.start();
        });
        ImageButton mi = findViewById(R.id.mi);
        mi.setImageResource(R.drawable.mi);
        mi.setAlpha(0f);
        mi.animate().alpha(1f).setDuration(600);
        mi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
            mediaPlayer.start();
        });
        ImageButton mu = findViewById(R.id.mu);
        mu.setImageResource(R.drawable.mu);
        mu.setAlpha(0f);
        mu.animate().alpha(1f).setDuration(600);
        mu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
            mediaPlayer.start();
        });
        ImageButton me = findViewById(R.id.me);
        me.setImageResource(R.drawable.me);
        me.setAlpha(0f);
        me.animate().alpha(1f).setDuration(600);
        me.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
            mediaPlayer.start();
        });
        ImageButton mo = findViewById(R.id.mo);
        mo.setImageResource(R.drawable.mo);
        mo.setAlpha(0f);
        mo.animate().alpha(1f).setDuration(600);
        mo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
            mediaPlayer.start();
        });
        ImageButton ya = findViewById(R.id.ya);
        ya.setImageResource(R.drawable.ya);
        ya.setAlpha(0f);
        ya.animate().alpha(1f).setDuration(600);
        ya.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
            mediaPlayer.start();
        });
        ImageButton yu = findViewById(R.id.yu);
        yu.setImageResource(R.drawable.yu);
        yu.setAlpha(0f);
        yu.animate().alpha(1f).setDuration(600);
        yu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
            mediaPlayer.start();
        });
        ImageButton yo = findViewById(R.id.yo);
        yo.setImageResource(R.drawable.yo);
        yo.setAlpha(0f);
        yo.animate().alpha(1f).setDuration(600);
        yo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
            mediaPlayer.start();
        });
        ImageButton ra = findViewById(R.id.ra);
        ra.setImageResource(R.drawable.ra);
        ra.setAlpha(0f);
        ra.animate().alpha(1f).setDuration(600);
        ra.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
            mediaPlayer.start();
        });
        ImageButton ri = findViewById(R.id.ri);
        ri.setImageResource(R.drawable.ri);
        ri.setAlpha(0f);
        ri.animate().alpha(1f).setDuration(600);
        ri.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
            mediaPlayer.start();
        });
        ImageButton ru = findViewById(R.id.ru);
        ru.setImageResource(R.drawable.ru);
        ru.setAlpha(0f);
        ru.animate().alpha(1f).setDuration(600);
        ru.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
            mediaPlayer.start();
        });
        ImageButton re = findViewById(R.id.re);
        re.setImageResource(R.drawable.re);
        re.setAlpha(0f);
        re.animate().alpha(1f).setDuration(600);
        re.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
            mediaPlayer.start();
        });
        ImageButton ro = findViewById(R.id.ro);
        ro.setImageResource(R.drawable.ro);
        ro.setAlpha(0f);
        ro.animate().alpha(1f).setDuration(600);
        ro.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
            mediaPlayer.start();
        });
        ImageButton wa = findViewById(R.id.wa);
        wa.setImageResource(R.drawable.wa);
        wa.setAlpha(0f);
        wa.animate().alpha(1f).setDuration(600);
        wa.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
            mediaPlayer.start();
        });
        ImageButton wo = findViewById(R.id.wo);
        wo.setImageResource(R.drawable.wo);
        wo.setAlpha(0f);
        wo.animate().alpha(1f).setDuration(600);
        wo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
            mediaPlayer.start();
        });
        ImageButton n = findViewById(R.id.n);
        n.setImageResource(R.drawable.n);
        n.setAlpha(0f);
        n.animate().alpha(1f).setDuration(600);
        n.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
            mediaPlayer.start();
        });
    }

    private void initHiragana(){
        TextView textView = findViewById(R.id.txtViewAlphabet);
        textView.setText(R.string.hiragana);

        ImageButton a = findViewById(R.id.a);
        a.setImageResource(R.drawable.a1);
        a.setAlpha(0f);
        a.animate().alpha(1f).setDuration(600);
        a.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
            mediaPlayer.start();
        });
        ImageButton i = findViewById(R.id.i);
        i.setImageResource(R.drawable.i1);
        i.setAlpha(0f);
        i.animate().alpha(1f).setDuration(600);
        i.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
            mediaPlayer.start();
        });
        ImageButton u = findViewById(R.id.u);
        u.setImageResource(R.drawable.u1);
        u.setAlpha(0f);
        u.animate().alpha(1f).setDuration(600);
        u.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
            mediaPlayer.start();
        });
        ImageButton e = findViewById(R.id.e);
        e.setImageResource(R.drawable.e1);
        e.setAlpha(0f);
        e.animate().alpha(1f).setDuration(600);
        e.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
            mediaPlayer.start();
        });
        ImageButton o = findViewById(R.id.o);
        o.setImageResource(R.drawable.o1);
        o.setAlpha(0f);
        o.animate().alpha(1f).setDuration(600);
        o.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
            mediaPlayer.start();
        });
        ImageButton ka = findViewById(R.id.ka);
        ka.setImageResource(R.drawable.ka1);
        ka.setAlpha(0f);
        ka.animate().alpha(1f).setDuration(600);
        ka.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
            mediaPlayer.start();
        });
        ImageButton ki = findViewById(R.id.ki);
        ki.setImageResource(R.drawable.ki1);
        ki.setAlpha(0f);
        ki.animate().alpha(1f).setDuration(600);
        ki.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
            mediaPlayer.start();
        });
        ImageButton ku = findViewById(R.id.ku);
        ku.setImageResource(R.drawable.ku1);
        ku.setAlpha(0f);
        ku.animate().alpha(1f).setDuration(600);
        ku.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
            mediaPlayer.start();
        });
        ImageButton ke = findViewById(R.id.ke);
        ke.setImageResource(R.drawable.ke1);
        ke.setAlpha(0f);
        ke.animate().alpha(1f).setDuration(600);
        ke.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
            mediaPlayer.start();
        });
        ImageButton ko = findViewById(R.id.ko);
        ko.setImageResource(R.drawable.ko1);
        ko.setAlpha(0f);
        ko.animate().alpha(1f).setDuration(600);
        ko.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
            mediaPlayer.start();
        });
        ImageButton sa = findViewById(R.id.sa);
        sa.setImageResource(R.drawable.sa1);
        sa.setAlpha(0f);
        sa.animate().alpha(1f).setDuration(600);
        sa.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
            mediaPlayer.start();
        });
        ImageButton shi = findViewById(R.id.shi);
        shi.setImageResource(R.drawable.shi1);
        shi.setAlpha(0f);
        shi.animate().alpha(1f).setDuration(600);
        shi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
            mediaPlayer.start();
        });
        ImageButton su = findViewById(R.id.su);
        su.setImageResource(R.drawable.su1);
        su.setAlpha(0f);
        su.animate().alpha(1f).setDuration(600);
        su.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
            mediaPlayer.start();
        });
        ImageButton se = findViewById(R.id.se);
        se.setImageResource(R.drawable.se1);
        se.setAlpha(0f);
        se.animate().alpha(1f).setDuration(600);
        se.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
            mediaPlayer.start();
        });
        ImageButton so = findViewById(R.id.so);
        so.setImageResource(R.drawable.so1);
        so.setAlpha(0f);
        so.animate().alpha(1f).setDuration(600);
        so.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
            mediaPlayer.start();
        });
        ImageButton ta = findViewById(R.id.ta);
        ta.setImageResource(R.drawable.ta1);
        ta.setAlpha(0f);
        ta.animate().alpha(1f).setDuration(600);
        ta.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
            mediaPlayer.start();
        });
        ImageButton chi = findViewById(R.id.chi);
        chi.setImageResource(R.drawable.chi1);
        chi.setAlpha(0f);
        chi.animate().alpha(1f).setDuration(600);
        chi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
            mediaPlayer.start();
        });
        ImageButton tsu = findViewById(R.id.tsu);
        tsu.setImageResource(R.drawable.tsu1);
        tsu.setAlpha(0f);
        tsu.animate().alpha(1f).setDuration(600);
        tsu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
            mediaPlayer.start();
        });
        ImageButton te = findViewById(R.id.te);
        te.setImageResource(R.drawable.te1);
        te.setAlpha(0f);
        te.animate().alpha(1f).setDuration(600);
        te.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
            mediaPlayer.start();
        });
        ImageButton to = findViewById(R.id.to);
        to.setImageResource(R.drawable.to1);
        to.setAlpha(0f);
        to.animate().alpha(1f).setDuration(600);
        to.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
            mediaPlayer.start();
        });
        ImageButton na = findViewById(R.id.na);
        na.setImageResource(R.drawable.na1);
        na.setAlpha(0f);
        na.animate().alpha(1f).setDuration(600);
        na.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
            mediaPlayer.start();
        });
        ImageButton ni = findViewById(R.id.ni);
        ni.setImageResource(R.drawable.ni1);
        ni.setAlpha(0f);
        ni.animate().alpha(1f).setDuration(600);
        ni.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
            mediaPlayer.start();
        });
        ImageButton nu = findViewById(R.id.nu);
        nu.setImageResource(R.drawable.nu1);
        nu.setAlpha(0f);
        nu.animate().alpha(1f).setDuration(600);
        nu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
            mediaPlayer.start();
        });
        ImageButton ne = findViewById(R.id.ne);
        ne.setImageResource(R.drawable.ne1);
        ne.setAlpha(0f);
        ne.animate().alpha(1f).setDuration(600);
        ne.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
            mediaPlayer.start();
        });
        ImageButton no = findViewById(R.id.no);
        no.setImageResource(R.drawable.no1);
        no.setAlpha(0f);
        no.animate().alpha(1f).setDuration(600);
        no.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
            mediaPlayer.start();
        });
        ImageButton ha = findViewById(R.id.ha);
        ha.setImageResource(R.drawable.ha1);
        ha.setAlpha(0f);
        ha.animate().alpha(1f).setDuration(600);
        ha.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
            mediaPlayer.start();
        });
        ImageButton hi = findViewById(R.id.hi);
        hi.setImageResource(R.drawable.hi1);
        hi.setAlpha(0f);
        hi.animate().alpha(1f).setDuration(600);
        hi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
            mediaPlayer.start();
        });
        ImageButton fu = findViewById(R.id.fu);
        fu.setImageResource(R.drawable.fu1);
        fu.setAlpha(0f);
        fu.animate().alpha(1f).setDuration(600);
        fu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
            mediaPlayer.start();
        });
        ImageButton he = findViewById(R.id.he);
        he.setImageResource(R.drawable.he1);
        he.setAlpha(0f);
        he.animate().alpha(1f).setDuration(600);
        he.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
            mediaPlayer.start();
        });
        ImageButton ho = findViewById(R.id.ho);
        ho.setImageResource(R.drawable.ho1);
        ho.setAlpha(0f);
        ho.animate().alpha(1f).setDuration(600);
        ho.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
            mediaPlayer.start();
        });
        ImageButton ma = findViewById(R.id.ma);
        ma.setImageResource(R.drawable.ma1);
        ma.setAlpha(0f);
        ma.animate().alpha(1f).setDuration(600);
        ma.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
            mediaPlayer.start();
        });
        ImageButton mi = findViewById(R.id.mi);
        mi.setImageResource(R.drawable.mi1);
        mi.setAlpha(0f);
        mi.animate().alpha(1f).setDuration(600);
        mi.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
            mediaPlayer.start();
        });
        ImageButton mu = findViewById(R.id.mu);
        mu.setImageResource(R.drawable.mu1);
        mu.setAlpha(0f);
        mu.animate().alpha(1f).setDuration(600);
        mu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
            mediaPlayer.start();
        });
        ImageButton me = findViewById(R.id.me);
        me.setImageResource(R.drawable.me1);
        me.setAlpha(0f);
        me.animate().alpha(1f).setDuration(600);
        me.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
            mediaPlayer.start();
        });
        ImageButton mo = findViewById(R.id.mo);
        mo.setImageResource(R.drawable.mo1);
        mo.setAlpha(0f);
        mo.animate().alpha(1f).setDuration(600);
        mo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
            mediaPlayer.start();
        });
        ImageButton ya = findViewById(R.id.ya);
        ya.setImageResource(R.drawable.ya1);
        ya.setAlpha(0f);
        ya.animate().alpha(1f).setDuration(600);
        ya.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
            mediaPlayer.start();
        });
        ImageButton yu = findViewById(R.id.yu);
        yu.setImageResource(R.drawable.yu1);
        yu.setAlpha(0f);
        yu.animate().alpha(1f).setDuration(600);
        yu.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
            mediaPlayer.start();
        });
        ImageButton yo = findViewById(R.id.yo);
        yo.setImageResource(R.drawable.yo1);
        yo.setAlpha(0f);
        yo.animate().alpha(1f).setDuration(600);
        yo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
            mediaPlayer.start();
        });
        ImageButton ra = findViewById(R.id.ra);
        ra.setImageResource(R.drawable.ra1);
        ra.setAlpha(0f);
        ra.animate().alpha(1f).setDuration(600);
        ra.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
            mediaPlayer.start();
        });
        ImageButton ri = findViewById(R.id.ri);
        ri.setImageResource(R.drawable.ri1);
        ri.setAlpha(0f);
        ri.animate().alpha(1f).setDuration(600);
        ri.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
            mediaPlayer.start();
        });
        ImageButton ru = findViewById(R.id.ru);
        ru.setImageResource(R.drawable.ru1);
        ru.setAlpha(0f);
        ru.animate().alpha(1f).setDuration(600);
        ru.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
            mediaPlayer.start();
        });
        ImageButton re = findViewById(R.id.re);
        re.setImageResource(R.drawable.re1);
        re.setAlpha(0f);
        re.animate().alpha(1f).setDuration(600);
        re.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
            mediaPlayer.start();
        });
        ImageButton ro = findViewById(R.id.ro);
        ro.setImageResource(R.drawable.ro1);
        ro.setAlpha(0f);
        ro.animate().alpha(1f).setDuration(600);
        ro.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
            mediaPlayer.start();
        });
        ImageButton wa = findViewById(R.id.wa);
        wa.setImageResource(R.drawable.wa1);
        wa.setAlpha(0f);
        wa.animate().alpha(1f).setDuration(600);
        wa.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
            mediaPlayer.start();
        });
        ImageButton wo = findViewById(R.id.wo);
        wo.setImageResource(R.drawable.wo1);
        wo.setAlpha(0f);
        wo.animate().alpha(1f).setDuration(600);
        wo.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
            mediaPlayer.start();
        });
        ImageButton n = findViewById(R.id.n);
        n.setImageResource(R.drawable.n1);
        n.setAlpha(0f);
        n.animate().alpha(1f).setDuration(600);
        n.setOnClickListener(view -> {
            if(mediaPlayer!= null) mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
            mediaPlayer.start();
        });
    }
}