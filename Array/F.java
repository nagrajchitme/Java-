package Array;

import java.util.Arrays;
import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		int[]m=new int[10];
		System.out.println("enter any number ");
		
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			m[i]=s.nextInt();
				System.out.println();
			}
			Arrays.sort(m);
			System.out.println();
				for(int N : m) {
					System.out.println(N);
				}
			}
		}
		


