package homework;

import java.util.Scanner;

public class Product {

	private String num;
	private String name;
	private String company;
	private int price;
	private int amount;
	private int money;
	
	
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("제품번호 : ");
		num=sc.next();
		System.out.println("제품명 : ");
		name=sc.next();
		System.out.println("제조사 : ");
		company=sc.next();
		System.out.println("단가 : ");
		price=sc.nextInt();
		System.out.println("수량 : ");
		amount=sc.nextInt();
	
		
		
		
		money=price*amount;
		
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
}


	