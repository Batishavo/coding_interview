#include<bits/stdc++.h>

using namespace std;

list<int> myList;
list<int>::iterator it;

map<int,bool>myMap;

int eraseKthLast(int num){

    int cont=1;

    it= myList.begin();

    while(it!= myList.end()){

        if(num==cont){
            return *it;
        }
        ++it;
        cont++;

    }
    return -1;

}

int main(){

    int n,aux,kth,tam;

    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        myList.push_back(aux);
    }
    scanf("%d",&kth);
    tam=myList.size();
    int num=tam-kth;
    printf("%d \n",eraseKthLast(num));

    return 0;
}
