package com.example.noughtsandcrosses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnName1;
    private Button btnName2;
    private Button btnName3;
    private Button btnName4;
    private Button btnName5;
    private Button btnName6;
    private Button btnName7;
    private Button btnName8;
    private Button btnName9;
    private Button buttonEnd;
    private boolean choise; //переменная для выбора х или 0
    private boolean theEnd; //переменная для завершения игры
    private int counter = 0; //переменная для счетчика
    private final int[] mass = new int[10]; //массив для проверки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.const_activity);

        textView = (TextView) findViewById(R.id.who_next);
        Typeface face1 = Typeface.createFromAsset(this.getAssets(), "fonts/OldStandardTT-Regular.ttf"); //добавляем шрифт
        textView.setTypeface(face1); //к тексту присваиваем данный шрифт
        btnName1 = findViewById(R.id.grid_1);
        btnName2 = findViewById(R.id.grid_2);
        btnName3 = findViewById(R.id.grid_3);
        btnName4 = findViewById(R.id.grid_4);
        btnName5 = findViewById(R.id.grid_5);
        btnName6 = findViewById(R.id.grid_6);
        btnName7 = findViewById(R.id.grid_7);
        btnName8 = findViewById(R.id.grid_8);
        btnName9 = findViewById(R.id.grid_9);
        buttonEnd = findViewById(R.id.button_id); //кнопка окончания игры
    }

    //обработчик нажатия кнопок в поле игры
    public void click(View view) {
        addField(view); //добавляем х или 0 в поле для игры
        check(); //счетчик к-ва ходов
        finalGane(theEnd); //проверка на завершенность игры
    }

    //обработчик нажатия кнопки на перезапуск активити в конце игры
    public void clickEnd(View view) {
        Intent i = new Intent(this, this.getClass());
        finish();
        this.startActivity(i);
    }

    //добавляем х или 0 в поле для игры
    private void addField(View view) {

        //условие для счета------------------------------------------------------------------------------
        if (!choise) {
            textView.setText(R.string.next_0);
            choise = true;
        } else {
            textView.setText(R.string.next_X);
            choise = false;
        }
        //--------------------------------------------------------------------------------------------------------

        switch (view.getId()) {
            case R.id.grid_1:
                socrash(R.id.grid_1, 1); //метод обработки при нажатии кнопок

//                if (!choise){
//                    btnName1.setText(R.string.my_0);
//                    mass[1] = 1;
//                }
//                else {
//                    btnName1.setText(R.string.my_X);
//                    mass[1] = 2;
//                }
//                btnName1.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName1.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
                break;

            case R.id.grid_2:
                socrash(R.id.grid_2, 2);
//                if (!choise){
//                    btnName2.setText(R.string.my_0);
//                    mass[2] = 1;
//                }
//                else {
//                    btnName2.setText(R.string.my_X);
//                    mass[2] = 2;
//                }
//                btnName2.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName2.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее

                break;

            case R.id.grid_3:
                socrash(R.id.grid_3, 3);
//                if (!choise){
//                    btnName3.setText(R.string.my_0);
//                    mass[3] = 1;
//                }
//                else {
//                    btnName3.setText(R.string.my_X);
//                    mass[3] = 2;
//                }
//                btnName3.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName3.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
                break;

            case R.id.grid_4:
                socrash(R.id.grid_4, 4);
//                if (!choise){
//                    btnName4.setText(R.string.my_0);
//                    mass[4] = 1;
//                }
//                else {
//                    btnName4.setText(R.string.my_X);
//                    mass[4] = 2;
//                }
//                btnName4.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName4.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее

                break;

            case R.id.grid_5:
                socrash(R.id.grid_5, 5);
//                if (!choise){
//                    btnName5.setText(R.string.my_0);
//                    mass[5] = 1;
//                }
//                else {
//                    btnName5.setText(R.string.my_X);
//                    mass[5] = 2;
//                }
//                btnName5.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName5.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
                break;

            case R.id.grid_6:
                socrash(R.id.grid_6, 6);
//                if (!choise){
//                    btnName6.setText(R.string.my_0);
//                    mass[6] = 1;
//                }
//                else {
//                    btnName6.setText(R.string.my_X);
//                    mass[6] = 2;
//                }
//                btnName6.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName6.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее

                break;

            case R.id.grid_7:
                socrash(R.id.grid_7, 7);
//                if (!choise){
//                    btnName7.setText(R.string.my_0);
//                    mass[7] = 1;
//                }
//                else {
//                    btnName7.setText(R.string.my_X);
//                    mass[7] = 2;
//                }
//                btnName7.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName7.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
//
                break;

            case R.id.grid_8:
                socrash(R.id.grid_8, 8);
//                if (!choise){
//                    btnName8.setText(R.string.my_0);
//                    mass[8] = 1;
//                }
//                else {
//                    btnName8.setText(R.string.my_X);
//                    mass[8] = 2;
//                }
//                btnName8.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName8.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
//
                break;

            case R.id.grid_9:
                socrash(R.id.grid_9, 9);
//                if (!choise){
//                    btnName9.setText(R.string.my_0);
//                    mass[9] = 1;
//                }
//                else {
//                    btnName9.setText(R.string.my_X);
//                    mass[9] = 2;
//                }
//                btnName9.setEnabled(false); //кнопка будет нажиматься только 1 раз
//                btnName9.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
//
                break;
        }
    }

    //счетчик к-ва ходов и проверка условий
    private void check() {
        counter++;

        if (counter == 9) {
            textView.setText(R.string.the_end);
            buttonEnd.setVisibility(View.VISIBLE); //делаем кнопку повтора игры видимой
        }

        //проверка по горизонтали 1
        if (mass[1] != 0 && mass[1] == mass[2] && mass[1] == mass[3]) { //проверка по горизонтали
            btnName1.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName2.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName3.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            theEnd = true;
        }
        //проверка по горизонтали 2
        else if (mass[4] != 0 && mass[4] == mass[5] && mass[6] == mass[4]) {
            btnName4.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName5.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName6.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            theEnd = true;
        }
        //проверка по горизонтали 3
        else if (mass[7] != 0 && mass[7] == mass[8] && mass[9] == mass[7]) {
            btnName7.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName8.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName9.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            theEnd = true;
        }
        //проверка по диагонали 1
        else if (mass[1] != 0 && mass[1] == mass[5] && mass[1] == mass[9]) {
            btnName1.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName5.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName9.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            theEnd = true;
        }
        //проверка по диагонали 2
        else if (mass[3] != 0 && mass[3] == mass[5] && mass[3] == mass[7]) {
            btnName3.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName5.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            btnName7.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
            theEnd = true;
        }
        //проверка по вертикали
        else {
            for (int i = 0; i < 4; i++) {
                if (mass[i] != 0 && mass[i] == mass[i + 3] && mass[i] == mass[i + 6]) {
                    if (i == 1) {
                        btnName1.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName4.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName7.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                    } else if (i == 2) {
                        btnName2.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName5.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName8.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                    } else {
                        btnName3.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName6.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче
                        btnName9.setBackgroundColor(getResources().getColor(R.color.btn_end)); //устанавливаем цвет фона кнопки при нажатии ярче

                    }
                    theEnd = true;
                }
            }
        }

    }

    //метод,к. вызывается,если игра закончилась
    private void finalGane(boolean myFinal) {
        if (myFinal) {
            if (choise) {
                textView.setText("Победили крестики");
                //textView.setTextColor(getResources().getColor(R.color.teal_200));
            } else {
                textView.setText("Победили нолики");
            }
            buttonEnd.setVisibility(View.VISIBLE); //делаем кнопку повтора игры видимой
            //создаем переменную для анимации
            Animation buttonAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.my_anim);// создаем анимацию
            buttonEnd.startAnimation(buttonAnim); //запускаем анимацию
        }
    }

    //метод обработки при нажатии кнопок
    private void socrash(int my_id, int i) {
        //переменная, для кнопки
        Button btnNameAll = findViewById(my_id);
        if (!choise) {
            btnNameAll.setText(R.string.my_0);
            mass[i] = 1;
        } else {
            btnNameAll.setText(R.string.my_X);
            mass[i] = 2;
        }
        btnNameAll.setEnabled(false); //кнопка будет нажиматься только 1 раз
        btnNameAll.setBackgroundColor(getResources().getColor(R.color.btn)); //устанавливаем цвет фона кнопки при нажатии тусклее
    }

}