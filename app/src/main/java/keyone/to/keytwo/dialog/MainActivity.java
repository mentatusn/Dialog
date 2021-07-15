package keyone.to.keytwo.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_FRAGMENT_BUILDER = "sdgsredg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDialog1();
        createDialog2();
        createDialog3();
        createDialog4();
        createDialog5();
        createDialog6();
        createDialog7();

        //BadClass badClass = new BadClass(1,2,3,4,5,6,7);
        /*GoodClass goodClass = new GoodClass.Builder(1,2)
                .setField3(3)
                .setField4(4)
                .setField5(5)
                .setField6(6)
                .setField7(7).build();*/


    }


    private void createDialog1() {
        ((Button) findViewById(R.id.buttonAlertDialog1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Заголовок 1")
                        .setMessage("Сообщение 1")
                        .setIcon(R.mipmap.ic_launcher)
                        .setCancelable(false)
                        .setNeutralButton("Не уверен", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "Удалось обмануть, это да, но на самом деле нет",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    private void createDialog2() {
        ((Button) findViewById(R.id.buttonAlertDialog2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                String[] list = getResources().getStringArray(R.array.list);
                builder.setTitle("Заголовок 2")
                        .setItems(list, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "Выбрали " + list[which],
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setNeutralButton("Не уверен", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "Удалось обмануть, это да, но на самом деле нет",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    int checked = -1;

    private void createDialog3() {
        ((Button) findViewById(R.id.buttonAlertDialog3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                String[] list = getResources().getStringArray(R.array.list);

                builder.setTitle("Выберите пункт")
                        .setSingleChoiceItems(list, checked, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "Выбрали " + list[which],
                                        Toast.LENGTH_SHORT).show();
                                checked = which;
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("Выбрать", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "checked = " + checked,
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
    boolean[] checkElements = {false, false, false, false};

    private void createDialog4() {
        ((Button) findViewById(R.id.buttonAlertDialog4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                String[] list = getResources().getStringArray(R.array.list);

                builder.setTitle("Выберите пункт")
                        .setMultiChoiceItems(list, checkElements, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                Toast.makeText(MainActivity.this,
                                        "выбрали " + list[which] + " состояние " + isChecked,
                                        Toast.LENGTH_SHORT).show();
                                checkElements[which] = isChecked;
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("Выбрать", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "checked = " + checked,
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    private void createDialog6() {
        ((Button) findViewById(R.id.buttonAlertDialog6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new DialogBuilderFragment();
                dialogFragment.show(getSupportFragmentManager(), TAG_FRAGMENT_BUILDER);
            }
        });
    }
    private void createDialog7() {
        ((Button) findViewById(R.id.buttonAlertDialog7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialogFragment = new DialogCustomFragment();
                dialogFragment.show(getSupportFragmentManager(), TAG_FRAGMENT_BUILDER);
            }
        });
    }

    private void createDialog5() {
        ((Button) findViewById(R.id.buttonAlertDialog6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                String[] list = getResources().getStringArray(R.array.list);

                builder.setTitle("Выберите пункт")
                        .setIcon(R.mipmap.ic_launcher)
                        .setView(R.layout.dialog_custom)
                        .setPositiveButton("отправить", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,
                                        "checked = " + checked,
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    public void getResult(String message) {
        Toast.makeText(this,
                "Сработало  " + message,
                Toast.LENGTH_SHORT).show();
    }
}