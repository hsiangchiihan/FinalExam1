package com.exam;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuTest mt =new MenuTest();
		try {
			FileReader fr =new FileReader("menu.txt");
			BufferedReader in =new BufferedReader(fr);
			String line;
			String tempstring;
			String[] tempArray =new String[4];
			ArrayList<String> menuList =new ArrayList<String>();
			int i=0;
			while((line =in.readLine()) !=null){
				tempstring =line;
				tempArray =tempstring.split(",");
				for(i=0;i<tempArray.length;i++){
					menuList.add(tempArray[i]);					
				}				
			}
			System.out.println(menuList);
			System.out.println("0)結算");
	    	System.out.println("請輸入餐點:");
	    	Scanner s1 =new Scanner(System.in);
	    	//int num1 =s1.nextInt();
	    	int data =-1;
	    	while (data !=0){
				data =s1.nextInt();
				switch(data){
				case 1:				
					System.out.println("1.大麥克");
					System.out.println("請輸入數量:");	
					Scanner s2 =new Scanner(System.in);
					int counts =s2.nextInt();
					System.out.println("目前餐點:");
					System.out.println("1.大麥克"+" "+counts+"份");
					System.out.println("==========================");
					break;
					
				case 2:			
		    		System.out.println("2.雙層吉士牛肉堡");
		    		System.out.println("請輸入數量:");
		    		Scanner s3 =new Scanner(System.in);
					int counts1 =s3.nextInt();
					System.out.println("目前餐點:");
					System.out.println("2.雙層吉士牛肉堡"+" "+counts1+"份");
					System.out.println("==========================");
		    		break;
				case 3:			
		    		System.out.println("3.麥脆雞原味");
		    		System.out.println("請輸入數量:");
		    		Scanner s4 =new Scanner(System.in);
					int counts2 =s4.nextInt();
					System.out.println("目前餐點:");
					System.out.println("3.麥脆雞原味"+" "+counts2+"份");
					System.out.println("==========================");
		    		break;
				case 4:			
		    		System.out.println("4.麥香魚");
		    		System.out.println("請輸入數量:");
		    		Scanner s5 =new Scanner(System.in);
					int counts3 =s5.nextInt();
					System.out.println("目前餐點:");
					System.out.println("4.麥香魚"+" "+counts3+"份");
					System.out.println("==========================");
		    		break;
				case 5:			
		    		System.out.println("5.薯條大包");
		    		System.out.println("請輸入數量:");
		    		Scanner s6 =new Scanner(System.in);
					int counts4 =s6.nextInt();
					System.out.println("目前餐點:");
					System.out.println("5.薯條大包"+" "+counts4+"份");
					System.out.println("==========================");
		    		break;
				case 6:			
		    		System.out.println("6.可樂");
		    		System.out.println("請輸入數量:");
		    		Scanner s7 =new Scanner(System.in);
					int counts5 =s7.nextInt();
					System.out.println("目前餐點:");
					System.out.println("6.可樂"+" "+counts5+"份");
					System.out.println("==========================");
		    		break;
				case 7:			
		    		System.out.println("7.冰紅茶");
		    		System.out.println("請輸入數量:");
		    		Scanner s8 =new Scanner(System.in);
					int counts6 =s8.nextInt();
					System.out.println("目前餐點:");
					System.out.println("7.冰紅茶"+" "+counts6+"份");
					System.out.println("==========================");
		    		break;
				case 'q':
                    data =0;
					break;
				}
			}	    
			System.out.println(menuList);
			/*String line =in.readLine();
			String[] tokens =line.split(",");		
			while((line =in.readLine()) !=null){                			
				for(int i =0;i<line.length();i++){
				int id =Integer.parseInt(tokens[0]);
				String name =tokens[i];
				int price =Integer.parseInt(tokens[i+2]);
				int kcal =Integer.parseInt(tokens[i+3]);
				mt.menus.add(new Menu(i+1,name,price,kcal));
			}
			}*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    mt.on();
	}

}
