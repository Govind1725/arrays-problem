 long a[] = new long[n];
       if(n==1){
           a[0]=1;
           return a;
       }
       else{
           a[0]=1;
           a[1]=1;
           
           for(int i=2; i<n; i++){
               a[i]= a[i-1]+a[i-2];
           }
           
       }
       return a ;
           
