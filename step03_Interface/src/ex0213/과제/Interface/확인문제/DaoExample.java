package ex0213.과제.Interface.확인문제;

interface DataAccessObject {
	public void dbWork();

	public void select();
	public void insert();
	public void update();
	public void delete();
}

public class DaoExample {
	
	public static class OracleDao implements DataAccessObject {
		@Override
		public void dbWork() {}
		public void select() {
			System.out.println("Oracle DB에서 검색");
		}
		public void insert() {
			System.out.println("Oracle DB에서 삽입");
		}
		public void update() {
			System.out.println("Oracle DB에서 수정");
		}
		public void delete() {
			System.out.println("Oracle DB에서 삭제");
		}
	}
	public static class MysqlDao implements DataAccessObject {
		@Override
		public void dbWork() {}
		public void select() {
			System.out.println("Mysql DB에서 검색");
		}
		public void insert() {
			System.out.println("Mysql DB에서 삽입");
		}
		public void update() {
			System.out.println("Mysql DB에서 수정");
		}
		public void delete() {
			System.out.println("Mysql DB에서 삭제");
		}
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
