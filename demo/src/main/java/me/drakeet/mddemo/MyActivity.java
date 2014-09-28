package me.drakeet.mddemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import me.drakeet.materialdialog.MaterialDialog;


public class MyActivity extends ActionBarActivity {

    MaterialDialog mMaterialDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void init(View v) {
        mMaterialDialog = new MaterialDialog(this);
        mMaterialDialog.setTitle("MaterialDialog");
        mMaterialDialog.setMessage("Hi! This is a MaterialDialog. It's very easy to use, you just new it, " +
                "then the beautiful AlertDialog will show automatedly. It is artistic, conforms to Google Material Design." +
                " I hope that you can like it, enjoys it. ^ ^");
        mMaterialDialog.setPositiveButton("OK", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
                Toast.makeText(MyActivity.this, "Ok", Toast.LENGTH_LONG).show();

            }
        });

        mMaterialDialog.setNegativeButton("CANCLE", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
                Toast.makeText(MyActivity.this, "Cancle", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void show(View v) {
        if (mMaterialDialog != null) {
            mMaterialDialog.show();
            mMaterialDialog.setMessage("嗨！这是一个 MaterialDialog. 它非常方便使用，你只需将它实例化，这个美观的对话框便会自动地显示出来。" +
                    "它简洁小巧，完全遵照 Google 2014 年发布的 Material Design 风格，希望你能喜欢它！^ ^");
        } else {
            Toast.makeText(getApplicationContext(), "You should init firstly!", Toast.LENGTH_SHORT).show();
        }
    }
}
