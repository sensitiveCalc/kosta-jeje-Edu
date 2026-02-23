package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {
	
	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
    private static final int MAX_SIZE=10;
    List<Electronics> list = new ArrayList<Electronics>();
    
    
    /** 
     * 외부에서 객체 생성안됨. 
     * InitInfo.properties파일을 로딩하여  List에 추가하여
     * 초기치 데이터를 만든다.
     * 
     */
    private ElectronicsServiceImpl() {
    	System.out.println("**private constructor init.....");
    	ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
        for(String key : rb.keySet()) {
     	  String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
     	  String data[] = value.split(","); // 콤마를 기준으로 데이터 분리
     	  //System.out.println(key +" = " + value); //키=값 형태로 출력
     	  list.add(new Electronics( Integer.parseInt(data[0]) ,data[1], 
     			  Integer.parseInt( data[2]), data[3]) );
        }
       // System.out.println(list); // 초기치 데이터 세팅
      
    }
    
    public static ElectronicsService getInstance() {
		return instance;
	}
    /**
    @return : 
		 0이면 모델번호 중복 ,
		 1이면 등록성공, 
		 -1이면 배열의 길이 벗어남
	 */
	@Override
	public void insert(Electronics electronics) 
			  throws ElectronicsArrayBoundsException, DuplicateModelNoException {
		//배열 길이 체크
		if(list.size() == MAX_SIZE) {
			throw new ElectronicsArrayBoundsException("저장 공간이 가득 찼습니다.");
		}
		
		try { //모델번호 중복여부 체크
			this.searchByModelNo(electronics.getModelNo());
			throw new DuplicateModelNoException(electronics.getModelNo() + "코드는 중복이므로 등록할 수 없습니다.");
		} catch(SearchNotFoundException e) {
			list.add(electronics);
		}
		
		//모델번호 중복체크
		/*for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				throw new DuplicateModelNoException("이미 존재하는 모델번호입니다.");
			}
		}
		// 등록 성공 시
		list.add(electronics);
		*/
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}
	
	/**
	 * 모델번호에 해당하는 상품 검색
	 * @return : 모델번호에 해당하는 값이 있으면 list를 리턴하고 없으면 null 리턴
	 */
	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		for(Electronics e : list) {
			if ( e.getModelNo()  == modelNo) {
				System.out.println("model 넘버는" + modelNo);
				return e;
			}
		}
		throw new SearchNotFoundException(modelNo+"에 헤당하는 모델번호를 찾을 수 없습니다.");
	}
	
	// 수정(모델 업데이트)
	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		for(Electronics e : list) {
			if(e.getModelNo() == electronics.getModelNo()) {
				e.setModelName(electronics.getModelName()); //setModelName(DB)에 들어있는 데이터를 사용자 입력 데이터로 변환
				e.setModelPrice(electronics.getModelPrice());
				e.setModelDetail(electronics.getModelDetail());
				return;
			}
		}
		throw new SearchNotFoundException(electronics + "수정할 모델번호가 존재하지 않습니다.");
	}
	
	// 삭제
	@Override
	public void delete(int modelNo) throws SearchNotFoundException {
		Electronics dbElec = this.searchByModelNo(modelNo);
		list.remove(dbElec);
		if(dbElec == null) {
			throw new SearchNotFoundException(modelNo +" 삭제할 모델번호가 존재하지 않습니다.");
		}
		/*Electronics target = null;
		for(Electronics e : list) {
			if(e.getModelNo() == modelNo) {
				target = e;
				break;
			}
		}
		if(target == null) {
			throw new SearchNotFoundException(modelNo +" 삭제할 모델번호가 존재하지 않습니다.");
		}
		list.remove(target);
		*/
	}
	
	/**
     *  가격을 기준으로 정렬하기
     *  만약, 가격이 같으면 modelNo를 기준으로 정렬한다.
     * @return
     */
	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> copyList = new ArrayList<>(list);
		
		//funcional interface를 람다식으로
		copyList.sort((e1, e2) -> {
    		if(e1.getModelPrice() == e2.getModelPrice()) { //가격이 같으면 높은가격이 우선으로 나오도록
    			return e2.getModelPrice() - e1.getModelPrice(); //내림차순
    		}
			return e1.getModelPrice() - e2.getModelPrice(); //오름차순
    	});
		
		return copyList;
	}
    
} // 클래스 끝 