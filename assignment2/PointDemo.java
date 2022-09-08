package com.oops.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PointDemo
{
  public static void main(String[] args)
  {
	  //for traingl reading vextex
	Map<String,MyCoord> mt =new HashMap<String,MyCoord>();
	                     mt.put("point1",new  MyCoord(10,20));
	                     mt.put("point2",new  MyCoord(20,30));
	                     mt.put("point3",new  MyCoord(10,30));
	                     System.out.println("----in Traingle-----");
	                     MyCoord mc = mt.get("point1");
	                     System.out.println("vertex A has these coordinates:- "+mc.getX()+" "+ mc.getY());
	                     MyCoord mc1 = mt.get("point2");
	                     System.out.println("Vertex B vertex has these coordinates:- "+mc1.getX()+" "+ mc1.getY());
	                     MyCoord mc2 = mt.get("point3");
	                     System.out.println("Vertex C vertex has these coordinates:- "+mc2.getX()+" "+ mc2.getY());
	   //calculate area of traingle
	                     Triangle t= new Triangle();
	                              t.area();
	   //calculate are of rect
	                       Rectangle r =new Rectangle();
	                          r.area();
	     //calculate area of square
	                       Square s =new Square();
	                              s.area();
	                             
  }
}
