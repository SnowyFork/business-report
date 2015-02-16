#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

double rank1(double grades[], double total2, int a, const int fix1);
double higher (double grades[], int c, const int fix1);

int main ()
{
	const int fix1=14;
	double grades[fix1] = {90, 95, 60, 81, 100, 30, 57, 90, 92, 68, 79, 87, 95, 74};
	double total1=0, highgrade, deevii[fix1]={0}, fix;
	int a=0, b=0, c=0;

	cout << "welcome to the grade average calculator! \n";

	cout << "the grades are ";
	for(b=0; b < fix1; b++)
	{
		cout << grades[b] << setw(4);
	}

	total1 = rank1(grades, total1, a, fix1);
	cout << "\n\nThe grade average is " << total1 << endl;
	highgrade = higher(grades, c, fix1);
	cout << "the highest grade is " << highgrade << endl;

	cout << "here is the standard deviation: \n";

	cout << "grades " << setw(15) << " deviation " << endl;
	for(b=0; b < fix1; b++)
	{
		deevii[b] = grades[b] - total1;
		cout << setw(3) << grades[b] << setw(18) << deevii[b] << endl;
	}

	cin >> fix;

	return 0;
}

double rank1(double grades[], double total2, int a, const int fix1)
{
	for(a=0; a < fix1; a++)
	{
		total2 = total2 + grades[a];
	}

	total2 = total2 / fix1;
	return total2;
}

double higher (double grades[], int c, const int fix1)
{
	double maxed = grades[0];
	for(c=0; c < fix1; c++)
	{
		if(grades[c] > maxed)
		{
			maxed = grades[c];
		} 
	}
	return maxed;
}
