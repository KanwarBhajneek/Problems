import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
	public String largestNumber(final List<Integer> a) {
    
    String s[]=new String[a.size()];
    for(int i=0;i<a.size();i++){
        s[i]=String.valueOf(a.get(i));
    }
    
    Arrays.sort(s,new Comparator<String>(){
		@Override
		public int compare(String s1, String s2) {
			String c1=s1+s2;
            String c2=s2+s1;
            return -c1.compareTo(c2);
		}
    });
    StringBuilder sb=new StringBuilder();
    
    for(String str:s){
        sb.append(str);
    }
    while(sb.charAt(0)=='0'&&sb.length()>1){
    	sb.deleteCharAt(0);
    }
    return sb.toString();
	}
}

