package week3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="i am learning java and selenium from last month";
           int count =0;
           String words[]=text.split("");
           for (int i=0;i<words.length;i++)
           {
        	   for(int j=i+1;j<words.length;j++)
        	   
        	   {
        		   if((words[i].equalsIgnoreCase(words[j])))
        		   {
        			   count=count+1;
        			   words[j]="";
        			   }
        	   }
           }
        		   if(count>1)
        		   for(int k=0;k<words.length;k++)
        		   {
        			   System.out.print(words[k]+"  ");
        		   }
	}
}