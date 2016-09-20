package prob6;

public class MyBase extends Base{
	//오버라이드 2번

	@Override
	public void service(String state){
		if(state.equals("낮")){
			day();
		}else if(state.equals("밤")){
			night();
		}else{
			after();
		}
		//super.service(state); //Base에 부모가 돌아가게끔
	}
	
	@Override
	public void day(){
		System.out.println("낮에는 열심히 일하자");
	}
	

	public void after(){
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}

