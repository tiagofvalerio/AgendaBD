package br.edu.ifspsaocarlos.agendabd.activity;

import android.app.Activity;
import android.os.Bundle;

import br.edu.ifspsaocarlos.agendabd.R;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRecylerView(null);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        setupRecylerView(null);
    }
}
