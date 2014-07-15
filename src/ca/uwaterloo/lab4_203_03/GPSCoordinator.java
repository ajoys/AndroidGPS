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


	public static List<PointF> calculatePathOne() {

		List<PointF> pathOne = new ArrayList<PointF>();

		pathOne.add(mapView.getUserPoint());
		pathOne.add(pA);
		pathOne.add(pB);
		pathOne.add(pC);
		pathOne.add(pD);
		pathOne.add(mapView.getDestinationPoint());

		return pathOne;

	}

	public List<PointF> calculatePathTwo() {

		List<PointF> pathTwo = new ArrayList<PointF>();

		pathTwo.add(mapView.getUserPoint());
		pathTwo.add(pB);
		pathTwo.add(pC);
		pathTwo.add(pD);
		pathTwo.add(mapView.getDestinationPoint());

		return pathTwo;

	}

	public List<PointF> calculatePathThree() {

		List<PointF> pathThree = new ArrayList<PointF>();

		pathThree.add(mapView.getUserPoint());
		pathThree.add(pC);
		pathThree.add(pD);
		pathThree.add(mapView.getDestinationPoint());

		return pathThree;

	}

	public List<PointF> calculatePathFour() {

		List<PointF> pathFour = new ArrayList<PointF>();

		pathFour.add(mapView.getUserPoint());
		pathFour.add(pD);
		pathFour.add(mapView.getDestinationPoint());

		return pathFour;

	}

	public List<PointF> calculatePathFive() {

		List<PointF> pathFive = new ArrayList<PointF>();

		pathFive.add(mapView.getUserPoint());
		pathFive.add(mapView.getDestinationPoint());

		return pathFive;

	}

	public List<PointF> calculatePathSix() {

		List<PointF> pathSix = new ArrayList<PointF>();

		pathSix.add(mapView.getUserPoint());
		pathSix.add(pA);
		pathSix.add(pB);
		pathSix.add(pC);
		pathSix.add(mapView.getDestinationPoint());

		return pathSix;

	}

	public List<PointF> calculatePathSeven() {

		List<PointF> pathSeven = new ArrayList<PointF>();

		pathSeven.add(mapView.getUserPoint());
		pathSeven.add(pA);
		pathSeven.add(pB);
		pathSeven.add(mapView.getDestinationPoint());

		return pathSeven;

	}

	public List<PointF> calculatePathEight() {

		List<PointF> pathEight = new ArrayList<PointF>();

		pathEight.add(mapView.getUserPoint());
		pathEight.add(pB);
		pathEight.add(pC);
		pathEight.add(mapView.getDestinationPoint());

		return pathEight;

	}

	public List<PointF> calculatePathNine() {

		List<PointF> pathNine = new ArrayList<PointF>();

		pathNine.add(mapView.getDestinationPoint());
		pathNine.add(pB);
		pathNine.add(pC);
		pathNine.add(mapView.getUserPoint());

		return pathNine;

	}

	public List<PointF> calculatePathTen() {

		List<PointF> pathTen = new ArrayList<PointF>();

		pathTen.add(mapView.getDestinationPoint());
		pathTen.add(pA);
		pathTen.add(pB);
		pathTen.add(mapView.getUserPoint());

		return pathTen;

	}

	public List<PointF> calculatePathEleven() {

		List<PointF> pathEleven = new ArrayList<PointF>();

		pathEleven.add(mapView.getDestinationPoint());
		pathEleven.add(pA);
		pathEleven.add(pB);
		pathEleven.add(pC);
		pathEleven.add(mapView.getUserPoint());

		return pathEleven;

	}

	public List<PointF> calculatePathTwelve() {

		List<PointF> pathTwelve = new ArrayList<PointF>();

		pathTwelve.add(mapView.getDestinationPoint());
		pathTwelve.add(pD);
		pathTwelve.add(mapView.getUserPoint());

		return pathTwelve;

	}

	public List<PointF> calculatePathThirteen() {

		List<PointF> pathThirteen = new ArrayList<PointF>();

		pathThirteen.add(mapView.getDestinationPoint());
		pathThirteen.add(pC);
		pathThirteen.add(pD);
		pathThirteen.add(mapView.getUserPoint());

		return pathThirteen;

	}

	public List<PointF> calculatePathFourteen() {

		List<PointF> pathFourteen = new ArrayList<PointF>();

		pathFourteen.add(mapView.getDestinationPoint());
		pathFourteen.add(pB);
		pathFourteen.add(pC);
		pathFourteen.add(pD);
		pathFourteen.add(mapView.getUserPoint());

		return pathFourteen;

	}

	public static List<PointF> calculatePathFifteen() {

		List<PointF> pathFifteen = new ArrayList<PointF>();

		pathFifteen.add(mapView.getDestinationPoint());
		pathFifteen.add(pA);
		pathFifteen.add(pB);
		pathFifteen.add(pC);
		pathFifteen.add(pD);
		pathFifteen.add(mapView.getUserPoint());

		return pathFifteen;

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
	}


}