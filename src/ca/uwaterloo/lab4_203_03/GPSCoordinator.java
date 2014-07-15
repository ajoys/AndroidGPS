package ca.uwaterloo.lab4_203_03;

import java.util.ArrayList;
import java.util.List;

import ca.uwaterloo.lab4_203_03.MainActivity.PlaceholderFragment;
import mapper.InterceptPoint;
import mapper.MapView;
import mapper.NavigationalMap;
import android.graphics.PointF;
import android.widget.TextView;

public class GPSCoordinator {


	private int state = 0;
	private static MapView mapView = MainActivity.mapView;
	//private InterceptPoint[] wallCoordArray;
	//private PointF firstWall;
	//private NavigationalMap wallfinder;


	static PointF pA = new PointF((float) 3.5, (float) 9.25);
	static PointF pB = new PointF((float) 7.15, (float) 9.15);
	static PointF pC = new PointF((float) 11.4, (float) 9.25);
	static PointF pD = new PointF((float) 15.8, (float) 9.35);

	static PointF dA = new PointF((float) 4.5, (float) 9.25);
	static PointF dB = new PointF((float) 8.5, (float) 9.15);
	static PointF dC = new PointF((float) 12.7, (float) 9.25);
	static PointF dD = new PointF((float) 14.6, (float) 9.35);

	static List<PointF> path;

	public static List<PointF> calculatePathOne() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pA);
		path.add(pB);
		path.add(pC);
		path.add(pD);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathTwo() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pB);
		path.add(pC);
		path.add(pD);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathThree() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pC);
		path.add(pD);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathFour() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pD);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathFive() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathSix() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pA);
		path.add(pB);
		path.add(pC);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathSeven() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pA);
		path.add(pB);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathEight() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pB);
		path.add(pC);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathNine() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pC);
		path.add(pB);
		path.add(mapView.getDestinationPoint());
		
		return path;

	}

	public List<PointF> calculatePathTen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pB);
		path.add(pA);
		path.add(mapView.getDestinationPoint());
		
		return path;

	}

	public List<PointF> calculatePathEleven() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pC);
		path.add(pB);
		path.add(pA);
		path.add(mapView.getDestinationPoint());		

		return path;

	}

	public List<PointF> calculatePathTwelve() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pD);
		path.add(mapView.getDestinationPoint());
		
		return path;

	}

	public List<PointF> calculatePathThirteen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pD);
		path.add(pC);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathFourteen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pD);
		path.add(pC);
		path.add(pB);
		path.add(mapView.getDestinationPoint());
		
		return path;

	}

	public static List<PointF> calculatePathFifteen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pD);
		path.add(pC);
		path.add(pB);
		path.add(pA);
		path.add(mapView.getDestinationPoint());
		
		return path;

	}
	public List<PointF> calculatePathSixteen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pB);
		path.add(mapView.getDestinationPoint());

		return path;

	}

	public List<PointF> calculatePathSeventeen() {

		path = new ArrayList<PointF>();

		path.add(mapView.getUserPoint());
		path.add(pC);
		path.add(mapView.getDestinationPoint());

		return path;

	}


	public void showDirection() {


		if( mapView.getUserPoint().x < dA.x && mapView.getDestinationPoint().x > dD.x){
			 mapView.setUserPath(calculatePathOne());
		 }
		 else if(mapView.getUserPoint().x < dB.x && mapView.getUserPoint().x > dA.x && mapView.getDestinationPoint().x > dD.x){
			 mapView.setUserPath(calculatePathTwo());
		 }
		 else if(mapView.getUserPoint().x < dC.x && mapView.getUserPoint().x > dB.x && mapView.getDestinationPoint().x > dD.x){
			 mapView.setUserPath(calculatePathThree());
		 }
		 else if(mapView.getUserPoint().x < dD.x && mapView.getUserPoint().x > dC.x && mapView.getDestinationPoint().x > dD.x){
			 mapView.setUserPath(calculatePathFour());
		 }
		 else if((mapView.getUserPoint().x > dD.x && mapView.getDestinationPoint().x > dD.x) 
				 || (mapView.getUserPoint().x < dA.x && mapView.getDestinationPoint().x < dA.x)
				 || (mapView.getUserPoint().x > dD.x && mapView.getDestinationPoint().x > dD.x)){
			 mapView.setUserPath(calculatePathFive());
		 }
		 else if( mapView.getUserPoint().x < dA.x && mapView.getDestinationPoint().x < dC.x && mapView.getDestinationPoint().x > dB.x){
			 mapView.setUserPath(calculatePathSix());					 
		 }
		 else if( mapView.getUserPoint().x < dA.x && mapView.getDestinationPoint().x < dB.x && mapView.getDestinationPoint().x > dA.x){
			 mapView.setUserPath(calculatePathSeven());					 
		 }
		 else if(mapView.getUserPoint().x > dA.x && mapView.getUserPoint().x <dB.x && mapView.getDestinationPoint().x < dC.x && mapView.getDestinationPoint().x > dB.x){
			 mapView.setUserPath(calculatePathEight());					 
		 }
		 else if(mapView.getDestinationPoint().x > dA.x && mapView.getDestinationPoint().x <dB.x && mapView.getUserPoint().x < dC.x && mapView.getUserPoint().x > dB.x){
			 mapView.setUserPath(calculatePathNine());
		 }
		 else if( mapView.getDestinationPoint().x < dA.x && mapView.getUserPoint().x < dB.x && mapView.getUserPoint().x > dA.x){
			 mapView.setUserPath(calculatePathTen());					 
		 }
		 else if( mapView.getDestinationPoint().x < dA.x && mapView.getUserPoint().x < dC.x && mapView.getUserPoint().x > dB.x){
			 mapView.setUserPath(calculatePathEleven());					 
		 }
		 else if(mapView.getDestinationPoint().x < dD.x && mapView.getDestinationPoint().x > dC.x && mapView.getUserPoint().x > dD.x){
			 mapView.setUserPath(calculatePathTwelve());
		 }
		 else if(mapView.getDestinationPoint().x < dC.x && mapView.getDestinationPoint().x > dB.x && mapView.getUserPoint().x > dD.x){
			 mapView.setUserPath(calculatePathThirteen());
		 }
		 else if(mapView.getDestinationPoint().x < dB.x && mapView.getDestinationPoint().x > dA.x && mapView.getUserPoint().x > dD.x){
			 mapView.setUserPath(calculatePathFourteen());
		 }
		 else if( mapView.getDestinationPoint().x < dA.x && mapView.getUserPoint().x > dD.x){
			 mapView.setUserPath(calculatePathFifteen());
		 }
		 else if( mapView.getDestinationPoint().x > dA.x && mapView.getDestinationPoint().x < dB.x && mapView.getUserPoint().x > dA.x && mapView.getUserPoint().x < dB.x){
			 mapView.setUserPath(calculatePathSixteen());
		 }
		 else if( mapView.getDestinationPoint().x > dB.x && mapView.getDestinationPoint().x < dC.x && mapView.getUserPoint().x > dB.x && mapView.getUserPoint().x < dC.x){
			 mapView.setUserPath(calculatePathSeventeen());
		 }
	}


}