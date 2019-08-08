package br.edu.ifsc.aula08_08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida", "OnStart");
        Toast.makeText(MainActivity.this,"Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de vida","OnPause");
        Toast.makeText(MainActivity.this,"Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de vida","OnStop");
        Toast.makeText(MainActivity.this,"Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de vida","OnDestroy");
        Toast.makeText(MainActivity.this,"Destroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de vida","OnResume");
        Toast.makeText(MainActivity.this,"Resume", Toast.LENGTH_LONG).show();
    }
}
