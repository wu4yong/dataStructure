package ch01;
import java.math.*;
import java.util.*;
  
public class TestB {
	  public static void main(String[] args){
	  	System.out.println("������Ҫ��׳˵���ֵ:");
	  	Scanner in = new Scanner(System.in);
	  	int value = in.nextInt();
	  	BigInteger result = BigInteger.valueOf(1);
	  	for(int i=1; i<=value;i++){
	  		result =result.multiply(BigInteger.valueOf(i));
	  		
	  		}
      System.out.println(result);	  	
	  	}
	
	}
