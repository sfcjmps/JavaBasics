package com.hcl.quiz;

public class Parent {
	

		  public static void main(String[] args) {

		    Parent parentRefP = new Parent();

		    Parent parentRefC = new Child();

		    Child childRef = new Child();

		    parentRefC.childMethod(); //line 1

		    (Child)parentRefC.childMethod(); //line 2

		    ((Parent)parentRefC).childMethod(); //line 3

		    ((Child) parentRefC).childMethod(); // line 4

		    ((Child) parentRefP).childMethod(); // line 5

		    childRef.childMethod(); // line 6

		    (Parent)childRef.childMethod(); //line 7

		    ((Parent)childRef).childMethod(); //line 8

		  }

		}



		class Child extends Parent {

		  public void childMethod() {

		    System.out.println("childMethod!");

		  }

		}


