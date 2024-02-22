package com.example.sixdaytosurvive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SecondDay extends AppCompatActivity {

    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------
    Button day2MonologNextButton;                     // Кнопка "далее"
    Button Day2SsoraTrue1Button;                      // Кнопка "далее" 2
    Button Day2SsoraTrue2Button;                      // Кнопка "далее" 3
    Button Day2SsoraTrue3Button;                              // Кнопка "далее" 4
    Button Day2SsoraTrue4Button;                              // Кнопка "далее" 5
    Button Day2Class1_1Button;                              // Кнопка "далее" 6
    Button nextButton_7;                              // Кнопка "далее" 7
    Button nextButton_8;                              // Кнопка "далее" 8
    Button nextButton_9;                              // Кнопка "далее" 9
    Button nextButton_10;                             // Кнопка "далее" 10
    Button nextButton_11;                             // Кнопка "далее" 11
    Button nextButton_12;                             // Кнопка "далее" 12
    Button nextButton_13;                             // Кнопка "далее" 13
    Button nextButton_14;                             // Кнопка "далее" 14
    //    ---------------------------КНОПКИ ДАЛЕЕ---------------------------

    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------
    Button choiceButton1;
    Button choiceButton2;
    // ---------- Кнопки для выбора в коридоре при ссоре Степаниды и Евлампия ----------

    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------
    Button choiceButton3;
    Button choiceButton4;
    // ---------- Кнопки для выбора в столовой между багетом и сосисой в тесте ----------

    // ------------------------------ Анимации ------------------------------
    Animation anim_button_in_right;                 // Анимация вхождения кнопки справа
    Animation anim_button_out_right;                // Анимация выхода кнопки справа
    Animation anim_button_in_left;                  // Анимация входа кнопки слева
    Animation anim_button_out_left;                 // Анимация выхода кнопки слева
    // ------------------------------ Анимации ------------------------------

    // ------------------------------ Диалоги ------------------------------
    TypewriterEffect day2_monolog_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_1_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_2_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_3_effect;
    TypewriterEffect day2_stepanida_evlampiy_ssora_true_4_effect;
    TypewriterEffect day2_class1_1_effect;
    TypewriterEffect day2_canteen_1_effect;
    TypewriterEffect day2_canteen_baget_effect;
    // ------------------------------ Диалоги ------------------------------

    // Основной Layout в вёрстке
    RelativeLayout relativeLayout;

    // Основной TextView на экране
    TextView mainTV;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_day);

        // --------- Получение кнопок по id "далее" ---------
        day2MonologNextButton = findViewById(R.id.next_button_day2);
        Day2SsoraTrue1Button = findViewById(R.id.next_button_2_day2);
        Day2SsoraTrue2Button = findViewById(R.id.next_button_3_day2);
        Day2SsoraTrue3Button = findViewById(R.id.next_button_4_day2);
        Day2SsoraTrue4Button = findViewById(R.id.next_button_5_day2);
        Day2Class1_1Button = findViewById(R.id.next_button_6_day2);
        nextButton_7 = findViewById(R.id.next_button_7_day2);
        nextButton_8 = findViewById(R.id.next_button_8_day2);
        nextButton_9 = findViewById(R.id.next_button_9_day2);
        nextButton_10 = findViewById(R.id.next_button_10_day2);
        nextButton_11 = findViewById(R.id.next_button_11_day2);
        nextButton_12 = findViewById(R.id.next_button_12_day2);
        nextButton_13 = findViewById(R.id.next_button_13_day2);
        nextButton_14 = findViewById(R.id.next_button_14_day2);
        // --------- Получение кнопок по id "далее" ---------

        // ---------- Получение кнопок выбора по id ---------
        choiceButton1 = findViewById(R.id.choice_button1_day2);
        choiceButton2 = findViewById(R.id.choice_button2_day2);
        // ---------- Получение кнопок выбора по id ---------

        // ---------- Получение кнопок выбора по id ---------
        choiceButton3 = findViewById(R.id.choice_button3_day2);
        choiceButton4 = findViewById(R.id.choice_button4_day2);
        // ---------- Получение кнопок выбора по id ---------

        // ---------------------------- Получение анимации по id (правая часть) ----------------------------
        anim_button_in_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_right);
        anim_button_out_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_right);
        // ---------------------------- Получение анимации по id (правая часть) ----------------------------

        /// ---------------------------- Получение анимации по id (левая часть) ----------------------------
        anim_button_in_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_in_left);
        anim_button_out_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_out_left);
        // ---------------------------- Получение анимации по id (левая часть) ----------------------------

        // Получение по id основного TextView
        mainTV = findViewById(R.id.second_day_TV);

        // Получение layout
        relativeLayout = findViewById(R.id.second_day_layout);

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

        // ------------------- Эффект печати для day2_monolog -------------------
        day2_monolog_effect = new TypewriterEffect(mainTV, Dialogues.day2_monolog, 60);
        day2_monolog_effect.animateText();
        // ------------------- Эффект печати для day2_monolog -------------------


        // ------------------- Событие для окончанию печати для day2_monolog -------------------
        day2_monolog_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Вызов кнопки
                day2MonologNextButton.setVisibility(View.VISIBLE);
                day2MonologNextButton.startAnimation(anim_button_in_right);

                // Активация кнопки по окончанию анимации
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        day2MonologNextButton.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // ------------------- Событие для окончанию печати для day2_monolog -------------------
    }

    public void skipAnimationDay2(View view) {
        HelperClass.stopAnimation(day2_monolog_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_1_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_2_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_3_effect);
        HelperClass.stopAnimation(day2_stepanida_evlampiy_ssora_true_4_effect);
        HelperClass.stopAnimation(day2_class1_1_effect);
    }

    // ----------- OnClick на переключение на следующую фразу после Day2Monolog -----------
    public void nextPhrase_Day2Monolog(View view) {
        // Убираем кнопку
        day2MonologNextButton.setEnabled(false);
        day2MonologNextButton.startAnimation(anim_button_out_right);

        // --- По окончанию убирания кнопки, удаляем её и вызываем следующую фразу ---
        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Удаляем кнопку
                day2MonologNextButton.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очищаем TextView
        mainTV.setText("");

        // Смена фона
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.bedroom);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.stepanida_evlampiy_corridor);
        HelperClass.animBackground(relativeLayout, bg1, bg2);

        // ------------------- Эффект печати для day2_stepanida_evlampiy_ssora -------------------
        day2_stepanida_evlampiy_ssora_effect = new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora, 60);
        day2_stepanida_evlampiy_ssora_effect.animateText();
        // ------------------- Эффект печати для day2_stepanida_evlampiy_ssora -------------------

        day2_stepanida_evlampiy_ssora_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                choiceButton1.setVisibility(View.VISIBLE);
                choiceButton2.setVisibility(View.VISIBLE);

                choiceButton1.startAnimation(anim_button_in_left);
                choiceButton2.startAnimation(anim_button_in_left);

                // Событие по окончанию анимации
                anim_button_in_left.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // Активируем кнопки после того, как они приехали
                        choiceButton1.setEnabled(true);
                        choiceButton2.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
    // ----------- OnClick на переключение на следующую фразу после Day2Monolog -----------


    // ----------- OnClick на выбор за мир между Степанидой и Евлампием -----------
    public void createPeace(View view) {
        // Добавляем к переменной любви +1
        PlayerData.loveLevel++;

        // Отключаем кнопки
        choiceButton1.setEnabled(false);
        choiceButton2.setEnabled(false);

        // Кнопки уезжают
        choiceButton1.startAnimation(anim_button_out_left);
        choiceButton2.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Удаление кнопок
                choiceButton1.setVisibility(View.GONE);
                choiceButton2.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Чистим TextView
        mainTV.setText("");

        // --- Эффект печати для day2_stepanida_evlampiy_ssora_true_1 ---
        day2_stepanida_evlampiy_ssora_true_1_effect =
                new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora_true_1, 60);
        day2_stepanida_evlampiy_ssora_true_1_effect.animateText();
        // --- Эффект печати для day2_stepanida_evlampiy_ssora_true_1 ---

        // --- Событие на окончание текста ---
        day2_stepanida_evlampiy_ssora_true_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Включение кнопки
                Day2SsoraTrue1Button.setVisibility(View.VISIBLE);

                // Старт анимации кнопки
                Day2SsoraTrue1Button.startAnimation(anim_button_in_right);

                // По окончанию анимации врубаем кнопку
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Day2SsoraTrue1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // --- Событие на окончание текста ---
    }
    // ----------- OnClick на выбор за мир между Степанидой и Евлампием -----------

    // ----------- Развитие ветки с ссорой в коридоре -----------
    public void nextPhrase_Day2SsoraTrue1(View view) {
        Day2SsoraTrue1Button.setEnabled(false);
        Day2SsoraTrue1Button.startAnimation(anim_button_out_right);

        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Вырубаем кнопку
                Day2SsoraTrue1Button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_2 ---
        day2_stepanida_evlampiy_ssora_true_2_effect =
                new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora_true_2, 60);
        day2_stepanida_evlampiy_ssora_true_2_effect.animateText();
        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_2 ---

        // --- Событие на окончание анимации текста ---
        day2_stepanida_evlampiy_ssora_true_2_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Включаем кнопку
                Day2SsoraTrue2Button.setVisibility(View.VISIBLE);

                // Включаем анимацию
                Day2SsoraTrue2Button.startAnimation(anim_button_in_right);

                // По окончанию анимации врубаем кнопку
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // Кнопка ВКЛ
                        Day2SsoraTrue2Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // --- Событие на окончание анимации текста ---
    }

    public void nextPhrase_Day2SsoraTrue2(View view) {
        Day2SsoraTrue2Button.setEnabled(false);
        Day2SsoraTrue2Button.startAnimation(anim_button_out_right);

        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Вырубаем кнопку
                Day2SsoraTrue2Button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_3 ---
        day2_stepanida_evlampiy_ssora_true_3_effect =
                new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora_true_3, 60);
        day2_stepanida_evlampiy_ssora_true_3_effect.animateText();
        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_3 ---

        // --- Событие на окончание анимации текста ---
        day2_stepanida_evlampiy_ssora_true_3_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Включаем кнопку
                Day2SsoraTrue3Button.setVisibility(View.VISIBLE);

                // Включаем анимацию
                Day2SsoraTrue3Button.startAnimation(anim_button_in_right);

                // По окончанию анимации врубаем кнопку
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // Кнопка ВКЛ
                        Day2SsoraTrue3Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // --- Событие на окончание анимации текста ---
    }

    public void nextPhrase_Day2SsoraTrue3(View view) {
        Day2SsoraTrue3Button.setEnabled(false);
        Day2SsoraTrue3Button.startAnimation(anim_button_out_right);

        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Вырубаем кнопку
                Day2SsoraTrue3Button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_4 ---
        day2_stepanida_evlampiy_ssora_true_4_effect =
                new TypewriterEffect(mainTV, Dialogues.day2_stepanida_evlampiy_ssora_true_4, 60);
        day2_stepanida_evlampiy_ssora_true_4_effect.animateText();
        // --- Эффект для печати day2_stepanida_evlampiy_ssora_true_3 ---

        // --- Событие на окончание анимации текста ---
        day2_stepanida_evlampiy_ssora_true_4_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Включаем кнопку
                Day2SsoraTrue4Button.setVisibility(View.VISIBLE);

                // Включаем анимацию
                Day2SsoraTrue4Button.startAnimation(anim_button_in_right);

                // По окончанию анимации врубаем кнопку
                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // Кнопка ВКЛ
                        Day2SsoraTrue4Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
        // --- Событие на окончание анимации текста ---
    }
    // ----------- Развитие ветки с ссорой в коридоре -----------

    // ----------- OnClick на выбор за уход на пару без мира -----------
    public void walkPast(View view) {
        // Отключаем кнопки
        choiceButton1.setEnabled(false);
        choiceButton2.setEnabled(false);

        // Кнопки уезжают
        choiceButton1.startAnimation(anim_button_out_left);
        choiceButton2.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Удаление кнопок
                choiceButton1.setVisibility(View.GONE);
                choiceButton2.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // Смена фона
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.stepanida_evlampiy_corridor);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.dushnya_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);

        // ---- Анимация текста day2_class1_1 ----
        day2_class1_1_effect = new TypewriterEffect(mainTV, Dialogues.day2_class1_1, 60);
        day2_class1_1_effect.animateText();
        // ---- Анимация текста day2_class1_1 ----

        day2_class1_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Появление кнопки
                Day2Class1_1Button.setVisibility(View.VISIBLE);
                Day2Class1_1Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // По окончанию анимации включаем кнопку
                        Day2Class1_1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
    // ----------- OnClick на выбор за уход на пару без мира -----------

    public void nextPhrase_Day2SsoraTrue4(View view) {
        Day2SsoraTrue4Button.setEnabled(false);
        Day2SsoraTrue4Button.startAnimation(anim_button_out_right);

        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Day2SsoraTrue4Button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // Смена фона
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.stepanida_evlampiy_corridor);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.dushnya_class);
        HelperClass.animBackground(relativeLayout, bg1, bg2);

        // ---- Анимация текста day2_class1_1 ----
        day2_class1_1_effect = new TypewriterEffect(mainTV, Dialogues.day2_class1_1, 60);
        day2_class1_1_effect.animateText();
        // ---- Анимация текста day2_class1_1 ----

        day2_class1_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Появление кнопки
                Day2Class1_1Button.setVisibility(View.VISIBLE);
                Day2Class1_1Button.startAnimation(anim_button_in_right);

                anim_button_in_right.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        // По окончанию анимации включаем кнопку
                        Day2Class1_1Button.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void nextPhrase_Day2Class1_1(View view) {
        // Убираем кнопочку
        Day2Class1_1Button.setEnabled(false);
        Day2Class1_1Button.startAnimation(anim_button_out_right);

        anim_button_out_right.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Day2Class1_1Button.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очищаем текст
        mainTV.setText("");

        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg1 = getResources().getDrawable(R.drawable.dushnya_class);
        @SuppressLint("UseCompatLoadingForDrawables") Drawable bg2 = getResources().getDrawable(R.drawable.evgey_canteen);
        HelperClass.animBackground(relativeLayout, bg1, bg2);

        // --------- Анимация day2_canteen_1 ---------
        day2_canteen_1_effect = new TypewriterEffect(mainTV, Dialogues.day2_canteen_1, 60);
        day2_canteen_1_effect.animateText();
        // --------- Анимация day2_canteen_1 ---------

        // По окончанию печати текста
        day2_canteen_1_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                // Кнопки входят на экран
                choiceButton3.setVisibility(View.VISIBLE);
                choiceButton4.setVisibility(View.VISIBLE);

                choiceButton3.startAnimation(anim_button_in_left);
                choiceButton4.startAnimation(anim_button_in_left);

                anim_button_in_left.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        choiceButton3.setEnabled(true);
                        choiceButton4.setEnabled(true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }

    public void getBaget(View view) {
        // Отключение кнопочек
        choiceButton3.setEnabled(false);
        choiceButton4.setEnabled(false);

        choiceButton3.startAnimation(anim_button_out_left);
        choiceButton4.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                choiceButton3.setVisibility(View.GONE);
                choiceButton4.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        // Очистка текста
        mainTV.setText("");

        // ------ Анимация печати для day2_canteen_baget ------
        day2_canteen_baget_effect = new TypewriterEffect(mainTV, Dialogues.day2_canteen_baget, 60);
        day2_canteen_baget_effect.animateText();
        // ------ Анимация печати для day2_canteen_baget ------

        day2_canteen_baget_effect.setListener(new TypewriterListener() {
            @Override
            public void onAnimationEnd() {
                Toast.makeText(SecondDay.this, "Здесь появляется кноппочка далее...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getSosisa(View view) {
        // Отключение кнопочек
        choiceButton3.setEnabled(false);
        choiceButton4.setEnabled(false);

        choiceButton3.startAnimation(anim_button_out_left);
        choiceButton4.startAnimation(anim_button_out_left);

        anim_button_out_left.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                choiceButton3.setVisibility(View.GONE);
                choiceButton4.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}