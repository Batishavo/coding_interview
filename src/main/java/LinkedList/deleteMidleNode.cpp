#include<bits/stdc++.h>

using namespace std;

list<int> myList;
list<int>::iterator it;

int deleteMidelNod(){

    int mid=myList.size()/2,
        cont=1;

    it= myList.begin();

    while(it!= myList.end()){

        if(cont==mid){

            if(myList.size()%2==0){
                myList.erase(next(it));
                myList.erase(it);
            }
            else{
                myList.erase(next(it));
            }
            break;
        }

        ++it;
        cont++;

    }
    return -1;

}

int main(){

    int n,aux;

    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        myList.push_back(aux);
    }
    printf("--\n");
    eraseMidleNode();
    for(auto x: myList){
        cout<<x<<" ";
    }
    cout<<endl;

    return 0;
}

