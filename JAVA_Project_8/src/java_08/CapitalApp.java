package java_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	private HashMap<String,String> map = new HashMap<String,String>();
	static Scanner sc = new Scanner(System.in);
	public CapitalApp() {
;		map.put("한국", "서울");
		map.put("일본", "도쿄");
		map.put("중국", "베이징");
		map.put("미국", "워싱턴");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
	}
	public static void showMenu() {
		System.out.println("=====수도 맞추기 게임 시작=====");
		System.out.println("1.문제입력 2.퀴즈 3.종료 >>");
	}
	public void input() {
		while(true) {
			System.out.println("나라와 수도 입력 (종료는 x)>>");
			String nara = sc.next();
			if(nara.equalsIgnoreCase("x")) break;
			if(map.containsKey(nara)) {
				System.out.println("이미 입력한 나라입니다.");
				continue;
			}
			String sudo = sc.next();
			map.put(nara, sudo);
			System.out.println("추가 성공");
		}
	}
	public void quiz() {
		Set<String> set = map.keySet();//키 값만 구하기
		//구한 키값 set을 배열에 담기 (순서)
//		Object [ ]arr = set.toArray();
		//구한 키값 set을 ArrayList에 담기 (순서)
		ArrayList <String> list = new ArrayList <String>(set);
		while(true) {
			int r = (int)(Math.random()*map.size());
			
			//문제로 출력될 나라
//			String country = (String)arr[r]; 
			String country = list.get(r);
			
			//문제 출제
			System.out.println(country + "수도는 ? (종료 x) >> ");
			String dap = sc.next();
			if(dap.equalsIgnoreCase("x"))break;
			if(map.get(country).equals(dap)){
			System.out.println("정답입니다!!");
			}else {
				System.out.println("오답입니다.");
			}
		}
		
	}
	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while(true) {
			CapitalApp.showMenu();
			int choice = CapitalApp.sc.nextInt();
			switch(choice) {
			case 1:ca.input();
			case 2:ca.quiz();
			case 3:System.out.println("종료");	
				System.exit(0);
			default:System.out.println("입력오류");
			
			}
		}

	}

}
