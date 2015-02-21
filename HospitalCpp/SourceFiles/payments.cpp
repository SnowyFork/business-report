//By Chauke A.

#include <iostream>
#include <iomanip>
#include <string>

#include "Hospital.h"

using namespace std;

void printtitle();
void printheader();
void printthecount();

int main()
{
	int fix;

	cout << "welcome to the hospital bills simulator! it is $355 per day\n\n";

	Hospital patient1("GS1234", "Greg", 3);
	Hospital patient2("JN5665", "John", 12);
	Hospital patient3("SG6532", "Sally", 14);
	Hospital patient4("CD7467", "Carol", 2);
	Hospital patient5("KA6234", "Kim", 1);
	Hospital patient6("TJ3278", "Tom", 7);
	Hospital patient7("YP3421", "Jack", 6);

	printtitle();
	printheader();

	patient1.compute();
	patient1.printdata();

	patient2.compute();
	patient2.printdata();

	patient3.compute();
	patient3.printdata();

	patient4.compute();
	patient4.printdata();

	patient5.compute();
	patient5.printdata();

	patient6.compute();
	patient6.printdata();

	patient7.compute();
	patient7.printdata();

	cout << endl;

	printthecount();

	cin >> fix;

	return 0;
}

void printtitle()
{
	cout << setw(30) << "hospital bills" << endl;
}

void printheader()
{
	cout << "ID" << setw(14) << "Name" << setw(10) << "Days" << setw(15) << "Amount due" << endl;
}

void printthecount()
{
	int count2 = Hospital::getcount();
	cout << "the total number of patients is " << count2 << endl;
}
