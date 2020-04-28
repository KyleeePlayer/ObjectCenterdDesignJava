package exceptionStudy;

public class ThrowsEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThrowsEx ex = new ThrowsEx();
		ex.doA();
	}
	
	public void doA() throws Exception{
		doB();
	}
	public void doB() throws Exception{
		doC();
	}
	public void doC() throws Exception{
		//Exception이 발생할 코드
	}

}
	