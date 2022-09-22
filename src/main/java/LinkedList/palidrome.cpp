#include<bits/stdc++.h>

using namespace std;

list<char> myList;

list<char>::iterator it;
list<char>::iterator it2;

bool palidrome(){

    it=myList.begin();
    it2=myList.end();
    it2--;

    while(it!=myList.end()){

        if(*it!=*it2){
            return false;
        }
        it++;
        it2--;
    }
    return true;
}

int main(){

    string cad;

    cin>>cad;

    for(int i=0;i<cad.size();i++){
        myList.push_back(cad[i]);
    }
    cout<<palidrome()<<endl;

    return 0;
}
