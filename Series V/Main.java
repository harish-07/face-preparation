#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,start=11;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<start*start<<" ";
    start=start+4;
  }
    
}