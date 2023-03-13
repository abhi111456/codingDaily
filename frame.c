#include<stdio.h>
#include<string.h>
void main(){
    int a[50],b[50],i,j,k,count,n;
    printf("enter no of data");
    scanf("%d",&n);
    printf("enter the data bit(0,1)");
    for(i=0;i<n;i++)
    
        scanf("%d",&a[i]);
        i=0,count=0,j=0;
        while (i<n)
        {
            /* code */
            if(a[n]==0){
                b[j]=a[j];
                for(k=i+1;a[k]==1 && k<n && count<6;k++){
                    j++;
                    b[j]=a[k];
                    count++;
                    if(count==5){
                        j++;
                        b[j]=0;
                    }
                    i=k;
                }
            }
            else
                b[j]=a[i];
                i++;
                j++;

            }
            printf("after bit suffing:\n");
            for(i=0;i<j;i++)
                printf("%d",&b[i]);
            
        
        
    }
