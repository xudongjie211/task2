package com.jnshu.util;

public class Page {
	public int start=0;
	public int step=3;
	public int last;
	
	public void calculate(int sum){
		if(sum>0&&sum%step==0){
			last=sum-step;			
		}else if(sum==0){
			last=0;
		}else {
			last=sum-sum%step;
		}
		
		
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}
}
