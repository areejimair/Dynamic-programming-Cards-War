package dynamic;
import java.util.ArrayList;
import java.util.Scanner;

class card_game{
 public int maxScore(ArrayList<Integer> a, int n, int i, int j)
{
    if(i == j)
        return a.get(i);
    if( j == i+1)
        return max(a.get(i),a.get(j));
        
    return max(a.get(i) + min(maxScore(a,n,i+2, j), maxScore(a,n,i+1, j-1) ), 
                   a.get(j) + min(maxScore(a,n,i+1, j-1), maxScore(a,n,i, j-2) )); 

}
 public int max(int a, int b) { 
	if(a>b)
			 return a; 
			 return b; 
			 }
 public int min(int a, int b) { 
	if(a<b)
			 return a; 
			 return b; 
			 }
 
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scaner=new Scanner(System.in);
         System.out.print("Enetr the size of the number of cards: ");
         int num=scaner.nextInt();
        ArrayList<Integer> cards=new ArrayList<Integer>();
        for(int i=0;i<num;i++) {
        	 Scanner scaner1=new Scanner(System.in);
        	 int num1=scaner.nextInt();
        	 cards.add(num1);
        }
     
       
        card_game c=new card_game();
        int max=c.maxScore(cards, num, 0, num-1);
     System.out.println("max score is: "+max); 
	}
}
