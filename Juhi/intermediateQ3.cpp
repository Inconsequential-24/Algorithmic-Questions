#include <bits/stdc++.h>
using namespace std;

int main(){
	vector<int> s = {2,7,11,15};
	int n = 17;
	for(int i = 0 ; i< s.size();i++){

		for(int j = i +1 ; j <s.size();j++){
			if(s[i] + s[j] == n){
				cout << i << " " << j;
			}
		}
	}


}
