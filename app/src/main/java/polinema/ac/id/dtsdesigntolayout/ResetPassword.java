package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextPassword;
    EditText getEditTextConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextPassword = findViewById(R.id.edt_new_password);
        getEditTextConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword(View view) {
        // Validasi kosong
        String pass = editTextPassword.getText().toString();
        if(TextUtils.isEmpty(pass) || pass.length() <15)
        {
            editTextPassword.setError("You must have 15 characters in your password");
            return;
        }
        // Cek inputan new dan confirm
        Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
        startActivity(i);

    }

}
