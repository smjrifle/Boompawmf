package com.thulung.bathiama;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class controlFrontEnd extends Activity implements OnClickListener{
	
	boolean outlet1_status = false;
	boolean outlet2_status = false;
	boolean outlet3_status = false;
	boolean outlet4_status = false;
	boolean outlet5_status = false;
	boolean outlet6_status = false;
	
	private ImageView outlet1;
	private ImageView outlet2;
	private ImageView outlet3;
	private ImageView outlet4;
	private ImageView outlet5;
	private ImageView outlet6;
	
	String DebugOutletMessage = new String("Status Message");
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
    setContentView(R.layout.buttons);
    
    outlet1 = (ImageView)findViewById(R.id.outlet1);
     outlet2 = (ImageView)findViewById(R.id.outlet2);
     outlet3 = (ImageView)findViewById(R.id.outlet3);
     outlet4 = (ImageView)findViewById(R.id.outlet4);
     outlet5 = (ImageView)findViewById(R.id.outlet5);
     outlet6 = (ImageView)findViewById(R.id.outlet6);   
    outlet1.setOnClickListener(this);
    outlet2.setOnClickListener(this);
    outlet3.setOnClickListener(this);
    outlet4.setOnClickListener(this);
    outlet5.setOnClickListener(this);
    outlet6.setOnClickListener(this);
	}
	
	 
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	switch(v.getId()){
	
	case R.id.outlet1:
		Toast.makeText(getApplicationContext(), "Outlet 1 pressed", Toast.LENGTH_LONG).show();
		if(!outlet1_status)
			outlet1.setImageResource(R.drawable.on);	
		else 
			outlet1.setImageResource(R.drawable.off);
		outlet1_status=!outlet1_status;
		break;
	case R.id.outlet2:
		Toast.makeText(getApplicationContext(), "Outlet 2 pressed", Toast.LENGTH_LONG).show();
		if(!outlet2_status)
			outlet2.setImageResource(R.drawable.on);	
		else 
			outlet2.setImageResource(R.drawable.off);
		outlet2_status=!outlet2_status;
		break;
	case R.id.outlet3:
		Toast.makeText(getApplicationContext(), "Outlet 3 pressed", Toast.LENGTH_LONG).show();
		if(!outlet3_status)
			outlet3.setImageResource(R.drawable.on);	
		else 
			outlet3.setImageResource(R.drawable.off);
		outlet3_status=!outlet3_status;
		
		break;
	case R.id.outlet4:
		Toast.makeText(getApplicationContext(), "Outlet 4 pressed", Toast.LENGTH_LONG).show();
		if(!outlet4_status)
			outlet4.setImageResource(R.drawable.on);	
		else 
			outlet4.setImageResource(R.drawable.off);
		outlet4_status=!outlet1_status;
		break;
		
	case R.id.outlet5:
		Toast.makeText(getApplicationContext(), "Outlet 5 pressed", Toast.LENGTH_LONG).show();
		if(!outlet5_status)
			outlet5.setImageResource(R.drawable.on);	
		else 
			outlet5.setImageResource(R.drawable.off);
		outlet5_status=!outlet5_status;
		break;
	case R.id.outlet6:
		Toast.makeText(getApplicationContext(), "Outlet 6 pressed", Toast.LENGTH_LONG).show();
		if(!outlet6_status)
			outlet6.setImageResource(R.drawable.on);	
		else 
			outlet6.setImageResource(R.drawable.off);
		outlet6_status=!outlet6_status;
		break;
	default:
		break;
		
	}
		
	}
}


