package com.mishin870.ptest.model;

import com.mishin870.ptest.model.farm.IFarm;

public class SimpleFieldModel implements FieldModel {
	private IFarm[][] farms;
	private int width, height;
	
	public SimpleFieldModel(int width, int height) {
		this.width = width;
		this.height = height;
		this.farms = new IFarm[width][height];
	}
	
	@Override
	public boolean placeFarm(IFarm farm) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (farms[x][y] == null) {
					setFarm(x, y, farm);
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public void setFarm(int x, int y, IFarm farm) {
		this.farms[x][y] = farm;
	}
	
	@Override
	public IFarm getFarm(int x, int y) {
		return this.farms[x][y];
	}
	
	@Override
	public int collectIncome() {
		int result = 0;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (this.farms[x][y] != null) {
					result += this.farms[x][y].getIncome();
					if (!this.farms[x][y].spend()) {
						setFarm(x, y, null);
					}
				}
			}
		}
		return result;
	}
	
	@Override
	public IFarm[][] getField() {
		return this.farms;
	}
	
}
