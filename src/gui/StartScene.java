package gui;

import java.awt.Image;

import gui.DrawImageOnCanvas.ImageLoader;
import gui.scenes.Scene;
import images.ImageData;

public class StartScene extends Scene {

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
	    		        if(x==8)
	    		        	testImage = ImageLoader.loadImage("src/images/sprites/environments/Desert.png");
	    		        if(x==7)
	    		        	testImage = ImageLoader.loadImage("src/images/sprites/environments/RailEnd.png");
	        		}
			        environment.add(new ImageData(testImage,x,y));
	        	}
	        }
		
	}

}