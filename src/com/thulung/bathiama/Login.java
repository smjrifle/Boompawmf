package com.thulung.bathiama;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements OnClickListener {

	private EditText user, pass;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        Button loginButton = (Button) findViewById(R.id.login);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        
       loginButton.setOnClickListener(this);
    }




	@Override
	public void onClick(View v) {
		
		if(v.getId()==R.id.login){
			Log.d("Vaildation - username",user.getText().toString());
			Log.d("Vaildation - password",pass.getText().toString());
		if(user.getText().toString().equals("samarpan") && pass.getText().toString().equals("rai")){
			Toast.makeText(Login.this, "Login Sucessful!", Toast.LENGTH_LONG).show();
			Intent i = new Intent(this, controlFrontEnd.class);
			startActivity(i);
		}
		else {
			Toast.makeText(Login.this, "Login unsucessful!", Toast.LENGTH_SHORT).show();
			user.setText("");
			pass.setText("");
			return;
		}
		}
		
	}

}
