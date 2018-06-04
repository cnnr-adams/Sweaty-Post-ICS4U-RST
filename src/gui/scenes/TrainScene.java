package gui.scenes;

import java.awt.Image;

import gui.DrawImageOnCanvas.ImageLoader;
import gui.scenes.Scene;
import images.ImageData;

public class TrainScene extends Scene {

	public void instantiate() {
		 Image testImage = ImageLoader.loadImage("src/images/sprites/environments/Desert.png");
	        for(int x = 0; x < 9; x++) {
	        	for(int y = 0; y < 6; y++) {
	        		if(y>0) {
		        		int worldGen = (int) (18 * Math.random() + 1);
				        switch (worldGen)  //switches are used to set the tile based on a random number (1-6)
				        {
				            case 1:  
				            	testImage = ImageLoader.loadImage("src/images/sprites/environments/DesertRock.png");
			        		break;
				            case 2:  
				            	testImage = ImageLoader.loadImage("src/images/sprites/environments/DesertFlower.png");
			        		break;
				            default:  
				            	int desertGen = (int) (3 * Math.random() + 1);
			    		        switch (desertGen)  //switches are used to set the tile based on a random number (1-6)
			    		        {
			    		            case 1:  
			    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/Desert2.png");
			    	        		break;
			    		            case 2:  
			    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/Desert3.png");
			    	        		break;
			    		            default:  
			    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/Desert.png");
			    	        		break;
			    		        }
			        		break;
				        }
	        		}
	        		else
	        		{
	        			int railGen = (int) (6 * Math.random() + 1);
	    		        switch (railGen)  //switches are used to set the tile based on a random number (1-6)
	    		        {
	    		            case 1:  
	    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/RailBroken1.png");
	    	        		break;
	    		            case 2:  
	    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/RailBroken2.png");
	    	        		break;
	    		            default:  
	    		                testImage = ImageLoader.loadImage("src/images/sprites/environments/Rail.png");
	    	        		break;
	    		        }
	        		}
			        if(x==8&&y==3)
			        	testImage = ImageLoader.loadImage("src/images/sprites/interactables/DesertChangeRight.png");
			        if(x==0&&y==5)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseOutsideCorner1.png");
			        if(x==5&&y==5)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseOutsideCorner2.png");
			        if(x==5&&y==2||x==2&&y==1)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseOutsideCorner3.png");
			        if(x==0&&y==1)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseOutsideCorner4.png");
			        if(x==1&&y==1||x==3&&y==2||x==4&&y==2||x==3&&y==3||x==2&&y==3)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseEdgeDown.png");
			        if(x==1&&y==5||x==2&&y==5||x==2&&y==4||x==3&&y==5||x==3&&y==4||x==4&&y==5)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseEdgeUp.png");
			        if(x==5&&y==3||x==5&&y==4)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseEdgeRight.png");
			        if(x==0&&y==3||x==0&&y==4||x==0&&y==2||x==1&&y==3)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseEdgeLeft.png");
			        if(x==1&&y==4)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseInsideCorner1.png");
			        if(x==4&&y==4)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseInsideCorner2.png");
			        if(x==4&&y==3)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseInsideCorner4.png");
			        if(x==1&&y==2)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseU.png");
			        if(x==2&&y==2)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseDiagonal.png");
			        if(x==1&&y==3)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/HouseDot.png");
			        if(x==4&&y==1)
			        	testImage = ImageLoader.loadImage("src/images/sprites/environments/Steps.png");
			        environment.add(new ImageData(testImage,x,y));
	        	}
	        }
		
	}

}
