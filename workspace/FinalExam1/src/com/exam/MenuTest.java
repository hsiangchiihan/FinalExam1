package com.exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MenuTest {
List<Menu> menus =new ArrayList<>();
    
    public void on(){
    	for(int i =0;i<menus.size();i++){
    		Menu menu =menus.get(i);
    		System.out.println(menu.getId()+")"+"\t"+menu.getName()+"\t");
    	}    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
