#include<bits/stdc++.h>
using namespace std;
struct nodo{
    nodo * anterior;
    int valor,
        menor;
    nodo(){
        anterior=NULL;
    }
    nodo(int valor,int menor){
        this->valor=valor;
        this->menor=menor;
    }
};
struct pila{
    nodo *actual;
    pila(){
        actual=NULL;
    }
    bool IsEmpty(){
        return actual==NULL;
    }
    int top(){
        return actual->valor;
    }
    int menor(){
        return actual->menor;
    }
    void push(int valor){
        int menor=valor;
        if(!IsEmpty()){
            menor=min(actual->menor,valor);
        }
        nodo* tmp=new nodo(valor,menor);//Creamos el nuevo actual
        tmp->anterior=actual;// asignamos el actual al anterior del nuevo
        actual=tmp;//Asignamos el temporar como nuevo actual
       // delete tmp;//Borramos el temproal
    }
    void pop(){
        nodo* tmp=actual;//Guardamos el actual
        actual=actual->anterior;//Remplazamos el actual con el anteriro
        delete tmp;//Borra el viejo axtyual

    }
};
int main(){
    pila s;
    int n,aux;
    cin>>n;
    //cout<<"---"<<endl;
    for(int i=0;i<n;i++){
        cin>>aux;
        s.push(aux);
    }
    // for(int i=0;i<10;i++){
    //     q.push1(i);
    // }
    while(!s.IsEmpty()){
        printf("cabeazal %d menor %d\n",s.top(),s.menor());
        s.pop();

    }
    printf("%d\n",s.IsEmpty());
    return 0;
}