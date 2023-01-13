package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void main(String[] args) {
		Map<String, Object>map=new HashMap<>();
		List<Ec> list = new ArrayList<>();
		list.add(new Ec(1234, " 2023-01-04 ", "하이트맥주","삼성", "37918000068", 55900));
		list.add(new Ec(2345, " 2022-12-12 ", "꼬깔콘","롯데", "35691000045", 23600));
		list.add(new Ec(3456, " 2023-01-01 ", "노트북","현대", "36160000182", 2600000));
		
		map.put("list", list);
		print(map);
	}
static void print(Map<String, Object> map) {
		ArrayList<Ec> list2 = (ArrayList<Ec>)map.get("list");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-------------------------------------------------------------------------");
		for(Ec c : list2) {
			System.out.println(c.getNo()+"\t"+c.getOrderDate()+"\t"+c.getProduct()+"\t"+c.getCardName()+"\t"+c.getCardNo()+"\t"+String.format("%d", c.getPay()));
		}
		System.out.println("-------------------------------------------------------------------------");
	}
}



