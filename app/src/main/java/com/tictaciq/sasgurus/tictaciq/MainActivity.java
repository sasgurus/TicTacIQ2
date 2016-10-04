package com.tictaciq.sasgurus.tictaciq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
  boolean pTurn;  // variable to check if it is the player's turn

  int pMoves = 0;  // count the moves of the player, will be incremented each time player plays
  int[] pChoice = {10, 10, 10, 10, 10};  // set the default moves of the player max moves are 5
  int[][] winComb = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 5, 9}, {1, 4, 7}, {2, 5, 8}, {3, 5, 7}, {3, 6, 9}}; // winning combinations

  /*int[][] winComb = new int[20][];
  winComb[0][] = {1, 2, 3};
  winComb[1][] = {4, 5, 6};
  winComb[2][] = {7, 8, 9};
  winComb[3][] = {1, 5, 9};
  winComb[4][] = {1, 4, 7};
  winComb[5][] = {2, 5, 8};
  winComb[6][] = {3, 5, 7};
  winComb[7][] = {3, 6, 9};*/


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      b1 = (Button) findViewById(R.id.b1);
      b2 = (Button) findViewById(R.id.b2);
      b3 = (Button) findViewById(R.id.b3);
      b4 = (Button) findViewById(R.id.b4);
      b5 = (Button) findViewById(R.id.b5);
      b6 = (Button) findViewById(R.id.b6);
      b7 = (Button) findViewById(R.id.b7);
      b8 = (Button) findViewById(R.id.b8);
      b9 = (Button) findViewById(R.id.b9);

      pTurn = true;
      final TextView resultView = (TextView) findViewById(R.id.checkView);

      b1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          // check if it is player's turn
          if(b1.getText().toString().equals("")) {
            if (pTurn) {
              //b1.setText("X" + pChoice);
              pChoice[pMoves] = 1; // overwrite the initial value of the pChoice array
              String displayText;
              displayText = "X" + pChoice[pMoves];
              //b1.setText(displayText);
              b1.setText(Arrays.toString(pChoice));

              resultView.setText(displayText);

              pMoves++;              // increment pMoves
              System.out.println("1");
              pTurn = false;         // change turn
            } else {
              b1.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b2.getText().toString().equals("")) {
            if (pTurn) {
              //b2.setText("X"+ pChoice);
              pChoice[pMoves] = 2;
              String displayText;
              displayText = "X" + pChoice;
              //b2.setText(displayText);
              resultView.setText(displayText);
              b2.setText(Arrays.toString(pChoice));
              pTurn = false;
              pMoves++;
            } else {
              b2.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b3.getText().toString().equals("")) {
            if (pTurn) {
              //b3.setText("X" + pChoice);
              pChoice[pMoves] = 3;
              String displayText;
              displayText = "X" + pChoice;
              //b3.setText(displayText);
              b3.setText(Arrays.toString(pChoice));
              pTurn = false;
              pMoves++;
            } else {
              b3.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b4.getText().toString().equals("")) {
            if (pTurn) {
              //b4.setText("X" + pChoice);
              pChoice[pMoves] = 4;
              String displayText;
              displayText = "X" + pChoice;
              b4.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b4.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b5.getText().toString().equals("")) {
            if (pTurn) {
              //b5.setText("X" + pChoice);
              pChoice[pMoves] = 5;
              String displayText;
              displayText = "X" + pChoice;
              b5.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b5.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b6.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b6.getText().toString().equals("")) {
            if (pTurn) {
              pChoice[pMoves] = 6;
              //b6.setText("X" + pChoice);
              String displayText;
              displayText = "X" + pChoice;
              b6.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b6.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b7.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b7.getText().toString().equals("")) {
            if (pTurn) {
              pChoice[pMoves] = 7;
              //b7.setText("X" + pChoice);
              String displayText;
              displayText = "X" + pChoice;
              b7.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b7.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b8.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b8.getText().toString().equals("")) {
            if (pTurn) {
              pChoice[pMoves] = 8;
              //b8.setText("X" + pChoice);
              String displayText;
              displayText = "X" + pChoice;
              b8.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b8.setText("O");
              pTurn = true;
            }
          }
        }
      });

      b9.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
          if(b9.getText().toString().equals("")) {
            if (pTurn) {
              pChoice[pMoves] = 9;
              String displayText;
              displayText = "X" + pChoice;
              b9.setText(displayText);
              pTurn = false;
              pMoves++;
            } else {
              b9.setText("O");
              pTurn = true;
            }
          }
        }
      });

    /*
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show();
      }
    });
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

    return super.onOptionsItemSelected(item); */
  }
}
