package ex0206.array.goods;
/**
  각 요청에 대한 로직(기능)을 담당할 클래스
  (등록 , 전체검색, 부분검색, 수정, 삭제 등등.....)
*/
public class GoodsService{

	//상품을 관리할 배열 선언
	private Goods [] goodsArr = new Goods [10];
	public static int count;//0 배열방에 저장 객체의 개수 

    //초기치 데이터를 세팅하는 메소드
	String [][] data = new String [][]{
		 {"A01" , "새우깡" , "2500" , "짜고 맛나다."},  //---> Goods 
		 {"A02" , "고구마깡" , "3500" , "고구맛이고 달다."},  //---> Goods 
		 {"A03" , "감자깡" , "5000" , "감자맛에 고소한맛."}, // ---> Goods 
		 {"A04" , "허니버터칩" , "2200" , "달콤 하다."},
		 {"A05" , "콘칩" , "3000" , "고소하다."}
	};
	public void init(String [][] data){ //위의 초기데이터 세팅
		for(int i=0; i<data.length; i++) {
			goodsArr[count++] = this.create( data[i] ); //아래에서 생성한 배열에 담긴 굿즈 정보를 goodsArr 배열에 증가하면서 생성
		}
		System.out.println("\n***초기화 완료***\n");
	}//메소드끝


   /**
      Goods를 생성해서 값을 설정하고 생성된 Goos를 리턴하는 메소드 
   */
   private Goods create(String [] row){//{"A01" , "새우깡" , "2500" , "짜고 맛나다."}
	   Goods goods = new Goods();
	   goods.setCode(row[0]);
	   goods.setName(row[1]);
	   goods.setPrice(Integer.parseInt(row[2]));
	   goods.setExplain(row[3]);
	   
	   return goods;
   }


   /**
     등록(등록실패 - 중복인경우, 배열의 길이 벗어난경우)
	 @return : 
			 0이면 상품코드 중복 ,
			 1이면 등록성공, 
			 -1이면 배열의 길이 벗어남
   */
   public int insert(Goods goods){
	   
	   // 배열의 길이 체크
	   if(goodsArr.length == count) return -1;

	   //코드 중복체크: 현재 가지고있는 상품코드 중 사용자가 입력한 코드와 일치한다면 0을 리턴
	   if(selectByCode(goods.getCode()) != null) {
		   return 0;
	   }
	   // 입력한 코드가 존재하지 않는다면 등록 성공
	   goodsArr[count++] = goods; // 배열에 카운트 증가
	   //System.out.println("selectAll count = " + count);
	   return 1;
   }


   /**
     전체검색
   */
   public Goods[] selectAll( ){
	   System.out.println("selectAll count = " + count);
	   
	   return goodsArr; //
   }

   /**
     상품코드에 해당하는 상품 검색
	 @return : 만약 code에 해당하는 값이 있으면 Goods를 리턴하고
	           없으면 null 리턴
   */
   public Goods selectByCode(String code){
       for(int i=0; i<count; i++) {
    	   Goods find = goodsArr[i]; //찾은 상품의 한 행의 정보(배열방에 있는 주소값)
    	   String c = find.getCode(); //저장된 상품코드 꺼내오기
    	   String upper = c.toUpperCase(); //코드를 대문자로 자동변환
    	   if( upper.equals(code.toUpperCase()) ) { //찾은 코드와 입력한 코드가 일치하면 정보 출력
	    	   return find;
    	   }
       }
       return null;
   }


   /**
    상품코드에 해당하는 가격, 설명 수정하기 
	@return : true이면 수정완료, false이면 수정실패
   */
   public boolean update(Goods goods){ //수정하려는 코드, 변경값 - 가격, 설명
	   Goods schUpdate = this.selectByCode(goods.getCode());
	   if(schUpdate != null) {//존재하는 코드와 입력한 코드가 같다면
		   schUpdate.setCode(goods.getCode()); //입력한 형태로 배열에 저장
		   schUpdate.setName(goods.getName());
		   schUpdate.setPrice(goods.getPrice());
		   schUpdate.setExplain(goods.getExplain());
		   return true;
	   }
       return false;
   }

   /**
    * 삭제하려는 상품코드를 입력 받아 
    * - 상품코드에 해당하는 정보를 찾고 있으면 index(번지수)를 받는다.
    * - index에 해당하는 상품을 배열에서 null바꾼다.
    * - index 이후부터 앞으로 하나씩 옮긴다.
    * - count변수의 위치의 배열공간 null 변경하다
    * - count 감소한다.
   */
   public int findLocate(String code) {
	   for(int i=0; i<count; i++) {
		   if( goodsArr[i].getCode().equals(code) ) {//배열에 있는 코드와 입력받은 코드가 같다면
			   return i; //찾아서 리턴
		   }
	   }
	   return -1; //찾지 못함
   }
   public int delete(String code) {
	   int locate = this.findLocate(code);
	   if(locate == -1) return -1;
	   
	   goodsArr[locate] = null; //코드를 찾으면 null값을 해당 로케이트(배열위치)에 저장
	   for(int i=locate; i<count-1; i++) { //카운트 개수 마지막 인덱스 전까지
		   goodsArr[i] = goodsArr[i+1]; //현재 인덱스의 바로 뒤 인덱스를 앞으로 가져온다
	   }
	   goodsArr[--count] = null; //마지막 인덱스는 null
	   return 1;
   }
   
   

}