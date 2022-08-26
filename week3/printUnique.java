package week3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class printUnique {

			public static void main(String[] args) {
				String str="ABCBA";
				char[] a=str.toCharArray();
				Set<Character>ch=new HashSet<Character>();
				for(Character data :a) {
					ch.add(data);
				}
				System.out.println(ch);
				
				List<Character>list=new ArrayList<Character>(ch);
				for(int i=0;i<list.size();i++)
				{ int count=0;
					for(int j=0; j<a.length;j++)
					{
						if(list.get(i)==a[j])
						{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(list.get(i));
				}
				}
			}

		}
	
		
		
		
		
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
