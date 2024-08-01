package cau3;

import java.util.Random;
import java.util.Scanner;

public class TroChoi {
	
	static final int TIME_MAX = 5;   // 5 giây max
	static final int LEFT_LIMIT = 97; // 'a'
	static final int RIGHT_LIMIT = 122; // 'z'
	static final String GAME = "MASTER TYPE";
	static final int MENU_STOP = 0;
	static final int MENU_RULE = 1;
	static final int MENU_START = 2;
	
	String ten;
	int soLuot;
	Random generator;
	Scanner scanner;

	TroChoi() {
		this.ten = GAME;
		this.generator = new Random();
		this.scanner = new Scanner(System.in);
	}
	
	void batDau() {
		System.out.println("Bắt đầu chơi " + this.ten);	
		troChoi();
	}
	
	void troChoi() {
		try {
			int menu;
			
			troChoi:
			do {
			    //B1: Đưa ra menu
			    menu = menu();
			    menu:
			    switch (menu) {
				    case MENU_STOP:
				    	break troChoi;
				    case MENU_RULE, MENU_START:
				    	break menu;
				    default:
				    	System.out.println("Dữ liệu nhập vào không hợp lệ!");
				    	break troChoi;
				}
			    
			    //B2: Bắt đầu trò chơi
				System.out.println("<<<<<<<<<<<<<<<<<<<ROUND " + ++this.soLuot + ">>>>>>>>>>>>>>>>>>>>");
			    int n = 10;	// Chiều dài của chuỗi
			    Random random = new Random();
			    StringBuilder buffer = new StringBuilder(n);
			    for (int i = 0; i < n; i++) {
			        int limitInt = LEFT_LIMIT + (int) 
			          (random.nextFloat() * (RIGHT_LIMIT - LEFT_LIMIT + 1));
			        buffer.append((char) limitInt);
			    }
			    String randomString = buffer.toString();	
			    System.out.println(randomString);
			   
			    long start = System.currentTimeMillis();
			    String text = scanner.nextLine();
			    long finish = System.currentTimeMillis();
			    long time = (finish - start) / 1000;
	
			    //B3: In ra kết quả
			    if (!text.equals(randomString) || time > TIME_MAX) {
			    	System.out.println("Try again!");
			    } else {
			    	System.out.println("Congratulation!");
			    }			    
			} while (menu != MENU_STOP);			
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	    
	    //Kết thúc trò chơi
	    ketThuc();
	}
	
	void ketThuc() {
		System.out.println("Trò chơi đã kết thúc!");
	}
	
	int menu() {
		int menu = -1;
		
		try {
			System.out.println("-------------------------------------------------");
		    System.out.println("Menu \n + " + MENU_RULE + ": Luật chơi \n" 
		    		+ " + " +  MENU_START + ": Thực hiện trò chơi \n"
		    		+ " + " + MENU_STOP + ": Dừng trò chơi ");
		    menu = this.scanner.nextInt();
		    
		    switch (menu) {
		    	case MENU_STOP, MENU_START:
		    		break;
		    	case MENU_RULE:
			    	System.out.println("Luật chơi: Hãy nhập theo đúng những kí tự được đưa ra trong vòng "
			    			+ TIME_MAX + " giây!");
			    	break;
			    default:
			    	break;
		    }
		    scanner.nextLine();
		} catch (Exception ex) {
			System.out.println("Dữ liệu nhập vào không hợp lệ!");
			ex.printStackTrace();
		}
		
		return menu;
	}
}
