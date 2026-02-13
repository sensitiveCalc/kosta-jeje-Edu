package ex0206.array.student;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		
	    String [][] data = new String [][] {
	    	{"제제","31","성남"},
	    	{"소리","35","서울"},
	    	{"수연","30","고양"},
	    	{"민아","36","인천"},
	    	{"경주","27","호주"},
	    };
		
	
		StudentService service = new StudentService();//StudentService의 전역변수들이 초기화 
		service.init(data); // 초기치데이터 세팅
		
		//전체학생정보 출력
		Student[] stArr = service.selectAll();
		StudentEndView.printSelectAll(stArr);
		
		//등록하기
		System.out.println("\n--1. 등록하기 -----");
		Student student = new Student();
		student.setName("세승");
		student.setAge(25);
		student.setAddr("전주");
		
		int result = service.insert(student);
		if(result==0) 
			StudentEndView.printMessage(student.getName()+"중복입니다. 등록실패");
		else if(result==-1)
			 StudentEndView.printMessage("인원이 초과하여 등록할수 없습니다.");
		else
			StudentEndView.printMessage("등록되었습니다.");
		
		
		
		System.out.println("\n--2. 전체검색 -----");
		StudentEndView.printSelectAll( service.selectAll() );
		
		//이름으로 검색하기
		System.out.println("\n--3. 이름으로 검색 -----");
		service.selectByName("세승");
		
		System.out.println("\n--이름이 없는경우----");
		service.selectByName("삼순이");
		
		
		//수정하기 
		System.out.println("\n--4. 수정하기 -----");
		Student st2 = new Student();
		st2.setName("경주");//조건
		st2.setAge(23);
		st2.setAddr("경주");
		
		if( service.update(st2) ) {
			StudentEndView.printMessage(st2.getName()+"님 정보를 수정했습니다.");
		}else {
			StudentEndView.printMessage("수정되지 않았습니다.");
		}

		System.out.println("\n---변경후 ---");
		service.selectAll();
		StudentEndView.printSelectAll(stArr);

	}

}








