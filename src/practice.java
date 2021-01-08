import java.io.File;
import java.util.*;

public class practice {
	public static void main(String[] args) {

		
	public static String straightCheck(Card[] chArr){
		//1."STRAIGHT" -  카드의 숫자가 연속인 경우. 1,2,3,4,5 또는 5,6,7,8,9
		int[] kindCount = new int[4];
		int[] numberCount = new int[13];

		for(int i=0; i<chArr.length; i++){
			kindCount[chArr[i].kind-1]++;
			numberCount[chArr[i].number-1]++;
		}

		//숫자 조건 어떻게?

		boolean result1 = true;
		boolean result2 = true;

		for(int i=0; i<5; i++){ if (numberCount[i]!=1) result1 = result1 && false; }
		for(int i=3; i<7; i++){ if (numberCount[i]!=1) result2 = result2 && false; }
//        if((numberCount[0]==1 &&
//                numberCount[1]==1 &&
//                numberCount[2]==1 &&
//                numberCount[3]==1 &&
//                numberCount[4]==1 ||
//
//                numberCount[4]==1 &&
//                        numberCount[5]==1 &&
//                        numberCount[6]==1 &&
//                        numberCount[7]==1 &&
//                        numberCount[8]==1))
		if(result1 || result2)
			return "STRAIGHT";
		else return "NOT STRAIGHT";


		//10. "FULL HOUSE" -

	} //end of method straightCheck

}  //end of class



