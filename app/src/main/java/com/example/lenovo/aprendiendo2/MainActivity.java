package com.example.lenovo.aprendiendo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Toast mensaje;
    Button linear,linearh,relative,table,frame,list,grid;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear=(Button)findViewById(R.id.linearV);
        linearh = (Button)findViewById(R.id.linerH);
        relative = (Button)findViewById(R.id.relative);
        table = (Button)findViewById(R.id.table);
        frame = (Button)findViewById(R.id.frame);
        list = (Button) findViewById(R.id.list);
        grid = (Button) findViewById(R.id.grid) ;

        linear.setOnClickListener(this);
        linearh.setOnClickListener(this);
        relative.setOnClickListener(this);
        table.setOnClickListener(this);
        frame.setOnClickListener(this);
        list.setOnClickListener(this);
        grid.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.linearV:
                 intent = new Intent(MainActivity.this,SegundoActivity.class);
                startActivity(intent);
                break;
            case R.id.linerH:
                intent = new Intent(MainActivity.this,HorizontalActivity.class);
                startActivity(intent);
                break;
            case R.id.relative:
                intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
                break;
            case R.id.table:
                intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
                break;
            case R.id.frame:
                intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
                break;
            case R.id.list:
                intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                break;
            case R.id.grid:
                intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
                break;

        }
    }
}
