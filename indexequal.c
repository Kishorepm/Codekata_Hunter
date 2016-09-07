#include <stdio.h>
int main(void) {
    int n;
    printf("Enter number of values:\n ");
    scanf("%d",&n);
	int a[n],i;
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
			for(i=0;i<n;i++)
		{
		    if(a[i]==i)
		    {
		       printf("%d\n",a[i]);
		    }
		}
}

