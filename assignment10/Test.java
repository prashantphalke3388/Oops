package com.oops.assignment10;

public class Test 
{
public static void main(String[] args) throws CloneNotSupportedException
{
	
	Product product = new Product(101,20000,10,"Vivo Mobile");
	System.out.println("original value: "+product);
	
	Product copyProduct = (Product) product.clone();
	copyProduct.setPname("OnePlus Mobile");
	copyProduct.setPrice(32000);
	System.out.println("after clonning: "+copyProduct);
	
	if(copyProduct instanceof Product)
	{
		System.out.println("new object is belongs to Product class");
	}
	else
{
		System.out.println("new object is not beongs to Product class");
	}
}
}	
	


