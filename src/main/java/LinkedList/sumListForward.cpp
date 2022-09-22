#include<bits/stdc++.h>

using namespace std;

list<int> num1;
list<int> num2;

list<int>::iterator it;

int number(list<int> actual){

    it=actual.end();
    it--;
    int pot  = 1,
        suma = 0;

    while(it!=actual.end()){
        //printf("%d\n",*it);
        suma+=*it*pot;
        pot*=10;
        it--;

    }
    //printf("%d \n",suma);
    return suma;
}


void suma_reverse(){

    list<int>salida;

    int suma=number(num1)+number(num2);
    //printf("---\n");
    while(suma>0){

        int actual=suma%10;
        suma/=10;
        salida.push_front(actual);

    }

    for(auto x: salida){
        cout<<x;
    }
    cout<<endl;
}

int main(){

    int n,aux,num;

    scanf("%d",&n);

    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        num1.push_back(aux);
    }
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&aux);
        num2.push_back(aux);
    }
    suma_reverse();

    return 0;
}
