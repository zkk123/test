package com.math.util;
	public abstract class HorseRaceLamp{
		 public  int startIndex=1,endIndex;
		 private  int currentIndex,size;
		 private int times=10;
		 public  boolean isIncrease=true;
		 private boolean start=false;
		 public HorseRaceLamp(int endIndex,int times) {
				super();
				this.endIndex = endIndex;
				currentIndex=startIndex;
				this.times=times;
				size=endIndex-startIndex+1;
			 }
		 public HorseRaceLamp(int startIndex, int endIndex,int times) {
			super();
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			currentIndex=this.startIndex;
			this.times=times;
			size=endIndex-startIndex+1;
		 }
        public void start(){
        	if(size<1)return;
        	for(int i=0;i<times;i++){
        		switchLamp();
        		if(i==times)start=false;
        		run(currentIndex,isIncrease);
        	}
        }
        public abstract void run(int currentIndex,boolean isIncrease);
		private  void switchLamp(){
			 if(start){
				 if(size==1){
					 isIncrease=!isIncrease;
					 return;
				 }
				 if(size==2){
					 if(isIncrease){
						 isIncrease=!isIncrease;
						 currentIndex=endIndex;
					 }else{
						 isIncrease=!isIncrease;
						 currentIndex=startIndex;
					 }
					 return;
				 }
			 if(currentIndex==startIndex){
				 currentIndex++;
				 isIncrease=true;
			 }else if(currentIndex==endIndex){
				 currentIndex--;
				 isIncrease=false;
			 }else if(currentIndex<endIndex){
				 if(isIncrease){
					 currentIndex++;
					 if(currentIndex==endIndex)isIncrease=false;
				 }else{
					 currentIndex--;
					 if(currentIndex==startIndex)isIncrease=true;
				 }
				
			 }
		 }else{
			 start=true; 
		 }}
		 
}
