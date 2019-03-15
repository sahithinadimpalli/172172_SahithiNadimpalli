package com.cg.Aop.service;

import com.cg.Model.Circle;
import com.cg.Model.Triangle;

public class ShapeService {
 private Triangle trianlge;
 private Circle circle;
public Triangle getTrianlge() {
	return trianlge;
}
public void setTrianlge(Triangle trianlge) {
	this.trianlge = trianlge;
}
public Circle getCircle() {
	return circle;
}
public void setCircle(Circle circle) {
	this.circle = circle;
}
}
