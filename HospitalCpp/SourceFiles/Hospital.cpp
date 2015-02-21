//By Chauke A.

#include <iostream>
#include <iomanip>
#include <string>

#include "Hospital.h"

using namespace std;

double Hospital::rent=355;
int Hospital::count=0;

Hospital::Hospital(string ID2, string nam, double dayz)
{
	ID = ID2;
	name = nam;
	days = dayz;
}

void Hospital::compute()
{
	amountdue = rent * days;
	count++;
}

int Hospital::getcount()
{
	return count;
}

void Hospital::printdata()
{
	cout << ID << setw(10) << name << setw(10) << days << setw(10) << amountdue << endl;
}
