package com.example.krzysztof.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a1,a2,a3,b1,b2,b3,c1,c2,c3;
    int player =1;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
//        while (true){
//            click(view);
//
//        }
        click(this.view);
    }
    void changePlayer(){
        if(player==1)
            player=2;
        else
            player=1;
    }
    void Init(){
        a1=(Button)findViewById(R.id.a1);
        a2=(Button)findViewById(R.id.a2);
        a3=(Button)findViewById(R.id.a3);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        c1=(Button)findViewById(R.id.c1);
        c2=(Button)findViewById(R.id.c2);
        c3=(Button)findViewById(R.id.c3);
        this.view=this.findViewById(android.R.id.content);
    }
    void click(View view){
        switch (view.getId()){
            case (R.id.a1):{
                setPlayerSign(a1);
                break;
            }
            case (R.id.a2):{
                setPlayerSign(a2);
                break;
            }
            case (R.id.a3):{
                setPlayerSign(a3);
                break;
            }
            case (R.id.b1):{
                setPlayerSign(b1);
                break;
            }
            case (R.id.b2):{
                setPlayerSign(b2);
                break;
            }
            case (R.id.b3):{
                setPlayerSign(b3);
                break;
            }
            case (R.id.c1):{
                setPlayerSign(c1);
                break;
            }
            case (R.id.c2):{
                setPlayerSign(c2);
                break;
            }
            case (R.id.c3):{
                setPlayerSign(c3);
                break;
            }
        }
    }

    void setPlayerSign(Button button ){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player==1){
                    a1.setText("O");
                    changePlayer();
                }else if (player==2){
                    a1.setText("X");
                    changePlayer();
                }
            }
        });

    }


}
