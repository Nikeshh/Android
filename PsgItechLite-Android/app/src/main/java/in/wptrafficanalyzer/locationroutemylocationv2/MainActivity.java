package in.wptrafficanalyzer.locationroutemylocationv2;

import android.Manifest;
import android.app.Dialog;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Menu;

import com.example.nikeshhbaskaran.psgitech.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends FragmentActivity implements LocationListener {

	GoogleMap mGoogleMap;
	ArrayList<LatLng> mMarkerPoints;
	double mLatitude = 0;
	double mLongitude = 0;
	static final LatLng psg1 = new LatLng(11.065738, 77.092747);
	static final LatLng psg2 = new LatLng(11.025093, 77.002826);
	static final LatLng psg3 = new LatLng(11.024876, 77.002804);
	static final LatLng psg4 = new LatLng(11.000639, 76.894896);
	static final LatLng psg5 = new LatLng(11.027115, 76.998481);
	static final LatLng psg6 = new LatLng(11.025250, 77.001694);
	static final LatLng psg7 = new LatLng(11.037442, 77.036361);
	static final LatLng psg8 = new LatLng(11.002837, 76.892806);
	static final LatLng psg9 = new LatLng(11.067602, 77.094165);
	static final LatLng psg10 = new LatLng(11.033130, 77.026839);
	static final LatLng psg11 = new LatLng(11.017877, 76.955875);
	static final LatLng psg12 = new LatLng(11.019115, 77.007178);
	static final LatLng psg13 = new LatLng(11.025125, 77.002826);
	static final LatLng psg14 = new LatLng(11.023412, 77.003725);
	static final LatLng psg15 = new LatLng(11.025051, 77.002826);
	static final LatLng psg16 = new LatLng(11.065728, 77.092790);
	static final LatLng psg17 = new LatLng(11.028123, 77.001587);
	static final LatLng psg18 = new LatLng(11.023333, 77.003195);
	static final LatLng psg19 = new LatLng(11.022141, 76.997535);
	static final LatLng psg20 = new LatLng(11.025093, 77.002901);
	static final LatLng psg21 = new LatLng(11.025146, 77.002858);
	static final LatLng psg22 = new LatLng(11.033435, 77.027649);
	static final LatLng psg23 = new LatLng(11.019668, 77.008463);
	static final LatLng psg24 = new LatLng(11.025177, 77.002751);
	static final LatLng psg25 = new LatLng(11.025135, 77.002794);
	static final LatLng psg26 = new LatLng(11.026936, 76.998515);
	static final LatLng psg27 = new LatLng(11.033109, 77.026839);
	static final LatLng psg28 = new LatLng(11.000796, 76.894936);
	static final LatLng psg29 = new LatLng(11.024923, 77.001768);
	static final LatLng psg30 = new LatLng(11.024125, 77.004566);
	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_maps);

		googleMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		googleMap.setMyLocationEnabled(true);

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg1).title("PSG Institute of Technology and Applied Research"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg2).title("PSG College of Technology"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg3).title("PSG Polytechnic College"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg4).title("PSG Middle School"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg5).title("PSG Primary School"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg6).title("PSG Industrial Institute"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg7).title("PSG College of Arts and Science"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg8).title("PSG Rural Health Center"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg9).title("PSG Metallurgy and Foundry Division"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg10).title("PSG Institute of Medical Sciences & Research"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg11).title("PSG Industrial Training Center"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg12).title("PSG Hospitals"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg13).title("PSG Centre for Sponsored Research and Consultancy"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg14).title("PSG Sarvajana High School"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg15).title("PSG Centre for Non-formal & Continuing Education"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg16).title("PSG Textile Research and Training Center"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg17).title("PSG Urban Health Center"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg18).title("PSG Institute of Management"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg19).title("PSG College of Nursing"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg20).title("PSG Science and Technology Industrial Park"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg21).title("PSG TIFAC Core"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg22).title("PSG College of Physiotherapy"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg23).title("PSG College of Pharmacy"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg24).title("PSG CULES"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg25).title("PSG Center for Advertising & Communication"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg26).title("PSG Children's School"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg27).title("PSG Offshore Health Management Services"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg28).title("PSG High School"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg29).title("PSG Institute of Advanced Studies"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (googleMap == null) {
				googleMap = ((MapFragment) getFragmentManager().
						findFragmentById(R.id.map)).getMap();
			}
			googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
			Marker TP = googleMap.addMarker(new MarkerOptions().
					position(psg30).title("PSG Public Schools"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		// Getting Google Play availability status
		int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getBaseContext());

		if (status != ConnectionResult.SUCCESS) { // Google Play Services are not available

			int requestCode = 10;
			Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, this, requestCode);
			dialog.show();

		} else { // Google Play Services are available

			// Initializing 
			mMarkerPoints = new ArrayList<LatLng>();

			// Getting reference to SupportMapFragment of the activity_main
			SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

			// Getting Map for the SupportMapFragment
			mGoogleMap = fm.getMap();

			// Enable MyLocation Button in the Map
			if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
				// TODO: Consider calling
				//    ActivityCompat#requestPermissions
				// here to request the missing permissions, and then overriding
				//   public void onRequestPermissionsResult(int requestCode, String[] permissions,
				//                                          int[] grantResults)
				// to handle the case where the user grants the permission. See the documentation
				// for ActivityCompat#requestPermissions for more details.
				return;
			}
			mGoogleMap.setMyLocationEnabled(true);
			
			
			// Getting LocationManager object from System Service LOCATION_SERVICE
			LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
	
	        // Creating a criteria object to retrieve provider
	        Criteria criteria = new Criteria();
	
	        // Getting the name of the best provider
	        String provider = locationManager.getBestProvider(criteria, true);
	
	        // Getting Current Location From GPS
	        Location location = locationManager.getLastKnownLocation(provider);
	        
	        if(location!=null){
                onLocationChanged(location);
            }

            locationManager.requestLocationUpdates(provider, 20000, 0, this);			
			
			// Setting onclick event listener for the map
			mGoogleMap.setOnMapClickListener(new OnMapClickListener() {
				
				@Override
				public void onMapClick(LatLng point) {
					
					// Already map contain destination location	
					if(mMarkerPoints.size()>1){
						
						FragmentManager fm = getSupportFragmentManager();	
						mMarkerPoints.clear();
						mGoogleMap.clear();
						LatLng startPoint = new LatLng(mLatitude, mLongitude);
						drawMarker(startPoint);
					}
					
					drawMarker(point);
					
					// Checks, whether start and end locations are captured
					if(mMarkerPoints.size() >= 2){					
						LatLng origin = mMarkerPoints.get(0);
						LatLng dest = mMarkerPoints.get(1);
						
						// Getting URL to the Google Directions API
						String url = getDirectionsUrl(origin, dest);				
						
						DownloadTask downloadTask = new DownloadTask();
						
						// Start downloading json data from Google Directions API
						downloadTask.execute(url);
					}					
				}
			});			
        }
	}
	
	private String getDirectionsUrl(LatLng origin,LatLng dest){
					
		// Origin of route
		String str_origin = "origin="+origin.latitude+","+origin.longitude;
		
		// Destination of route
		String str_dest = "destination="+dest.latitude+","+dest.longitude;			
					
		// Sensor enabled
		String sensor = "sensor=false";			
					
		// Building the parameters to the web service
		String parameters = str_origin+"&"+str_dest+"&"+sensor;
					
		// Output format
		String output = "json";
		
		// Building the url to the web service
		String url = "https://maps.googleapis.com/maps/api/directions/"+output+"?"+parameters;		
		
		return url;
	}
	
	/** A method to download json data from url */
    private String downloadUrl(String strUrl) throws IOException{
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try{
                URL url = new URL(strUrl);

                // Creating an http connection to communicate with url 
                urlConnection = (HttpURLConnection) url.openConnection();

                // Connecting to url 
                urlConnection.connect();

                // Reading data from url 
                iStream = urlConnection.getInputStream();

                BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

                StringBuffer sb  = new StringBuffer();

                String line = "";
                while( ( line = br.readLine())  != null){
                        sb.append(line);
                }
                
                data = sb.toString();

                br.close();

        }catch(Exception e){
                Log.d("Exception while downloading url", e.toString());
        }finally{
                iStream.close();
                urlConnection.disconnect();
        }
        return data;
     }

	
	
    /** A class to download data from Google Directions URL */
	private class DownloadTask extends AsyncTask<String, Void, String>{			
				
		// Downloading data in non-ui thread
		@Override
		protected String doInBackground(String... url) {
				
			// For storing data from web service
			String data = "";
					
			try{
				// Fetching the data from web service
				data = downloadUrl(url[0]);
			}catch(Exception e){
				Log.d("Background Task",e.toString());
			}
			return data;		
		}
		
		// Executes in UI thread, after the execution of
		// doInBackground()
		@Override
		protected void onPostExecute(String result) {			
			super.onPostExecute(result);			
			
			ParserTask parserTask = new ParserTask();
			
			// Invokes the thread for parsing the JSON data
			parserTask.execute(result);
				
		}		
	}
	
	/** A class to parse the Google Directions in JSON format */
    private class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String,String>>> >{
    	
    	// Parsing the data in non-ui thread    	
		@Override
		protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {
			
			JSONObject jObject;	
			List<List<HashMap<String, String>>> routes = null;			           
            
            try{
            	jObject = new JSONObject(jsonData[0]);
            	DirectionsJSONParser parser = new DirectionsJSONParser();
            	
            	// Starts parsing data
            	routes = parser.parse(jObject);    
            }catch(Exception e){
            	e.printStackTrace();
            }
            return routes;
		}
		
		// Executes in UI thread, after the parsing process
		@Override
		protected void onPostExecute(List<List<HashMap<String, String>>> result) {
			ArrayList<LatLng> points = null;
			PolylineOptions lineOptions = null;
			
			// Traversing through all the routes
			for(int i=0;i<result.size();i++){
				points = new ArrayList<LatLng>();
				lineOptions = new PolylineOptions();
				
				// Fetching i-th route
				List<HashMap<String, String>> path = result.get(i);
				
				// Fetching all the points in i-th route
				for(int j=0;j<path.size();j++){
					HashMap<String,String> point = path.get(j);					
					
					double lat = Double.parseDouble(point.get("lat"));
					double lng = Double.parseDouble(point.get("lng"));
					LatLng position = new LatLng(lat, lng);	
					
					points.add(position);						
				}
				
				// Adding all the points in the route to LineOptions
				lineOptions.addAll(points);
				lineOptions.width(2);
				lineOptions.color(Color.RED);	
				
			}
			
			// Drawing polyline in the Google Map for the i-th route
			mGoogleMap.addPolyline(lineOptions);							
		}			
    }   
    
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void drawMarker(LatLng point){
		mMarkerPoints.add(point);
    	
    	// Creating MarkerOptions
		MarkerOptions options = new MarkerOptions();
		
		// Setting the position of the marker
		options.position(point);
		
		/** 
		 * For the start location, the color of marker is GREEN and
		 * for the end location, the color of marker is RED.
		 */
		if(mMarkerPoints.size()==1){
			options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
		}else if(mMarkerPoints.size()==2){
			options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
		}
		
		// Add new marker to the Google Map Android API V2
		mGoogleMap.addMarker(options);		
	}

	@Override
	public void onLocationChanged(Location location) {
		// Draw the marker, if destination location is not set
		if(mMarkerPoints.size() < 2){
			
			mLatitude = location.getLatitude();
	        mLongitude = location.getLongitude();
	        LatLng point = new LatLng(mLatitude, mLongitude);
	
	        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(point));
	        mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(12));        
        
        	drawMarker(point);			
        } 
        
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub		
	}	
}