package assignment;

public class Pattern2 {

	public static void main(String[] args) {
		int n=13;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||j==n||i+j<=n/2+2||j-i>=n/2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
