package ex0213;
/**
 * 예외 발생 예제
 * */
public class ExceptionExam {

	public static void main(String[] args) {
		
		System.out.println("***메인 시작***");
		System.out.println("args = " + args);
		try {
			// run as -> run configurations -> argument탭에서 인수값 입력 가능
			System.out.println("args [0] = " + args[0]);
			
			int convertNo = Integer.parseInt(args[0]); //만약 인수에 문자열을 넣게 되면 예외 발생(=NumberFormatException)
			System.out.println("변환 값 = " + convertNo);
			
			int result = 100/convertNo;
			System.out.println("나눈 결과 = " + result);
			
		}catch(ArrayIndexOutOfBoundsException e) { //예외 발생 시 실행
			System.out.println("인수를 전달해 주세요. \n" + e);
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력해 주세요. \n" + e.getMessage());
		}catch(Exception e) { //예측하지 못한 모든 예외처리가 들어온다
			System.out.println("예외가 발생했습니다.");
			
			// 개발자가 개발할 때 예외에 대한 정보를 추적(디버깅)할 때 사용한다, 예외가 발생한 정보들은 stack에 쌓인다.
			// 반드시 배포(production환경)에서는 제거해야 한다.
			e.printStackTrace(); 
		}finally {
			System.out.println("finally 영역은 예외 상관없이 항상 실행해요");
		}
		System.out.println("***메인 끝***");
		
	}

}
