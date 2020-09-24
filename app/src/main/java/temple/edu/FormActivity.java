package temple.edu;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView name = findViewById(R.id.inputName);
        final TextView email = findViewById(R.id.inputEmail);
        final TextView password = findViewById(R.id.inputPassword);
        final TextView confirm = findViewById(R.id.inputConfirm);
        final Button save = findViewById(R.id.saveButton);
        final TextView message = findViewById(R.id.message);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();
                String userConfirm = confirm.getText().toString();


                boolean areNull = userName.equals("") || userEmail.equals("") || userPassword.equals("")|| userConfirm.equals("");

                if (areNull) {
                    Toast t = Toast.makeText(FormActivity.this, "Must enter values for all input fields", Toast.LENGTH_SHORT);
                    message.setText("");
                    t.show();
                } else if (!(userPassword.compareTo(userConfirm) == 0)) {
                    Toast t = Toast.makeText(FormActivity.this, "Passwords don't match", Toast.LENGTH_SHORT);
                    message.setText("");
                    t.show();
                } else{
                    message.setText("Welcome " + userName + ", to the SignUpForm App");

                }

            }
        });











    }
}