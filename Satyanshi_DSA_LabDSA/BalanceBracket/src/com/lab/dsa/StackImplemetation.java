package com.lab.dsa;

public class StackImplemetation {
	
      char arr[];
	  int top;
	  int capacity;

	  StackImplemetation(int size) {
	    arr = new char[size];
	    capacity = size;
	    top = -1;
	  }

	  // push elements
	  public void push(char x) {
	    if (top == capacity - 1) {
	      System.out.println("Stack OverFlow");
	      return;
	    }
	    arr[++top] = x;
	  }
      
	  //Pop elements
	  public char pop() {

	    if (top == -1) {
	      System.out.println("STACK EMPTY");
	      return 'E';
	    }
	    return arr[top--];
	  }
	  
	  public Boolean isEmpty() {
		    return top == -1;
		  }
}
