class Mat{

	public static void main(String a[])
	{
		int n = 2;
		int[][] mat1 = {{1,2},{3,4}};
		int[][] mat2 = {{5,6},{7,8}};
		int[][] sum = {{0,0},{0,0}};
		int[][] prod = {{0,0},{0,0}};

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum[i][j] += (mat1[i][j] + mat2[i][j]);
			}
		}

		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
				prod[i][j] = 0;
                                for(int k=0;k<n;k++)
				{
					prod[i][j] += mat1[i][k]*mat2[k][j];
				}
                        }
                }

		System.out.println("Addition: ");
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.print(sum[i][j]+" ");
                        }
			System.out.println();
                }
		System.out.println("Multiplication: ");
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.print(prod[i][j]+" ");
                        }
                        System.out.println();
                }

	}
}
