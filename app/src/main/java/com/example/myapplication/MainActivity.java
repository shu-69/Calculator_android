package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.widget.Button;
import android.widget.TextView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button AC;
    Button bckspc;
    Button per;
    Button div;
    Button mul;
    Button sub;
    Button add;
    Button equal;
    Button pm;
    Button dec;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;

    static float inp1 = 0.0F;
    static float inp2 = 0.0F;
    static float ansf;
    static int count = 1 ;
    static int prevans = 0;
    static float prevansF = 0.00F;
    static String temps = "";
    static boolean checkdec = false;
    //static int ansi;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons && TextView declaration :

        b1 = (Button) findViewById(R.id.butt1);
        b2 = (Button) findViewById(R.id.butt2);
        b3 = (Button) findViewById(R.id.butt3);
        b4 = (Button) findViewById(R.id.butt4);
        b5 = (Button) findViewById(R.id.butt5);
        b6 = (Button) findViewById(R.id.butt6);
        b7 = (Button) findViewById(R.id.butt7);
        b8 = (Button) findViewById(R.id.butt8);
        b9 = (Button) findViewById(R.id.butt9);
        b0 = (Button) findViewById(R.id.butt0);
        AC = (Button) findViewById(R.id.Acbutt);
        bckspc = (Button) findViewById(R.id.backspbutt);
        per = (Button) findViewById(R.id.perbutt);
        div = (Button) findViewById(R.id.divbutt);
        mul = (Button) findViewById(R.id.mulbutt);
        sub = (Button) findViewById(R.id.subbutt);
        add = (Button) findViewById(R.id.addbutt);
        equal = (Button) findViewById(R.id.equbutt);
        pm = (Button) findViewById(R.id.btnpm);
        dec = (Button) findViewById(R.id.buttdec);
        t1 = (TextView) findViewById(R.id.txtview1);
        t2 = (TextView) findViewById(R.id.txtview2);
        t3 = (TextView) findViewById(R.id.txtview3);
        t4 = (TextView) findViewById(R.id.txtview4);
        t5 = (TextView) findViewById(R.id.txtview5);
        t6 = (TextView) findViewById(R.id.txtview6);
        t7 = (TextView) findViewById(R.id.txtview7);
        t8 = (TextView) findViewById(R.id.txtview8);
        t9 = (TextView) findViewById(R.id.txtview9);


        // AC action performed
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("0");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                count = 1;
            }
        });

        // b1 action performed
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("1");
                } else
                    t1.append("1");
            }
        });
        // b2 action performed
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("2");
                } else
                    t1.append("2");
            }
        });
        // b3 action performed
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("3");
                } else
                    t1.append("3");
            }
        });
        // b4 action performed
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("4");
                } else
                    t1.append("4");
            }
        });
        // b5 action performed
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("5");
                } else
                    t1.append("5");
            }
        });
        // b6 action performed
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("6");
                } else
                    t1.append("6");
            }
        });
        // b7 action performed
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("7");
                } else
                    t1.append("7");
            }
        });
        // b8 action performed
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("8");
                } else
                    t1.append("8");
            }
        });
        // b9 action performed
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("9");
                } else
                    t1.append("9");
            }
        });
        // b0 action performed
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("0".equals(String.valueOf(t1.getText()))) {
                    t1.setText("0");
                } else
                    t1.append("0");
            }
        });
        // plusminus action performed
        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                if ( "".equals(String.valueOf(str)) ){
                    t1.setText("-");
                } else if ( str.charAt(0) == '-' ){
                    str.deleteCharAt(0);
                    t1.setText(String.valueOf(str));
                } else{
                    str = new StringBuffer( "-" + str ) ;
                    t1.setText(String.valueOf(str));
                }
            }
        });
        // dec action performed
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                if ( checkdec == false ){
                    str = new StringBuffer(str + ".");
                    t1.setText(String.valueOf(str));
                    checkdec = true;
                }


            }
        });
        // bckspc action performed
        bckspc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(String.valueOf(t1.getText())))) {
                    StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                    str = str.deleteCharAt(str.length() - 1);
                    t1.setText(str);
                }
                for ( int i=0; i<String.valueOf(t1.getText()).length(); i++ ){
                    if ( String.valueOf(t1.getText()).charAt(i) == '.' ){
                        checkdec = true;
                        break;
                    }else checkdec = false;
                }
            }
        });
        // per action performed
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(String.valueOf(t1.getText())))) {
                    try {
                        String str = String.valueOf(t1.getText());
                        int numi = Integer.parseInt(str);
                        if (numi % 100 == 0) {
                            numi = numi / 100;
                            t1.setText(String.valueOf(numi));
                        } else {
                            float numf = Float.parseFloat(str);
                            numf = numf / 100;
                            t1.setText(String.valueOf(numf));
                        }

                    } catch (NumberFormatException e) {
                    }
                }
            }
        });
        // div action performed
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(String.valueOf(t1.getText())))) {
                    if ( !("-".equals(String.valueOf(t1.getText()))) ){
                        StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                        if (str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '+') {
                            str.deleteCharAt(str.length() - 1);
                            str.append("÷");
                            t1.setText(String.valueOf(str));
                        } else {
                            t1.setText(str + "÷");
                        }
                        checkdec = false;
                    }
                }
            }
        });
        // mul action performed
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(String.valueOf(t1.getText())))) {
                    if ( !("-".equals(String.valueOf(t1.getText()))) ){
                        StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                        if (str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '+') {
                            str.deleteCharAt(str.length() - 1);
                            str.append("×");
                            t1.setText(String.valueOf(str));
                        } else {
                            t1.setText(str + "×");
                        }
                        checkdec = false;
                    }
                }
            }
        });
        // sub action performed
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!("".equals(String.valueOf(t1.getText())))) {
                    if ( !("-".equals(String.valueOf(t1.getText()))) ){
                        StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                        if (str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '+') {
                            str.deleteCharAt(str.length() - 1);
                            str.append("-");
                            t1.setText(String.valueOf(str));
                        } else {
                            t1.setText(str + "-");
                        }
                        checkdec = false;
                    }
                }
            }
        });
        // add action performed
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(String.valueOf(t1.getText())))) {
                    if ( !("-".equals(String.valueOf(t1.getText()))) ){
                        StringBuffer str = new StringBuffer(String.valueOf(t1.getText()));
                        if (str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '+') {
                            str.deleteCharAt(str.length() - 1);
                            str.append("+");
                            t1.setText(String.valueOf(str));
                        } else {
                            t1.setText(str + "+");
                        }
                        checkdec = false;
                    }
                }
            }
        });
        // Equal action performed
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( ! (String.valueOf(t1.getText()).equals("") || String.valueOf(t1.getText()).equals("0")) ){
                    try {
                        String str = String.valueOf(t1.getText());
                        Vector vcElements = new Vector();
                        Vector vcOperator = new Vector();
                        Float ans = 0.00F;
                        // For adding elements in vector
                        String elements = "";
                        for ( int i=0; i<str.length(); i++ ){
                            if (str.charAt(i) == '÷' || str.charAt(i) == '×' || str.charAt(i) == '-' || str.charAt(i) == '+' ){
                                if ( str.charAt(i) == '-' && i == 0 ){
                                    elements += str.charAt(i);
                                }else{
                                    vcElements.add(elements);
                                    elements = "";
                                    vcOperator.add(str.charAt(i));
                                }
                            }else{
                                elements += str.charAt(i);
                            }if ( i == str.length() - 1 ){
                                vcElements.add(elements);
                            }
                        }
                        for ( int i=0; i<vcOperator.size(); i++ ){
                            if ( ans == 0.00 ){
                                if ( String.valueOf(vcOperator.elementAt(i)).equals("+") ){
                                    ans = Float.parseFloat(String.valueOf(vcElements.elementAt(i))) + Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("-") ){
                                    ans = Float.parseFloat(String.valueOf(vcElements.elementAt(i))) - Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("×") ){
                                    ans = Float.parseFloat(String.valueOf(vcElements.elementAt(i))) * Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("÷") ){
                                    ans = Float.parseFloat(String.valueOf(vcElements.elementAt(i))) / Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }
                            }else{
                                if ( String.valueOf(vcOperator.elementAt(i)).equals("+") ){
                                    ans = ans + Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("-") ){
                                    ans = ans - Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("×") ){
                                    ans = ans * Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }else if ( String.valueOf(vcOperator.elementAt(i)).equals("÷") ){
                                    ans = ans / Float.parseFloat(String.valueOf(vcElements.elementAt(i + 1)));
                                }
                            }
                        }
                        // Checking if the answer can be converted into integer
                        StringBuffer ansstr = new StringBuffer(String.valueOf(ans));
                        if ( ansstr.charAt(ansstr.length() - 1) == '0' && ansstr.charAt(ansstr.length() - 2 ) == '.' ){
                            ansstr.deleteCharAt(ansstr.length() - 1);
                            ansstr.deleteCharAt(ansstr.length() - 1);
                            int ansInt = Integer.parseInt(String.valueOf(ansstr));
                            String eq = String.valueOf(t1.getText());
                            t1.setText(String.valueOf(ansInt));
                            prevans = ansInt;
                            count++;

                            for ( int i=count; i>=2; i-- ){
                                if ( i == 2 ){
                                    temps = eq + "=" + String.valueOf(prevans);
                                    t2.setText(eq + "=");
                                }
                                if ( i == 3 ){
                                    t3.setText(temps);
                                }
                                if ( i == 4 ){
                                    t4.setText(String.valueOf(t3.getText()));
                                }
                                if ( i == 5 ){
                                    t5.setText(String.valueOf(t4.getText()));
                                }
                                if ( i == 6 ){
                                    t6.setText(String.valueOf(t5.getText()));
                                }
                                if ( i == 7 ){
                                    t7.setText(String.valueOf(t6.getText()));
                                }
                                if ( i == 8 ){
                                    t8.setText(String.valueOf(t7.getText()));
                                }
                                if ( i == 9 ){
                                    t9.setText(String.valueOf(t8.getText()));
                                }
                            }


                        }else{
                            String eq = String.valueOf(t1.getText());
                            t1.setText(String.valueOf(ans));
                            prevansF = ans;
                            count++;

                            for ( int i=count; i>=2; i-- ){
                                if ( i == 2 ){
                                    temps = eq + "=" + String.valueOf(prevansF);
                                    t2.setText(eq + "=");
                                }
                                if ( i == 3 ){
                                    t3.setText(temps);
                                }
                                if ( i == 4 ){
                                    t4.setText(String.valueOf(t3.getText()));
                                }
                                if ( i == 5 ){
                                    t5.setText(String.valueOf(t4.getText()));
                                }
                                if ( i == 6 ){
                                    t6.setText(String.valueOf(t5.getText()));
                                }
                                if ( i == 7 ){
                                    t7.setText(String.valueOf(t6.getText()));
                                }
                                if ( i == 8 ){
                                    t8.setText(String.valueOf(t7.getText()));
                                }
                                if ( i == 9 ){
                                    t9.setText(String.valueOf(t8.getText()));
                                }
                            }
                        }
                        for ( int i=0; i<String.valueOf(t1.getText()).length(); i++ ){
                            if ( String.valueOf(t1.getText()).charAt(i) == '.' ){
                                checkdec = true;
                                break;
                            }else checkdec = false;
                        }
                    }catch ( NumberFormatException e ){ }
                }
            }
        });
    }
}