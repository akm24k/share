#include <iostream>
using namespace std;

void f(string s) { cout<<"string: "<< s <<endl; }
void f(char *s) { cout<<"char*: "<< s <<endl; }

int main()
{
	char s[] = "你怎么傻fufu的?";
	f(s);
	f(string(s));
}

