package com.test.monir.frogjump;

import android.app.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class GamePage extends Activity implements View.OnClickListener {

    int[] b = {1,2,3,0,5,6,7};
    int U,L,bTemp,buttonNo,vx,cnt;




    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);

        imageView1 = (ImageView) findViewById(R.id.one);
        imageView1.setBackgroundResource(R.drawable.frog_1);

        imageView2 = (ImageView) findViewById(R.id.two);
        imageView2.setBackgroundResource(R.drawable.frog_2);

        imageView3 = (ImageView) findViewById(R.id.three);
        imageView3.setBackgroundResource(R.drawable.frog_3);


        imageView4 = (ImageView) findViewById(R.id.four);
        imageView4.setBackgroundResource(R.drawable.blank);

        imageView5 = (ImageView) findViewById(R.id.five);
        imageView5.setBackgroundResource(R.drawable.frog_5);

        imageView6 = (ImageView) findViewById(R.id.six);
        imageView6.setBackgroundResource(R.drawable.frog_6);

        imageView7 = (ImageView) findViewById(R.id.seven);
        imageView7.setBackgroundResource(R.drawable.frog_7);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);


        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(this);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_page, menu);
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

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.reset)
        {

            imageView1.setBackgroundResource(R.drawable.frog_1);
            imageView2.setBackgroundResource(R.drawable.frog_2);
            imageView3.setBackgroundResource(R.drawable.frog_3);
            imageView4.setBackgroundResource(R.drawable.blank);
            imageView5.setBackgroundResource(R.drawable.frog_5);
            imageView6.setBackgroundResource(R.drawable.frog_6);
            imageView7.setBackgroundResource(R.drawable.frog_7);
            //int[] b = {1,2,3,0,5,6,7};

            b[0]=1;
            b[1]=2;
            b[2]=3;
            b[3]=0;
            b[4]=5;
            b[5]=6;
            b[6]=7;
        }


        //Toast.makeText(getApplicationContext(),""+L,Toast.LENGTH_LONG).show();
     //   Log.e("" + L, "Lower");
       // Log.e(""+U,"Upper");


        if(v.getId()==R.id.one)
        {

            if(b[0]==1 || b[0]==2 || b[0]==3)
            {
                L=0;
                U=0+2;
            }
            else if(b[0]==5 || b[0]==6 || b[0]==6)
            {
                L=0-2;
                U=0;
            }


            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();


            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[0];
                        b[0]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView1.setBackgroundResource(R.drawable.blank);
                        check();


                    }
                }
            }

        }

        if(v.getId()==R.id.two)
        {
           // Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
            //L=1-2;
            //U=1+2;

            if(b[1]==1 || b[1]==2 || b[1]==3)
            {
                L=1;
                U=1+2;
            }

            else if(b[1]==5 || b[1]==6 || b[1]==7)
            {
                L=1-2;
                U=1;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[1];
                        b[1]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView2.setBackgroundResource(R.drawable.blank);

                        check();
                    }
                }
            }

        }



        if(v.getId()==R.id.three)
        {
            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
           // L=2-2;
            //U=2+2;

            if(b[2]==1 || b[2]==2 || b[2]==3)
            {
                L=2;
                U=2+2;
            }
            else if(b[2]==5 || b[2]==6 || b[2]==7)
            {
                L=2-2;
                U=2;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[2];
                        b[2]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView3.setBackgroundResource(R.drawable.blank);

                        check();


                    }
                }
            }

        }

        if(v.getId()==R.id.four)
        {
            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
           // L=3-2;
           // U=3+2;

            if(b[3]==1 || b[3]==2 || b[3]==3)
            {
                L=3;
                U=3+2;
            }
            else if(b[3]==5 || b[3]==6 || b[3]==7)
            {
                L=3-2;
                U=3;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[3];
                        b[3]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView4.setBackgroundResource(R.drawable.blank);

                        check();


                    }
                }
            }

        }

        if(v.getId()==R.id.five)
        {
            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
            //L=4-2;
           // U=4+2;

            if(b[4]==1 || b[4]==2 || b[4]==3)
            {
                L=4;
                U=4+2;
            }
            else if(b[4]==5 || b[4]==6 || b[4]==7)
            {
                L=4-2;
                U=4;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[4];
                        b[4]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView5.setBackgroundResource(R.drawable.blank);

                        check();


                    }
                }
            }

        }

        if(v.getId()==R.id.six)
        {
            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
           // L=5-2;
           // U=5+2;

            if(b[5]==1 || b[5]==2 || b[5]==3)
            {
                L=5;
                U=5+2;
            }
            else if(b[5]==5 || b[5]==6 || b[5]==7)
            {
                L=5-2;
                U=5;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[5];
                        b[5]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView6.setBackgroundResource(R.drawable.blank);

                        check();


                    }
                }
            }

        }

        if(v.getId()==R.id.seven)
        {
            //Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_LONG).show();
            //L=2-2;
           // U=2+2;

            if(b[6]==1 || b[6]==2 || b[6]==3)
            {
                L=6;
                U=6+2;
            }

            else if(b[6]==5 || b[6]==6 || b[6]==7)
            {
                L=6-2;
                U=6;
            }

            for(int i=L;i<=U;i++)
            {
                if(i>=0 && i<=6)
                {
                    if(b[i]==0)
                    {
                        vx=i;
                        b[i]=b[6];
                        b[6]=0;
                        bTemp=b[i];
                        buttonNo=i+1;
                        set();

                        imageView7.setBackgroundResource(R.drawable.blank);

                        check();


                    }
                }
            }

        }








    }



    private void check() {

        cnt=0;

        if(b[0]==5 || b[0]==6 || b[0]==7)
        {
            cnt++;
        }
        if(b[1]==5 || b[1]==6 || b[1]==7)
        {
            cnt++;
        }

        if(b[2]==5 || b[2]==6 || b[2]==7)
        {
            cnt++;
        }

        if(b[4]==1 || b[4]==2 || b[4]==3)
        {
            cnt++;
        }

        if(b[5]==1 || b[5]==2 || b[5]==3)
        {
            cnt++;
        }

        if(b[6]==1 || b[6]==2 || b[6]==3)
        {
            cnt++;
        }

        if(cnt==6)
        {
            //Toast.makeText(getApplicationContext(),"Congratulation",Toast.LENGTH_LONG).show();

            LayoutInflater layoutInflater = LayoutInflater.from(this);

            View promptView = layoutInflater.inflate(R.layout.prompts, null);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            alertDialogBuilder.setView(promptView);

            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("NO",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,	int id) {
                                    dialog.cancel();

                                    finish();
                                }
                            });


            AlertDialog alertD = alertDialogBuilder.create();

            alertD.show();



        }




    }

    private void set() {

        if (buttonNo == 1) {
            if (bTemp == 1) {
                imageView1.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView1.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView1.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView1.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView1.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView1.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView1.setBackgroundResource(R.drawable.frog_7);
            }
        }


        else if (buttonNo == 2) {
            if (bTemp == 1) {
                imageView2.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView2.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView2.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView2.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView2.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView2.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView2.setBackgroundResource(R.drawable.frog_7);
            }
        }

        else if (buttonNo == 3) {
            if (bTemp == 1) {
                imageView3.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView3.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView3.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView3.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView3.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView3.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView3.setBackgroundResource(R.drawable.frog_7);
            }
        }

        if (buttonNo == 4) {
            if (bTemp == 1) {
                imageView4.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView4.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView4.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView4.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView4.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView4.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView4.setBackgroundResource(R.drawable.frog_7);
            }
        }

        if (buttonNo == 5) {
            if (bTemp == 1) {
                imageView5.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView5.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView5.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView5.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView5.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView5.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView5.setBackgroundResource(R.drawable.frog_7);
            }
        }

        if (buttonNo == 6) {
            if (bTemp == 1) {
                imageView6.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView6.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView6.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView6.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView6.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView6.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView6.setBackgroundResource(R.drawable.frog_7);
            }
        }

        if (buttonNo == 7) {
            if (bTemp == 1) {
                imageView7.setBackgroundResource(R.drawable.frog_1);
            } else if (bTemp == 2)

            {
                imageView7.setBackgroundResource(R.drawable.frog_2);
            } else if (bTemp == 3) {
                imageView7.setBackgroundResource(R.drawable.frog_3);
            } else if (bTemp == 4) {
                imageView7.setBackgroundResource(R.drawable.blank);
            } else if (bTemp == 5) {
                imageView7.setBackgroundResource(R.drawable.frog_5);
            } else if (bTemp == 6) {
                imageView7.setBackgroundResource(R.drawable.frog_6);
            } else if (bTemp == 7) {
                imageView7.setBackgroundResource(R.drawable.frog_7);
            }
        }



    }
}
