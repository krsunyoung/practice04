package prob1;

public class StringUtil {
	
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	//concat / opperCase? 출력물을 대문자로
    	//String s = "123";
    	//s.concat("456");
    	//System.out.println(s);
    	//	>>123
    	//String s1=s.concat("456");
    	//	>>123456
    	
    	String temp = "" ;
    	for(int i =0; i<str.length;i++){
    		temp = temp.concat(str[i]);
    		//temp += str[i] 위와 동일
    	}
    	
    	return temp;
 
 
    }
}

