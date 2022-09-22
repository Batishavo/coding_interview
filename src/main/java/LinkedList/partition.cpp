#include<bits/stdc++.h>

using namespace std;

list<int> myList;
list<int>::iterator it;

void partitionList(int num){

    list<int> aux;

    it= myList.begin();

    while(it!= myList.end()){

        if(*it<num){
            aux.push_front(*it);
        }
        else{
            aux.push_back(*it);
        }
        ++it;
    }
    myList=aux;
}

int main(){

    int n,aux,num;

    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        myList.push_back(aux);
    }
    printf("--\n");
    partitionList(5);
    for(auto x: myList){
        cout<<x<<" ";
    }
    cout<<endl;

    return 0;
}
