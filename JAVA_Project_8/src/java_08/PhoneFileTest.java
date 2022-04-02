package java_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneFileTest {
	private HashMap<String, String> map = new HashMap<String, String>();
	//Scanner 사용
	public void load() { //파일을 읽어서 map에 저장
		try {
			Scanner sc = new Scanner(new File("/Users/songsumin/JAVA08/phone.txt"));
			while(sc.hasNext()) {
				String name = sc.next();
				String phoneNum = sc.next();
				map.put(name, phoneNum);
			}
			System.out.println(map.size() +" 개 전화번호 있음");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public void search() {
		//찾을 이름을 입력받아 전화번호 알려주기
		//만약 이름이 없으면 찾는 친구 없음 이라고 출력하기
		Scanner  keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("찾을 이름(종료 x) >>");
			String name = keyboard.next();
			if(name.equalsIgnoreCase("x")) break;
//			if(map.containsKey(name)) {
//				System.out.println(map.get(name));
//			}else {
//				System.out.println(name + "존재 하지 않습니다.");
//			}
			if(map.get(name)==null) {
				System.out.println(name + "존재 하지 않습니다.");
			}else {
				System.out.println(map.get(name));
			}
	
		}
		
	}
	public void save() { //map 을 파일로 저장
		map.put("최자바","010-8888-9999");
		map.put("이자바","010-4444-5555");
		FileWriter fw =null;
		try {
			 fw = new FileWriter("/Users/songsumin/JAVA08/phone.txt");
			//맵에서 키(이름) 값만 가져와서 그 키에 대한 전화번호 출력
		 Set<String> set = 	map.keySet();
		 Iterator<String> it = set.iterator();
		 while(it.hasNext()) {
			 String key = it.next();//이름
			 String value = map.get(key); //전화번호
			 fw.write(key+"  ");
			 fw.write(value+"\n");
		 }
		} catch (IOException e) {
				e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		PhoneFileTest pt = new PhoneFileTest();
		pt.load();
		pt.search();
		pt.save();
	}


}
