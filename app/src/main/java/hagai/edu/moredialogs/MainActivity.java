package hagai.edu.moredialogs;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ConstraintLayout)findViewById(R.id.constraint);

    }

    public void showDialog(View view) {
//        AlertDialog.Builder bulider = new AlertDialog.Builder(this);
//        bulider.setCancelable(false);
//        View v = getLayoutInflater().inflate(R.layout.dialog_login,layout,false);
//       final EditText etUserName = (EditText) v.findViewById(R.id.etUserName);
//        EditText etPassword = (EditText) v.findViewById(R.id.etPassword);
//        Button btnCancel = (Button) v.findViewById(R.id.btnCancel);
//        Button btnLogin = (Button) v.findViewById(R.id.btnLog);
//
//
//        bulider.setView(v);
//
//        final  AlertDialog dialog = bulider.create();
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this , etUserName.getText().toString(),Toast.LENGTH_SHORT).show();
//                dialog.dismiss();
//            }
//        });
//
//        dialog.show();

        LoginFragment f = new LoginFragment();
        f.show(getSupportFragmentManager(),"loginDialog");


    }
}
