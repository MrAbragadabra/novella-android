package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ThirdDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button nextButton;                                // Кнопка "далее"
    Button nextButton_2;                              // Кнопка "далее" 2
    Button nextButton_3;                              // Кнопка "далее" 3
    Button nextButton_4;                              // Кнопка "далее" 4
    Button nextButton_5;                              // Кнопка "далее" 5
    Button nextButton_6;                              // Кнопка "далее" 6
    Button nextButton_7;                              // Кнопка "далее" 7
    Button nextButton_8;                              // Кнопка "далее" 8
    Button nextButton_9;                              // Кнопка "далее" 9
    Button nextButton_10;                             // Кнопка "далее" 10
    Button nextButton_11;                             // Кнопка "далее" 11
    Button nextButton_12;                             // Кнопка "далее" 12
    Button nextButton_13;                             // Кнопка "далее" 13
    Button nextButton_14;                             // Кнопка "далее" 14
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    TextView mainText;                              // Поле с текстом
    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day3_dialog1_effect;           // Эффект диалога 1
    TypewriterEffect day3_dialog2_effect;           // Эффект диалога 2
    TypewriterEffect day3_dialog3_effect;           // Эффект диалога 3
    TypewriterEffect day3_dialog4_effect;           // Эффект диалога 4
    TypewriterEffect day3_dialog5_effect;           // Эффект диалога 5
    TypewriterEffect day3_dialog6_effect;           // Эффект диалога 6
    TypewriterEffect day3_dialog7_effect;           // Эффект диалога 7
    TypewriterEffect day3_dialog8_effect;           // Эффект диалога 8
    TypewriterEffect day3_dialog9_effect;           // Эффект диалога 9
    TypewriterEffect day3_dialog10_effect;           // Эффект диалога 10
    TypewriterEffect day3_dialog11_effect;           // Эффект диалога 11
    TypewriterEffect day3_dialog12_effect;           // Эффект диалога 12
    TypewriterEffect day3_dialog13_effect;           // Эффект диалога 13
    TypewriterEffect day3_dialog14_effect;           // Эффект диалога 14
    TypewriterEffect day3_dialog15_effect;           // Эффект диалога 15
    TypewriterEffect day3_dialog16_effect;           // Эффект диалога 16
    TypewriterEffect day3_dialog17_effect;           // Эффект диалога 17
    TypewriterEffect day3_dialog18_effect;           // Эффект диалога 18
    TypewriterEffect day3_dialog19_effect;           // Эффект диалога 19
    TypewriterEffect day3_dialog20_effect;           // Эффект диалога 20
    // ------------------------------ Диалоги ------------------------------

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_day);

        // --------- Получение кнопок "далее" ---------
        nextButton = findViewById(R.id.next_button);
        nextButton_2 = findViewById(R.id.next_button_2);
        nextButton_3 = findViewById(R.id.next_button_3);
        nextButton_4 = findViewById(R.id.next_button_4);
        nextButton_5 = findViewById(R.id.next_button_5);
        nextButton_6 = findViewById(R.id.next_button_6);
        nextButton_7 = findViewById(R.id.next_button_7);
        nextButton_8 = findViewById(R.id.next_button_8);
        nextButton_9 = findViewById(R.id.next_button_9);
        nextButton_10 = findViewById(R.id.next_button_10);
        nextButton_11 = findViewById(R.id.next_button_11);
        nextButton_12 = findViewById(R.id.next_button_12);
        nextButton_13 = findViewById(R.id.next_button_13);
        nextButton_14 = findViewById(R.id.next_button_14);
        // --------- Получение кнопок "далее" ---------

        // ------------------------------ Получение анимации справа экрана ------------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ------------------------------ Получение анимации справа экрана ------------------------------


        // ------------------------------ Получение анимации слева экрана ------------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ------------------------------ Получение анимации слева экрана ------------------------------

        // Получени поля с тектом
        mainText = findViewById(R.id.first_day_text);

        // Получение основной вёрстки
        relativeLayout = findViewById(R.id.first_day_layout);

        // Скрытие UI элементов android
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        // Размеры приложения занимают весь экран
        getWindow().setFlags(512, 512);

        // Анимация первой фразы (мы проснулись в понедельник)
        day3_dialog1_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_1, 60);
        day3_dialog1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton.setVisibility(View.VISIBLE);
                nextButton.startAnimation(anim_button_in_right);
            }
        });
        // Старт анимации
        day3_dialog1_effect.animateText();

    }
    // Скип анимации на каждый диалог
    public void skipAnimation(View view) {
        HelperClass.stopAnimation(day3_dialog1_effect);
        HelperClass.stopAnimation(day3_dialog2_effect);
        HelperClass.stopAnimation(day3_dialog3_effect);
        HelperClass.stopAnimation(day3_dialog4_effect);
        HelperClass.stopAnimation(day3_dialog5_effect);
        HelperClass.stopAnimation(day3_dialog6_effect);
        HelperClass.stopAnimation(day3_dialog7_effect);
        HelperClass.stopAnimation(day3_dialog8_effect);
        HelperClass.stopAnimation(day3_dialog9_effect);
        HelperClass.stopAnimation(day3_dialog10_effect);
        HelperClass.stopAnimation(day3_dialog11_effect);
        HelperClass.stopAnimation(day3_dialog12_effect);
        HelperClass.stopAnimation(day3_dialog13_effect);
        HelperClass.stopAnimation(day3_dialog14_effect);
        HelperClass.stopAnimation(day3_dialog15_effect);
        HelperClass.stopAnimation(day3_dialog16_effect);
        HelperClass.stopAnimation(day3_dialog17_effect);
        HelperClass.stopAnimation(day3_dialog18_effect);
        HelperClass.stopAnimation(day3_dialog19_effect);
        HelperClass.stopAnimation(day3_dialog20_effect);
    }
    public void nextPhrase(View view) {
        // Прячем кнопку
        nextButton.setEnabled(false);
        nextButton.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton.setVisibility(View.GONE);

                // Меняем фон при завершении анимации
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.bedroom);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.lososeva_class);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog2_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_2, 60);

        // Старт анимции
        day3_dialog2_effect.animateText();

        // События анимации
        day3_dialog2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_2.setVisibility(View.VISIBLE);
                nextButton_2.startAnimation(anim_button_in_right);
            }
        });
    }
    public void nextPhrase_2(View view) {
        // Прячем кнопку
        nextButton_2.setEnabled(false);
        nextButton_2.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_2.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog3_effect = new TypewriterEffect(mainText, Dialogues.day3_class_1_test_false, 60);

        // Старт анимции
        day3_dialog3_effect.animateText();

        // События анимации
        day3_dialog3_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_3.setVisibility(View.VISIBLE);
                nextButton_3.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_3(View view) {
        // Прячем кнопку
        nextButton_3.setEnabled(false);
        nextButton_3.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_3.setVisibility(View.GONE);
                // Меняем фон при завершении анимации
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.lososeva_class);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.dushnya_class);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog4_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_1, 60);

        // Старт анимции
        day3_dialog4_effect.animateText();

        // События анимации
        day3_dialog4_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_4.setVisibility(View.VISIBLE);
                nextButton_4.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_4(View view) {
        // Прячем кнопку
        nextButton_4.setEnabled(false);
        nextButton_4.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_4.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog5_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_2, 60);

        // Старт анимции
        day3_dialog5_effect.animateText();

        // События анимации
        day3_dialog5_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_5.setVisibility(View.VISIBLE);
                nextButton_5.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_5(View view) {
        // Прячем кнопку
        nextButton_5.setEnabled(false);
        nextButton_5.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_5.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog6_effect = new TypewriterEffect(mainText, Dialogues.day3_class_2_3, 60);

        // Старт анимции
        day3_dialog6_effect.animateText();

        // События анимации
        day3_dialog6_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_6.setVisibility(View.VISIBLE);
                nextButton_6.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_6(View view) {
        // Прячем кнопку
        nextButton_6.setEnabled(false);
        nextButton_6.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_6.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog7_effect = new TypewriterEffect(mainText, Dialogues.day3_warderobe, 60);

        // Старт анимции
        day3_dialog7_effect.animateText();

        // События анимации
        day3_dialog7_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_7.setVisibility(View.VISIBLE);
                nextButton_7.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_7(View view) {
        // Прячем кнопку
        nextButton_7.setEnabled(false);
        nextButton_7.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_7.setVisibility(View.GONE);

                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.dushnya_class);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.kastryuleva_class);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog8_effect = new TypewriterEffect(mainText, Dialogues.day3_class_3_1, 60);

        // Старт анимции
        day3_dialog8_effect.animateText();

        // События анимации
        day3_dialog8_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_8.setVisibility(View.VISIBLE);
                nextButton_8.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_8(View view) {
        // Прячем кнопку
        nextButton_8.setEnabled(false);
        nextButton_8.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_8.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog9_effect = new TypewriterEffect(mainText, Dialogues.day3_class_3_2, 60);

        // Старт анимции
        day3_dialog9_effect.animateText();

        // События анимации
        day3_dialog9_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_9.setVisibility(View.VISIBLE);
                nextButton_9.startAnimation(anim_button_in_right);
            }
        });
    }

    public void nextPhrase_9(View view) {
        // Прячем кнопку
        nextButton_9.setEnabled(false);
        nextButton_9.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_9.setVisibility(View.GONE);

                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.kastryuleva_class);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.garderob);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog10_effect = new TypewriterEffect(mainText, Dialogues.day3_warderobe, 60);

        // Старт анимции
        day3_dialog10_effect.animateText();

        // События анимации
        day3_dialog10_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_10.setVisibility(View.VISIBLE);
                nextButton_10.startAnimation(anim_button_in_right);
            }
        });
    }

    // Кнопка смены дня, если отношения = 0, если они больше 0, продолжается день
    public void nextPhrase_10(View view) {
        // Прячем кнопку
        nextButton_10.setEnabled(false);
        nextButton_10.startAnimation(anim_button_out_right);
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Событие при старте анимации
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // По завершении анимации прячем кнопку
                nextButton_10.setVisibility(View.GONE);

                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.garderob);
                @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.home_computer);
                HelperClass.animBackground(relativeLayout, bg1, bg2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Событие при повторе анимации
            }
        });

        // Очистка поля текста
        mainText.setText("");

        // Анимация второй фразы
        day3_dialog10_effect = new TypewriterEffect(mainText, Dialogues.day3_warderobe, 60);

        // Старт анимции
        day3_dialog10_effect.animateText();

        // События анимации
        day3_dialog10_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // По окончанию анимация печатания вызываем кнопку "далее"
                nextButton_9.setVisibility(View.VISIBLE);
                nextButton_9.startAnimation(anim_button_in_right);
            }
        });
    }

    public void setDay4() {
        // // Новый intent для открытия главного меню
        Intent intent = new Intent(ThirdDay.this, SplashScreenTuesday.class);

        // Открываем новое активити
        ThirdDay.this.startActivity(intent);

        // Завершаем текущее активити
        ThirdDay.this.finish();

        // Плавный переход между активити
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}