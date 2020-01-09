#include<iostream>

using namespace std;

int main(){
	
	int a[5];
	int n;
	int mayor=0;
	int menor;
	
	
	for(int i=0; i<=4; i++){
	cout<<"Introduce un numero "<<i<<" :" ;
	cin>>n;
	
	a[i]=n;	
	
	if(a[i] >= mayor ){
		mayor=a[i];
	}
		
	}
	
	menor=a[0];
	for(int e=0; e<=4; e++){
		
		if(a[e] <= menor){
		menor= a[e];
	}
	
	}
	
	int distancia;
	
	distancia= mayor- menor;
	
	cout<<"La distancia que hay entre los dos numero es: "<<distancia<<endl;
	
	
	
	cout<<"Mayor: "<< mayor<<endl;
	cout<<"Menor: "<<menor<<endl;
}
