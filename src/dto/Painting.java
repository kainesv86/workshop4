/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import helper.ScannerCus;
import helper.Validator;

/**
 *
 * @author Kaine
 */
public class Painting extends Item{
	private int height;
	private int width;
	private boolean isWatercolour;
	private boolean isFramed;

	public Painting(){
		super();
		this.height = 0;
		this.width = 0;
		this.isWatercolour = false;
		this.isFramed = false;
	}
	

	public Painting(int value, String creator,int height, int width, boolean isWatercolour, boolean isFramed){
		super(value,creator);
		this.height = height;
		this.width = width;
		this.isWatercolour = isWatercolour;
		this.isFramed = isFramed;
	}

	//Getter

	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public boolean getIsWatercolour() {
		return this.isWatercolour;
	}
	
	public boolean getIsFramed() {
		return this.isFramed;
	}
	
	//Setter

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setIsWatercolour(boolean isWatercolour) {
		this.isWatercolour = isWatercolour;
	}

	public void setIsFramed(boolean isFramed) {
		this.isFramed = isFramed;
	}
	
	//Method

	public void inputPainting() {
		ScannerCus sc = new ScannerCus();	
		
		input();
		
		this.height = sc.getInt(1, Integer.MAX_VALUE, "Invalid value please try again", "Input a height: ");
		this.width = sc.getInt(1, Integer.MAX_VALUE, "Invalid value please try again", "Input a width: ");
		
		System.out.println("Input isWatercolour: ");
		this.isWatercolour = sc.getBoolean();
		System.out.println("Input isWatercolour: ");
		this.isFramed = sc.getBoolean();
		
	}

	public void outputPainting() {
		output();
		System.out.println("Height: " + this.height);
		System.out.println("Width: " + this.width);
		System.out.println("Water colour: " + this.isWatercolour);
		System.out.println("Framed: " + this.isFramed);
	}
	
}


