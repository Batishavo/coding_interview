#include<bits/stdc++.h>

using namespace std;

list<int> myList;
list<int>::iterator it;

map<int,bool>myMap;

void eraseDub(){

    it= myList.begin();

    while(it!= myList.end()){

        //printf("%d\n",*it);

        if(myMap[*it]==0){
            myMap[*it]=1;

          //  printf("YY");
        }
        else{
            myList.erase(it);
           // printf("XX");
        }
        ++it;

    }

}

int main(){

    int n,aux;

    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        myList.push_back(aux);
    }
    printf("--\n");
    eraseDub();
    for(auto x: myList){
        cout<<x<<endl;
    }

    return 0;
}
