#include<stdio.h>
main()
{
    int arr[]={2,4,5,9,4,10,15};
    int beg=0,end=7,mid,n,flag=0;
    scanf("%d",&n);
    while(beg<end){
        mid=(beg+end)/2;
        if(n<arr[mid]){
            end=mid-1;
        }
        else if(n>arr[mid]){
            beg=mid+1;
        }
        else{
            printf("element at %d",mid+1);
            flag=1;
            break;
        }
    }
    if(flag==0)
    printf("element not found");
}
